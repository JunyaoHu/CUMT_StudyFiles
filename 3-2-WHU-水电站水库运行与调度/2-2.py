import pandas as pd
import numpy as np
from scipy import interpolate
from scipy.optimize import minimize

filename = 'data.xls'  # 文件路径
volumeAndWaterLevel = pd.read_excel(filename, sheet_name='水位库容曲线')  # 读取excel数据：库容水位曲线
volume = volumeAndWaterLevel.iloc[:, 0]  # 库容
waterLevel = volumeAndWaterLevel.iloc[:, 1]  # 水位
volume_waterLevel = np.poly1d(np.polyfit(volume, waterLevel, 3))  # 用3次多项式[拟合]volume, waterLevel，有多个x出现不要用插值！！！！！

tailWaterLevelAndOutQuantity = pd.read_excel(filename, sheet_name='尾水位流量曲线')  # 读取excel数据：尾水位流量曲线
outQuantity = tailWaterLevelAndOutQuantity.iloc[:, 0]  # 出库流量
tailWaterLevel = tailWaterLevelAndOutQuantity.iloc[:, 1]  # 尾水位
outQuantity_tailWaterLevel = interpolate.interp1d(outQuantity, tailWaterLevel, kind='linear')  # 尾水位流量插值

waterHeadLossAndGenerateQuantity = pd.read_excel(filename, sheet_name='水头损失曲线')  # 读取excel数据：水头损失曲线
generateQuantity = waterHeadLossAndGenerateQuantity.iloc[:, 0]  # 单机发电流量流量
waterHeadLoss = waterHeadLossAndGenerateQuantity.iloc[:, 1]  # 水头损失
generateQuantity_waterHeadLoss = interpolate.interp1d(generateQuantity, waterHeadLoss, kind='linear')  # 水头损失插值

# 计算初始固定条件，获得初始水位，查表获得初始库容
STU_NUM = 5
Z0 = 160 + STU_NUM / 10.0  # 初始水位 = 160.5
Qin = 6000 + STU_NUM * 10  # 入库流量 = 6050
Qout = 3000 + STU_NUM * 10  # 出库流量 = 3050

# 查找初始水位对应库容
V0 = (volumeAndWaterLevel.iloc[volumeAndWaterLevel[(volumeAndWaterLevel["水位"] == Z0)].index, 0]).tolist()[0]
print("初始水位对应库容", V0)  # 初始水位对应库容 =  265.573

# 计算最终库容结果，根据拟合结果得出最终水位
V_final = (Qin - Qout) * 15 * 60 / 10 ** 8 + V0  # 时段末库容
WaterLevel_final = volume_waterLevel(V_final)  # 上游水位
print("最终上游水位", WaterLevel_final)

# 计算出库流量对应尾水位
TailWaterLevel_final = outQuantity_tailWaterLevel(Qout)
print("出库流量对应尾水位", TailWaterLevel_final)  # 出库流量对应尾水位 = 63.08

# 流量列表及其实际水头列表
QuantityList = []
RealWaterHeadList = []

# 用于发电的最大流量和最小流量
MAX_QUANTITY = 700
MIN_QUANTITY = 400

# 最大出力和最小出力
MIN_OUTPUT = 40
MAX_OUTPUT = 76


# 根据发电流量，计算出实际水头
def quantity_realWaterHead(quantity):
    waterHeadLoss_final = generateQuantity_waterHeadLoss(quantity)
    tailWaterLevel_final = outQuantity_tailWaterLevel(quantity)
    return WaterLevel_final - tailWaterLevel_final - waterHeadLoss_final


def NHQ(filename, sheet_name):
    data = pd.read_excel(filename, sheet_name)  # 读取excel数据
    h = data.iloc[:, 1]  # x1水头
    q = data.iloc[:, 3]  # x2流量
    n = data.iloc[:, 2]  # y出力
    return interpolate.Rbf(h, q, n, kind='mutiquadric')  # 二次插值


# 31100501型机组
NHQ05 = NHQ(filename, '1型机组')
# 31100601型机组
NHQ06 = NHQ(filename, '2型机组')
# 31100401型机组
NHQ04 = NHQ(filename, '3型机组')

"""
比动态规划的效果更好
动态规划后，求得出力最大时各机组流量和出力如下： [669, 469, 471, 471, 489, 481] [40.150769115275125, 40.150769115275125, 40.08889032470552, 40.08889032470552, 41.591354017274284, 40.620778135772156]
总出力为： 242.69145103300772 亿kw
使用SQP(Sequential Quadratic Programming)方法的线性规划得到的结果是263.6961750551174
"""
# 初始条件：x0是把Qout平均给每个机器，流量相同
MACHINE_NUM = 6
xInitial = [Qout/MACHINE_NUM] * MACHINE_NUM
print("x0:", xInitial)

# 目标函数 转换成 min 函数加上了负号， 每项的意思是 给定x流量，计算出出力，如果出力不在有效范围内，取为0，否则保持为预测值，把六个分量加和
func = lambda x: \
    -(NHQ05(quantity_realWaterHead(x[0]), x[0]) if MIN_OUTPUT <= NHQ05(quantity_realWaterHead(x[0]), x[0]) <= MAX_OUTPUT else 0 +
      NHQ05(quantity_realWaterHead(x[1]), x[1]) if MIN_OUTPUT <= NHQ05(quantity_realWaterHead(x[1]), x[1]) <= MAX_OUTPUT else 0 +
      NHQ06(quantity_realWaterHead(x[2]), x[2]) if MIN_OUTPUT <= NHQ06(quantity_realWaterHead(x[2]), x[2]) <= MAX_OUTPUT else 0 +
      NHQ06(quantity_realWaterHead(x[3]), x[3]) if MIN_OUTPUT <= NHQ06(quantity_realWaterHead(x[3]), x[3]) <= MAX_OUTPUT else 0 +
      NHQ04(quantity_realWaterHead(x[4]), x[4]) if MIN_OUTPUT <= NHQ04(quantity_realWaterHead(x[4]), x[4]) <= MAX_OUTPUT else 0 +
      NHQ04(quantity_realWaterHead(x[5]), x[5]) if MIN_OUTPUT <= NHQ04(quantity_realWaterHead(x[5]), x[5]) <= MAX_OUTPUT else 0)

# 约束条件，有 sigma xi = Qout ，还有各个流量分量预测出来的出力要在有效范围内 eq是=条件，ineq是 >= 条件
cons = ({'type': 'eq', 'fun': lambda x: x[0] + x[1] + x[2] + x[3] + x[4] + x[5] - Qout},
        {'type': 'ineq', 'fun': lambda x: NHQ05(quantity_realWaterHead(x[0]), x[0]) - MIN_OUTPUT},
        {'type': 'ineq', 'fun': lambda x: NHQ05(quantity_realWaterHead(x[1]), x[1]) - MIN_OUTPUT},
        {'type': 'ineq', 'fun': lambda x: NHQ06(quantity_realWaterHead(x[2]), x[2]) - MIN_OUTPUT},
        {'type': 'ineq', 'fun': lambda x: NHQ06(quantity_realWaterHead(x[3]), x[3]) - MIN_OUTPUT},
        {'type': 'ineq', 'fun': lambda x: NHQ04(quantity_realWaterHead(x[4]), x[4]) - MIN_OUTPUT},
        {'type': 'ineq', 'fun': lambda x: NHQ04(quantity_realWaterHead(x[5]), x[5]) - MIN_OUTPUT},
        {'type': 'ineq', 'fun': lambda x: MAX_OUTPUT - NHQ05(quantity_realWaterHead(x[0]), x[0])},
        {'type': 'ineq', 'fun': lambda x: MAX_OUTPUT - NHQ05(quantity_realWaterHead(x[1]), x[1])},
        {'type': 'ineq', 'fun': lambda x: MAX_OUTPUT - NHQ06(quantity_realWaterHead(x[2]), x[2])},
        {'type': 'ineq', 'fun': lambda x: MAX_OUTPUT - NHQ06(quantity_realWaterHead(x[3]), x[3])},
        {'type': 'ineq', 'fun': lambda x: MAX_OUTPUT - NHQ04(quantity_realWaterHead(x[4]), x[4])},
        {'type': 'ineq', 'fun': lambda x: MAX_OUTPUT - NHQ04(quantity_realWaterHead(x[5]), x[5])})

# 使用SLSQP方法计算结果
res = minimize(func, xInitial, method='SLSQP', constraints=cons)

# 结果的展示
print(res.success, res.x.tolist(), res.status)
res_list = [NHQ05(quantity_realWaterHead(res.x[0]), res.x[0]),
            NHQ05(quantity_realWaterHead(res.x[1]), res.x[1]),
            NHQ06(quantity_realWaterHead(res.x[2]), res.x[2]),
            NHQ06(quantity_realWaterHead(res.x[3]), res.x[3]),
            NHQ04(quantity_realWaterHead(res.x[4]), res.x[4]),
            NHQ04(quantity_realWaterHead(res.x[5]), res.x[5])]
print(sum(res_list), res_list)




#
# x0: [443.7007765312391, 536.4781013542064, 631.2351416977067, 611.6539680802084, 619.5876919099767, 530.0543304686212]
# 59.19221957351182 True [648.4509607325189, 479.1348700427639, 484.18328398637635, 484.51417614107913, 476.85835454866634, 476.8583545485957] 0
# 59.19221957351182
# 40.99999999999602
# 41.0000003071054
# 41.03990170004841
# 40.99999999999727
# 41.00000000000182



