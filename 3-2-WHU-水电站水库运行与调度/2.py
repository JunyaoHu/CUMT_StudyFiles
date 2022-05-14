import math
import random

import pandas as pd
import numpy as np
from scipy import interpolate

filename = 'data.xls'  # 文件路径
volumeAndWaterLevel = pd.read_excel(filename, sheet_name='水位库容曲线')  # 读取excel数据：库容水位曲线
volume = volumeAndWaterLevel.iloc[:, 0]  # 库容
waterLevel = volumeAndWaterLevel.iloc[:, 1]  # 水位
# volume_waterLevel = interpolate.interp1d(volume, waterLevel, kind='linear')  # 水位库容插值
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
MAX_QUANTITY = 840
MIN_QUANTITY = 460

# 最大出力和最小出力
MIN_OUTPUT = 40
MAX_OUTPUT = 76


# 根据发电流量，计算出实际水头
def quantity_realWaterHead(quantity):
    waterHeadLoss_final = generateQuantity_waterHeadLoss(quantity)
    tailWaterLevel_final = outQuantity_tailWaterLevel(quantity)
    return WaterLevel_final - tailWaterLevel_final - waterHeadLoss_final


# # 根据 MIN_QUANTITY 到 MAX_QUANTITY 的发电流量列表，计算出实际水头列表
# for i in range(MAX_QUANTITY - MIN_QUANTITY):
#     QuantityList.append(i + MIN_QUANTITY)
#     waterHeadLoss_final = generateQuantity_waterHeadLoss(QuantityList)
#     TailWaterLevel_final = outQuantity_tailWaterLevel(QuantityList)
#     RealWaterHeadList.append(WaterLevel_final - TailWaterLevel_final[i] - waterHeadLoss_final[i])

# # 部分计算结果展示，查看实际水头
# for i in range(0, len(QuantityList), 100):
#     print("发电流量:", QuantityList[i], "实际水头:", RealWaterHeadList[i])


def NHQ(filename, sheet_name):
    data = pd.read_excel(filename, sheet_name)  # 读取excel数据
    h = data.iloc[:, 1]  # x1水头
    q = data.iloc[:, 3]  # x2流量
    n = data.iloc[:, 2]  # y出力
    return interpolate.Rbf(h, q, n, kind='mutiquadric')  # 二次插值

    # N = f(RealWaterHeadList, QuantityList)  # 计算y估计出力
    # NHQ = []
    # # for i in range(MIN_QUANTITY):
    # #     NHQ.append([96, i, 0])
    # for i in range(MAX_QUANTITY - MIN_QUANTITY):
    #     if MIN_OUTPUT <= N[i] <= MAX_OUTPUT:  # 出力在 40-76 之间
    #         # NHQ.append([RealWaterHeadList[i], QuantityList[i], N[i]])
    #         NHQ.append(N[i])
    #     else:
    #         # NHQ.append([RealWaterHeadList[i], QuantityList[i], 0])
    #         NHQ.append(0)
    # # for i in range(MAX_QUANTITY, Qout+1):
    # #     NHQ.append([96, i, 0])
    # return NHQ


# 31100501型机组
NHQ05 = NHQ(filename, '1型机组')
# 31100601型机组
NHQ06 = NHQ(filename, '2型机组')
# 31100401型机组
NHQ04 = NHQ(filename, '3型机组')

# NHQlist = [NHQ05, NHQ05, NHQ06, NHQ06, NHQ04, NHQ04]

"""
动态规划后，求得出力最大时各机组流量和出力如下： [669, 469, 471, 471, 489, 481] [40.150769115275125, 40.150769115275125, 40.08889032470552, 40.08889032470552, 41.591354017274284, 40.620778135772156]
总出力为： 242.69145103300772 亿kw
"""

MACHINE_NUM = 6


# 定义优化问题的目标函数
def cal_Energy(x, mk):  # m(k)：惩罚因子，随迭代次数 k 逐渐增大
    # p01 = (max(0, -x[0] + MIN_QUANTITY)) ** 2
    # p02 = (max(0, -x[1] + MIN_QUANTITY)) ** 2
    # p03 = (max(0, -x[2] + MIN_QUANTITY)) ** 2
    # p04 = (max(0, -x[3] + MIN_QUANTITY)) ** 2
    # p05 = (max(0, -x[4] + MIN_QUANTITY)) ** 2
    # p06 = (max(0, -x[5] + MIN_QUANTITY)) ** 2
    # p07 = (max(0, x[0] - (MAX_QUANTITY - 1))) ** 2
    # p08 = (max(0, x[1] - (MAX_QUANTITY - 1))) ** 2
    # p09 = (max(0, x[2] - (MAX_QUANTITY - 1))) ** 2
    # p10 = (max(0, x[3] - (MAX_QUANTITY - 1))) ** 2
    # p11 = (max(0, x[4] - (MAX_QUANTITY - 1))) ** 2
    # p12 = (max(0, x[5] - (MAX_QUANTITY - 1))) ** 2
    p13 = (sum(x) - Qout) ** 2
    f1 = NHQ05(quantity_realWaterHead(x[0]), x[0]) \
        if MIN_OUTPUT < NHQ05(quantity_realWaterHead(x[0]), x[0]) < MAX_OUTPUT else 0
    f2 = NHQ05(quantity_realWaterHead(x[1]), x[1]) \
        if MIN_OUTPUT < NHQ05(quantity_realWaterHead(x[1]), x[1]) < MAX_OUTPUT else 0
    f3 = NHQ06(quantity_realWaterHead(x[2]), x[2]) \
        if MIN_OUTPUT < NHQ06(quantity_realWaterHead(x[2]), x[2]) < MAX_OUTPUT else 0
    f4 = NHQ06(quantity_realWaterHead(x[3]), x[3]) \
        if MIN_OUTPUT < NHQ06(quantity_realWaterHead(x[3]), x[3]) < MAX_OUTPUT else 0
    f5 = NHQ04(quantity_realWaterHead(x[4]), x[4]) \
        if MIN_OUTPUT < NHQ04(quantity_realWaterHead(x[4]), x[4]) < MAX_OUTPUT else 0
    f6 = NHQ04(quantity_realWaterHead(x[5]), x[5]) \
        if MIN_OUTPUT < NHQ04(quantity_realWaterHead(x[5]), x[5]) < MAX_OUTPUT else 0
    fx = -(f1 + f2 + f3 + f4 + f5 + f6)
    # return fx + mk * (p01 + p02 + p03 + p04 + p05 + p06 + p07 + p08 + p09 + p10 + p11 + p12 + p13)
    return fx + mk * p13


# 模拟退火算法
def OptimizationSSA(nVar, xMin, xMax, t_0, t_final, alpha, meanMarkov, scale):
    # ====== 初始化随机数发生器 ======
    seed = random.randint(1, 100)
    random.seed(seed)  # 随机数发生器设置种子，也可以设为指定整数

    # ====== 随机产生优化问题的初始解 ======
    xInitial = np.zeros(nVar)  # 初始化，创建数组
    for v in range(nVar):
        # random.uniform(min,max) 在 [min,max] 范围内随机生成一个实数
        xInitial[v] = random.uniform(xMin[v], xMax[v])
    # 调用子函数 cal_Energy 计算当前解的目标函数值
    fxInitial = cal_Energy(xInitial, 1)  # m(k)：惩罚因子，初值为 1

    # ====== 模拟退火算法初始化 ======
    xNew = np.zeros(nVar)  # 初始化，创建数组
    xNow = np.zeros(nVar)  # 初始化，创建数组
    xBest = np.zeros(nVar)  # 初始化，创建数组
    xNow[:] = xInitial[:]  # 初始化当前解，将初始解置为当前解
    xBest[:] = xInitial[:]  # 初始化最优解，将当前解置为最优解
    fxNow = fxInitial  # 将初始解的目标函数置为当前值
    fxBest = fxInitial  # 将当前解的目标函数置为最优值
    print("f(x0):", fxInitial, "x0:", xInitial.tolist())
    print((sum(xInitial) - Qout) ** 2)

    recordIter = []  # 初始化，外循环次数
    recordFxNow = []  # 初始化，当前解的目标函数值
    recordFxBest = []  # 初始化，最佳解的目标函数值
    recordPBad = []  # 初始化，劣质解的接受概率
    kIter = 0  # 外循环迭代次数，温度状态数
    totalImprove = 0  # fxBest 改善次数
    nMarkov = meanMarkov  # 固定长度 Markov链

    # ====== 开始模拟退火优化 ======
    # 外循环，直到当前温度达到终止温度时结束
    tNow = t_0  # 初始化当前温度(current temperature)
    while tNow >= t_final:  # 外循环，直到当前温度达到终止温度时结束
        # 在当前温度下，进行充分次数(nMarkov)的状态转移以达到热平衡
        kBetter = 0  # 获得优质解的次数
        kBadAccept = 0  # 接受劣质解的次数
        kBadRefuse = 0  # 拒绝劣质解的次数

        # ---内循环，循环次数为Markov链长度
        for k in range(nMarkov):  # 内循环，循环次数为Markov链长度
            # ---产生新解
            # 产生新解：通过在当前解附近随机扰动而产生新解，新解必须在 [min,max] 范围内
            # 方案 :只对 n 元变量中的1个进行扰动，其它 n-1个变量保持不变

            xNew[:] = xNow[:]
            v = random.randint(0, nVar - 1)  # 产生 [0,nVar-1]之间的随机数
            xNew[v] = xNow[v] + scale * (xMax[v] - xMin[v]) * random.normalvariate(0, 1)
            # random.normalvariate(0, 1)：产生服从均值为0、标准差为 1 的正态分布随机实数
            xNew[v] = max(min(xNew[v], xMax[v]), xMin[v])  # 保证新解在 [min,max] 范围内

            # xNew[:] = xNow[:]
            # v = random.randint(0, nVar - 1)  # 产生 [0,nVar-1]之间的随机数
            # xNew[v] = xNow[v] + 0.1 * scale * random.randint(xMin[v] - int(xNow[v]), xMax[v] - int(xNow[v]))
            # v = random.randint(0, nVar - 1)  # 产生 [0,nVar-1]之间的随机数
            # fiveSum = 0
            # for i in range(nVar):
            #     if i != v:
            #         fiveSum += xNew[v]
            # xNew[v] = Qout - fiveSum
            # if xNew[v] >= xMax[v]:
            #     beta = random.random()
            #     xNew[v] = xMax[v]*(1-beta) + xNow[v]*beta
            # if xNew[v] < xMin[v]:
            #     beta = random.random()
            #     xNew[v] = xMin[v]*(1-beta) + xNow[v]*beta
            # print("**********", xNew.tolist())

            # ---计算目标函数和能量差
            # 调用子函数 cal_Energy 计算新解的目标函数值
            fxNew = cal_Energy(xNew, kIter)
            deltaE = fxNew - fxNow

            # ---按 Metropolis 准则接受新解
            # 接受判别：按照 Metropolis 准则决定是否接受新解
            if fxNew < fxNow:  # 更优解：如果新解的目标函数好于当前解，则接受新解
                accept = True
                kBetter += 1
            else:  # 容忍解：如果新解的目标函数比当前解差，则以一定概率接受新解
                pAccept = math.exp(-deltaE / tNow)  # 计算容忍解的状态迁移概率
                if pAccept > random.random():
                    accept = True  # 接受劣质解
                    kBadAccept += 1
                else:
                    accept = False  # 拒绝劣质解
                    kBadRefuse += 1

            # 保存新解
            if accept:  # 如果接受新解，则将新解保存为当前解
                xNow[:] = xNew[:]
                fxNow = fxNew
                if fxNew < fxBest:  # 如果新解的目标函数好于最优解，则将新解保存为最优解
                    fxBest = fxNew
                    xBest[:] = xNew[:]
                    totalImprove += 1
                    scale = scale * 0.90  # 可变搜索步长，逐步减小搜索范围，提高搜索精度

        # ---内循环结束后的数据整理
        # 完成当前温度的搜索，保存数据和输出
        if kBadAccept + kBadRefuse == 0:
            print("本轮无劣质解")
            recordPBad.append(round(0, 4))  # 劣质解的接受概率
        else:
            pBadAccept = kBadAccept / (kBadAccept + kBadRefuse)  # 劣质解的接受概率
            recordPBad.append(round(pBadAccept, 4))  # 劣质解的接受概率
        recordIter.append(kIter)  # 当前外循环次数
        recordFxNow.append(round(fxNow, 4))  # 当前解的目标函数值
        recordFxBest.append(round(fxBest, 4))  # 最佳解的目标函数值

        if kIter:  # 模运算，商的余数
            print('i:{:4}, t:{:6.2f}, badAcc:{:.4f}, f_best:{:15.4f}'.format(kIter, tNow, pBadAccept, fxBest), end=' ')
            print(xBest.tolist())
            print((sum(xBest) - Qout) ** 2)

        # 缓慢降温至新的温度，降温曲线：T(k)=alfa*T(k-1)
        tNow = tNow * alpha
        kIter = kIter + 1
        fxBest = cal_Energy(xBest, kIter)  # 由于迭代后惩罚因子增大，需随之重构增广目标函数
        # ====== 结束模拟退火过程 ======

    print('improve:{:d}'.format(totalImprove))
    return kIter, xBest, fxBest, fxNow, recordIter, recordFxNow, recordFxBest, recordPBad


# 结果校验与输出
def ResultOutput(nVar, xBest, fxBest, kIter):
    # ====== 优化结果校验与输出 ======
    fxCheck = cal_Energy(xBest, kIter)
    if abs(fxBest - fxCheck) > 1e-3:  # 检验目标函数
        print("Error 2: Wrong total millage!")
        return
    else:
        print("\nOptimization by simulated annealing algorithm:")
        for i in range(nVar):
            print('\tx[{}] = {:.6f}'.format(i, xBest[i]))
        print('\n\tf(x):{:.6f}'.format(cal_Energy(xBest, 0)))
    return


# 参数设置，优化问题参数定义，模拟退火算法参数设置
nVar = MACHINE_NUM  # 给定自变量数量，y=f(x1,..xn)
# xMax = [Qout / (MACHINE_NUM - 1)] * nVar  # 给定搜索空间的上限，x1_max,..xn_max
# xMin = [(Qout - xMax[0]) / (MACHINE_NUM - 1)] * nVar  # 给定搜索空间的下限，x1_min,..xn_min
xMax = [600] * nVar
xMin = [400] * nVar
t0 = 100.0  # 设定初始退火温度(initial temperature)
t_final = 1  # 设定终止退火温度(stop temperature)
alpha = 0.98  # 设定降温参数，T(k)=alpha*T(k-1)
meanMarkov = 100  # Markov链长度，也即内循环运行次数
scale = 1  # 定义搜索步长，可以设为固定值或逐渐缩小

# 模拟退火算法
kIter, xBest, fxBest, fxNow, recordIter, recordFxNow, recordFxBest, recordPBad = \
    OptimizationSSA(nVar, xMin, xMax, t0, t_final, alpha, meanMarkov, scale)

# 结果校验与输出
ResultOutput(nVar, xBest, fxBest, kIter)
