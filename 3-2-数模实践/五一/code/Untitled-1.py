from sklearn.datasets import make_regression
from sklearn.multioutput import MultiOutputRegressor
from sklearn.svm import SVR
from sklearn.model_selection import train_test_split
from sklearn.metrics import mean_squared_error, mean_absolute_error
from sklearn.metrics import explained_variance_score,r2_score
from sklearn.ensemble import RandomForestRegressor
from sklearn.ensemble import ExtraTreesRegressor
from catboost import CatBoostRegressor
from sklearn.metrics import mean_absolute_percentage_error
from sklearn.ensemble import VotingRegressor
from sklearn.ensemble import VotingClassifier
from sklearn.gaussian_process import GaussianProcessRegressor
from sklearn.gaussian_process.kernels import DotProduct, WhiteKernel
import xgboost  as xgb
from sklearn.datasets import make_regression
from sklearn.multioutput import MultiOutputRegressor
from sklearn.svm import SVR
from sklearn.model_selection import train_test_split
from sklearn.metrics import mean_squared_error, mean_absolute_error
import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns
import numpy as np

data = pd.read_excel("data.xlsx")
name = ["index_A","index_B","index_C","index_D","Temperature_of_system1",	"Temperature_of_system2",	"Mineral_parameter1",	"Mineral_parameter2",	"Mineral_parameter3",	"Mineral_parameter4","Process_parameter3","Process_parameter4"]
date = data[name]
name_X = ["Temperature_of_system1",	"Temperature_of_system2",	"Mineral_parameter1",	"Mineral_parameter2",	"Mineral_parameter3",	"Mineral_parameter4","Process_parameter3","Process_parameter4"]
name_y = ["index_A","index_B","index_C","index_D"]
name = ["index_A","index_B","index_C","index_D","Temperature_of_system1",	"Temperature_of_system2",	"Mineral_parameter1",	"Mineral_parameter2",	"Mineral_parameter3",	"Mineral_parameter4"]
X = date[name_X]
y = date[name_y]

X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=30)
other_params = {'learning_rate': 0.1, 'n_estimators': 300, 'max_depth': 5, 'min_child_weight': 1, 'seed': 0, 'subsample': 0.8, 'colsample_bytree': 0.8, 'gamma': 0, 'reg_alpha': 0, 'reg_lambda': 1}
svr2 = xgb.XGBRegressor(objective='reg:squarederror',**other_params)
params = {
    'iterations':300,
    'learning_rate':0.1,
    'depth':10,
    'loss_function':'RMSE'
}

svr4 = CatBoostRegressor(**params)

models = list()
models.append(('xg', svr2))
models.append(('CATBOOST', svr4))
svr = VotingRegressor(estimators=models)
mor = MultiOutputRegressor(svr)
mor = mor.fit(X_train, y_train)
y_test = y_test.values
y_pred = mor.predict(X_test)


mse1 = mean_squared_error(y_test[:,0], y_pred[:,0])
mse2 = mean_squared_error(y_test[:,1], y_pred[:,1])
mse3 = mean_squared_error(y_test[:,2], y_pred[:,2])
mse4 = mean_squared_error(y_test[:,3], y_pred[:,3])
# print(f'MSE for first regressor: {mse_one} -second regressor: {mse_two}')
print("MSE:")
print("1  " + str(mse1))
print("2  " + str(mse2))
print("3  " + str(mse3))
print("4  " + str(mse4))

mse1 = mean_absolute_error(y_test[:,0], y_pred[:,0])
mse2 = mean_absolute_error(y_test[:,1], y_pred[:,1])
mse3 = mean_absolute_error(y_test[:,2], y_pred[:,2])
mse4 = mean_absolute_error(y_test[:,3], y_pred[:,3])
# print(f'MAE for first regressor: {mae_one} - second regressor: {mae_two}')
print("MAE:")
print("1  " + str(mse1))
print("2  " + str(mse2))
print("3  " + str(mse3))
print("4  " + str(mse4))

mse1 = explained_variance_score(y_test[:,0], y_pred[:,0])
mse2 = explained_variance_score(y_test[:,1], y_pred[:,1])
mse3 = explained_variance_score(y_test[:,2], y_pred[:,2])
mse4 = explained_variance_score(y_test[:,3], y_pred[:,3])
# print(f'MAE for first regressor: {mae_one} - second regressor: {mae_two}')
print("可解释的方差分数:")
print("1  " + str(mse1))
print("2  " + str(mse2))
print("3  " + str(mse3))
print("4  " + str(mse4))


mse1 = r2_score(y_test[:,0], y_pred[:,0])
mse2 = r2_score(y_test[:,1], y_pred[:,1])
mse3 = r2_score(y_test[:,2], y_pred[:,2])
mse4 = r2_score(y_test[:,3], y_pred[:,3])
# print(f'MAE for first regressor: {mae_one} - second regressor: {mae_two}')
print("r2_score:")
print("1  " + str(mse1))
print("2  " + str(mse2))
print("3  " + str(mse3))
print("4  " + str(mse4))

mse1 = mean_absolute_percentage_error(y_test[:,0], y_pred[:,0])
mse2 = mean_absolute_percentage_error(y_test[:,1], y_pred[:,1])
mse3 = mean_absolute_percentage_error(y_test[:,2], y_pred[:,2])
mse4 = mean_absolute_percentage_error(y_test[:,3], y_pred[:,3])
# print(f'MAE for first regressor: {mae_one} - second regressor: {mae_two}')
print("mean_absolute_percentage_error:")
print("1  " + str(mse1))
print("2  " + str(mse2))
print("3  " + str(mse3))
print("4  " + str(mse4))


pt_val = mor.predict(pr[name_X])
pt_val

### 开始对抗
Virtual_val = mor.predict(X)
Virtual_val


# 构建一个分类模型吧 A,B,C,D -> 0/1
# 这里做逻辑吧
df = pd.DataFrame(Virtual_val)
# df.to_excel("Virtual_val.xlsx")
df.columns = ['A','B','C','D']
df.to_excel("Virtual_val.xlsx")
ral = pd.read_excel("./gan.xlsx")
ral = pd.DataFrame(ral)
ral


gan_data = df
df["is_qualified"] = ral["is_qualified"]
df = pd.DataFrame(df)
df

# 拼接
gan_data = pd.concat([df,ral])
gan_data


name_X1 = ['A','B','C','D']
name_y1 = "is_qualified"
X1 = gan_data[name_X1]
y1 = gan_data[name_y1]
X1 = X1.values
y1 = y1.values

X_train1, X_test1, y_train1, y_test1 = train_test_split(X1, y1, test_size=0.3, random_state=35)

clf = CatBoostClassifier(iterations=100,
                           depth=6,
                           learning_rate=0.01,
                           loss_function='MultiClass',
                           logging_level='Verbose')
clf.fit(X_train1,y_train1,eval_set=(X_test1, y_test1),plot=True)

y_pred1 = clf.predict(X_test1)


from sklearn.metrics import average_precision_score


# y_test
mse1 = balanced_accuracy_score(y_test1, y_pred1)
# print(f'MSE for first regressor: {mse_one} -second regressor: {mse_two}')
print("平衡精度:")
print("1  " + str(mse1))

mse1 = confusion_matrix(y_test1, y_pred1)
# print(f'MAE for first regressor: {mae_one} - second regressor: {mae_two}')
print("混淆矩阵:")
print("1  " + str(mse1))

mse1 = average_precision_score(y_test1, y_pred1)

# print(f'MAE for first regressor: {mae_one} - second regressor: {mae_two}')
print("根据预测分数计算平均精度:")
print("1  " + str(mse1))





mse1 = accuracy_score(y_test1, y_pred1)

# print(f'MAE for first regressor: {mae_one} - second regressor: {mae_two}')
print("精度分类得分。:")
print("1  " + str(mse1))



y_pred_val = pd.DataFrame(pt_val)
y_pred_val.columns = ['A','B','C','D']
y_pred_val

result = clf.predict(y_pred_val)
result

