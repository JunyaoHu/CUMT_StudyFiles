import pandas as pd
import numpy as np

filename = 'Data.xlsx'  # 文件路径

tailWaterLevelAndOutQuantity = pd.read_excel(filename, sheet_name='ZO')  # 读取excel数据：尾水位流量曲线
outQuantity = tailWaterLevelAndOutQuantity.iloc[:, 0].tolist()  # 出库流量
tailWaterLevel = tailWaterLevelAndOutQuantity.iloc[:, 1].tolist()  # 尾水位
outQuantity_tailWaterLevel = np.poly1d(np.polyfit(outQuantity, tailWaterLevel, 3))  # 用3次多项式[拟合]

for i in range(len(outQuantity)):
    if outQuantity[i] < 1000:
            tailWaterLevel[i] = 63.03
    else:
        tailWaterLevel[i] = outQuantity_tailWaterLevel(outQuantity[i])

Qout = [40000, 48000, 18000, 10000, 900]
Hxy = outQuantity_tailWaterLevel(Qout)
print(Hxy)