import pandas as pd
from scipy import interpolate

filename = 'data.xls'  # 文件路径
data1 = pd.read_excel(filename, sheet_name='水位库容曲线')  # 读取excel数据：库容水位曲线
V = list(data1.iloc[:, 0])  # 库容
Z1 = list(data1.iloc[:, 1])  # 水位
f = interpolate.interp1d(V, Z1, kind='linear')  # 水位库容插值

data2 = pd.read_excel(filename, sheet_name='尾水位流量曲线')  # 读取excel数据：尾水位流量曲线
Q = list(data2.iloc[:, 0])  # 出库流量
Z2 = list(data2.iloc[:, 1])  # 尾水位
g = interpolate.interp1d(Q, Z2, kind='linear')  # 尾水位流量插值

data3 = pd.read_excel(filename, sheet_name='水头损失曲线')  # 读取excel数据：水头损失曲线
Qfd = list(data3.iloc[:, 0])  # 单机发电流量流量
hs = list(data3.iloc[:, 1])  # 水头损失
m = interpolate.interp1d(Qfd, hs, kind='linear')  # 水头损失插值
QM = 3120
S = (6120 - QM) * 15 * 60 / 10 ** 8 + 270.675  # 初始水位对应库容
Zsy = f(S)  # 上游水位
Q1 = [0] * 800
H = [0] * 800
for i in range(800):
    Q1[i] = i + 200
hs1 = m(Q1)
Zxy = g(Q1)
for i in range(800):
    H[i] = Zsy - Zxy[i] - hs1[i]
# print(H)#实际变化水头差
# 31100401型机组
data401 = pd.read_excel(filename, sheet_name='3型机组')  # 读取excel数据：31100401NHQ曲线
h401 = list(data401.iloc[:, 1])  # 水头
n401 = list(data401.iloc[:, 2])  # 出力
q401 = list(data401.iloc[:, 3])  # 流量
func401 = interpolate.Rbf(h401, q401, n401, kind='mutiquadric')  # 二次插值
N401 = func401(H, Q1)

NHQ04 = []
for i in range(200):
    NHQ04.append([96, i, 0])
for j in range(QM - 200 + 1):
    if j < 800:
        if (N401[j] >= 40 and N401[j] <= 76):
            NHQ04.append([H[j], Q1[j], N401[j]])
        else:
            NHQ04.append([H[j], Q1[j], 0])
    else:
        NHQ04.append([96, j + 200, 0])
print(NHQ04)
# 31100501型机组
data501 = pd.read_excel(filename, sheet_name='1型机组')  # 读取excel数据：31100501NHQ曲线
h501 = list(data501.iloc[:, 1])  # 水头
n501 = list(data501.iloc[:, 2])  # 出力
q501 = list(data501.iloc[:, 3])  # 流量
func501 = interpolate.Rbf(h501, q501, n501, kind='mutiquadric')  # 二次插值
N501 = func501(H, Q1)

NHQ05 = []
for i in range(200):
    NHQ05.append([96, i, 0])
for j in range(QM - 200 + 1):
    if j < 800:
        if (N501[j] >= 40 and N501[j] <= 76):
            NHQ05.append([H[j], Q1[j], N501[j]])
        else:
            NHQ05.append([H[j], Q1[j], 0])
    else:
        NHQ05.append([96, j + 200, 0])
print(NHQ05)
# 31100601型机组
data601 = pd.read_excel(filename, sheet_name='2型机组')  # 读取excel数据：31100601NHQ曲线
h601 = list(data601.iloc[:, 1])  # 水头
n601 = list(data601.iloc[:, 2])  # 出力
q601 = list(data601.iloc[:, 3])  # 流量
func601 = interpolate.Rbf(h601, q601, n601, kind='mutiquadric')  # 二次插值
N601 = func601(H, Q1)

NHQ06 = []
for i in range(200):
    NHQ06.append([96, i, 0])
for j in range(QM - 200 + 1):
    if j < 800:
        if (N601[j] >= 40 and N601[j] <= 76):
            NHQ06.append([H[j], Q1[j], N601[j]])
        else:
            NHQ06.append([H[j], Q1[j], 0])
    else:
        NHQ06.append([96, j + 200, 0])
print(NHQ06)
'''---------------------------动态规划---------------'''
# 分六阶段对六台机组进行顺推计算
pmax = [[0 for i in range(QM + 1)] for i in range(6)]
way = [[0 for i in range(QM + 1)] for i in range(6)]
N = [0] * QM
N0 = 200 - 1
for i in range(6):
    for q in range(200, QM + 1):
        pmax[i][q - N0] = 0
        way[i][q - N0] = 0
        j = 200
        if i == 0:
            N[q - N0] = NHQ04[q - j][2]
            if N[q - N0] >= 40 and N[q - N0] <= 76:
                pmax[i][q - N0] = N[q - N0]
        else:
            while j <= QM:
                if j < q:
                    if i == 1:
                        N[q - N0] = NHQ04[q - j][2]
                    elif i == 2 or i == 3:
                        N[q - N0] = NHQ05[q - j][2]
                    elif i == 4 or i == 5:
                        N[q - N0] = NHQ06[q - j][2]
                    if pmax[i - 1][j - N0] + N[q - N0] >= pmax[i][q - N0] and pmax[i - 1][j - N0] != 0 and N[
                        q - N0] >= 40 and N[q - N0] <= 76:
                        pmax[i][q - N0] = pmax[i - 1][j - N0] + N[q - N0]
                        way[i][q - N0] = j
                else:
                    break
                j = j + 1
a = way[5][QM - N0];
na = pmax[5][QM - N0]
b = way[4][a - N0];
nb = pmax[4][a - N0]
c = way[3][b - N0];
nc = pmax[3][b - N0]
d = way[2][c - N0];
nd = pmax[2][c - N0]
e = way[1][d - N0];
ne = pmax[1][d - N0];
nf = pmax[0][e - N0]
QN1 = e;
QN2 = d - e;
QN3 = c - d;
QN4 = b - c;
QN5 = a - b;
QN6 = QM - a
NN1 = nf;
NN2 = ne - nf;
NN3 = nd - ne;
NN4 = nc - nd;
NN5 = nb - nc;
NN6 = na - nb
D = [QN1, QN2, QN3, QN4, QN5, QN6]
n = [NN1, NN2, NN3, NN4, NN5, NN6]
SUNM = pmax[5][QM - N0]
print('动态规划后，求得出力最大时各机组流量和出力如下：', D, n)
print('总出力为：', SUNM, '亿kw')
