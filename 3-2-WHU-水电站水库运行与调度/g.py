import pandas as pd
import numpy as np

filename = 'Data.xlsx'  # 文件路径

VolumeAndWaterLevel = pd.read_excel(filename, sheet_name='ZV')  # 读取excel数据：库容水位曲线
Volume = VolumeAndWaterLevel.iloc[:, 1].tolist()  # 库容
WaterLevel = VolumeAndWaterLevel.iloc[:, 0].tolist()  # 水位
Volume_WaterLevel = np.poly1d(np.polyfit(Volume, WaterLevel, 3))  # 用3次多项式[拟合]volume, waterLevel
for k in range(len(Volume)):
    if Volume[k] < 103.3:
        WaterLevel[k] = 130
    if Volume[k] > 505:
        WaterLevel[k] = 185
    else:
        WaterLevel[k] = Volume_WaterLevel(Volume[k])

V = [100, 510, 400]
H = Volume_WaterLevel(V)
print(H)
