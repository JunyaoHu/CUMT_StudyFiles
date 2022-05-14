from scipy import interpolate
import pandas as pd

stu_num = 5
Z0   = 160  + stu_num / 10  # 初始水位 = 160.5
Qin  = 6000 + stu_num * 10  # 入库流量 = 6050
Qout = 3000 + stu_num * 10  # 出库流量 = 3050

filename = 'data.xls'
dataone = pd.read_excel(filename, sheet_name='水位库容曲线')  # 读取excel数据：库容、水位关系
V = list(dataone.iloc[:, 0])  # 库容
Z1 = list(dataone.iloc[:, 1])  # 水位

datatwo = pd.read_excel(filename, sheet_name='尾水位流量曲线')  # 读取excel数据：库容、水位关系
outQ = list(datatwo.iloc[:, 0])  # 出库流量
Z2 = list(datatwo.iloc[:, 1])  # 尾水位

datathree = pd.read_excel(filename, sheet_name='水头损失曲线')  # 读取excel数据：库容、水位关系
q = list(datathree.iloc[:, 0])  # 单机发电流量
deltaH = list(datathree.iloc[:, 1])  # 水头损失

# 31100501型机组
datafour = pd.read_excel(filename, sheet_name='1型机组')  # 读取excel数据：库容、水位关系
H1 = list(datafour.iloc[:, 1])  # 1型机组发电水头
n1 = list(datafour.iloc[:, 2])  # 1型机组发电出力
q1 = list(datafour.iloc[:, 3])  # 1型机组单机发电流量

# 31100601型机组
datafive = pd.read_excel(filename, sheet_name='2型机组')  # 读取excel数据：库容、水位关系
H2 = list(datafive.iloc[:, 1])  # 2型机组发电水头
n2 = list(datafive.iloc[:, 2])  # 2型机组发电出力
q2 = list(datafive.iloc[:, 3])  # 2型机组单机发电流量

# 31100401型机组
datasix = pd.read_excel(filename, sheet_name='3型机组')  # 读取excel数据：库容、水位关系
H3 = list(datasix.iloc[:, 1])  # 3型机组发电水头
n3 = list(datasix.iloc[:, 2])  # 3型机组发电出力
q3 = list(datasix.iloc[:, 3])  # 3型机组单机发电流量

f1 = interpolate.interp1d(V, Z1, kind='linear')
# f1为库容水位插值函数
f2 = interpolate.interp1d(outQ, Z2, kind='linear')
# f2为尾水位流量插值函数
f3 = interpolate.interp1d(q, deltaH, kind='linear')
# f3为水头损失插值函数
f4 = interpolate.Rbf(H1, q1, n1, kind='mutiquadric')
# f4为1型机组NQH插值函数
f5 = interpolate.Rbf(H2, q2, n2, kind='mutiquadric')
# f5为2型机组NQH插值函数
f6 = interpolate.Rbf(H3, q3, n3, kind='mutiquadric')
# f6为3型机组NQH插值函数

V0 = 265.573  # 初始水位对应库容
V = (Qin - Qout) * 15 * 60 / 10 ** 8 + V0  # 时段末库容
Zsy = f1(V)  # 上游水位
Q1 = [0] * 700
H = [0] * 700
for i in range(700):
    Q1[i] = i + 300

Zxy = f2(Qout)
hs = f3(Q1)

for i in range(700):
    H[i] = Zsy - Zxy - hs[i]  # 实际变化水头差

# 部分计算结果展示，查看整数实际水头
for i in range(0, len(QuantityList), 100):
    print("流量:", QuantityList[i], "实际水头:", RealWaterHeadList[i])

N1 = f4(H, Q1)
NHQ05 = []
for i in range(700):
    NHQ05.append([97, i, 0])
for j in range(Qout - 700 + 1):
    if j < 700:
        if 40 <= N1[j] <= 76:
            NHQ05.append([H[j], Q1[j], N1[j]])
        else:
            NHQ05.append([H[j], Q1[j], 0])
    else:
        NHQ05.append([97, j + 700, 0])
print(NHQ05)

N2 = f5(H, Q1)
NHQ06 = []
for i in range(700):
    NHQ06.append([97, i, 0])
for j in range(Qout - 700 + 1):
    if j < 700:
        if 40 <= N1[j] <= 76:
            NHQ06.append([H[j], Q1[j], N2[j]])
        else:
            NHQ06.append([H[j], Q1[j], 0])
    else:
        NHQ06.append([97, j + 700, 0])
print(NHQ06)

N3 = f6(H, Q1)
NHQ04 = []
for i in range(700):
    NHQ04.append([97, i, 0])
for j in range(Qout - 700 + 1):
    if j < 450:
        if 40 <= N1[j] <= 76:
            NHQ04.append([H[j], Q1[j], N3[j]])
        else:
            NHQ04.append([H[j], Q1[j], 0])
    else:
        NHQ04.append([97, j + 700, 0])
print(NHQ04)

pmax = [[0 for i in range(Qout + 1)] for i in range(6)]
way = [[0 for i in range(Qout + 1)] for i in range(6)]
N = [0] * Qout
N0 = 700 - 1
for i in range(6):
    for q in range(700, Qout + 1):
        pmax[i][q - N0] = 0
        way[i][q - N0] = 0
        j = 700
        if i == 0:
            N[q - N0] = NHQ04[q - j][2]
            if 40 <= N[q - N0] <= 76:
                pmax[i][q - N0] = N[q - N0]
        else:
            while j <= Qout:
                if j < q:
                    if i == 1:
                        N[q - N0] = NHQ04[q - j][2]
                    elif i == 2 or i == 3:
                        N[q - N0] = NHQ05[q - j][2]
                    elif i == 4 or i == 5:
                        N[q - N0] = NHQ06[q - j][2]
                    if pmax[i - 1][j - N0] + N[q - N0] >= pmax[i][q - N0] and 0 != pmax[i - 1][j - N0] <= N[
                        q - N0] <= 76:
                        pmax[i][q - N0] = pmax[i - 1][j - N0] + N[q - N0]
                        way[i][q - N0] = j
                else:
                    break
                j = j + 1
a = way[5][Qout - N0]
na = pmax[5][Qout - N0]
b = way[4][a - N0]
nb = pmax[4][a - N0]
c = way[3][b - N0]
nc = pmax[3][b - N0]
d = way[2][c - N0]
nd = pmax[2][c - N0]
e = way[1][d - N0]
ne = pmax[1][d - N0]
nf = pmax[0][e - N0]
QN1 = e
QN2 = d - e
QN3 = c - d
QN4 = b - c
QN5 = a - b
QN6 = Qout - a
NN1 = nf
NN2 = ne - nf
NN3 = nd - ne
NN4 = nc - nd
NN5 = nb - nc
NN6 = na - nb
D = [QN1, QN2, QN3, QN4, QN5, QN6]
n = [NN1, NN2, NN3, NN4, NN5, NN6]
SUNM = pmax[5][Qout - N0]
print('动态规划后，求得出力最大时各机组流量和出力如下：', D, n)
print('总出力为：', SUNM, '亿kw')