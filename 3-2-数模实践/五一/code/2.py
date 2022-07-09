import pandas as pd
import pandas as pd
import seaborn as sns
from catboost import CatBoostRegressor
from sklearn.ensemble import RandomForestRegressor
from sklearn.model_selection import train_test_split
from sklearn.multioutput import MultiOutputRegressor
from sklearn.svm import SVR

# %matplotlib inline
sns.set(color_codes=True)
pal = sns.color_palette("viridis", 10)
sns.set_palette('muted')


date = pd.read_excel("time-hours.xlsx")
date

name_X = ["index_A","index_B","index_C","index_D",	"Mineral_parameter1",	"Mineral_parameter2",	"Mineral_parameter3",	"Mineral_parameter4"]
name_y = ["Temperature_of_system1",	"Temperature_of_system2"]
name = ["index_A","index_B","index_C","index_D","Temperature_of_system1",	"Temperature_of_system2",	"Mineral_parameter1",	"Mineral_parameter2",	"Mineral_parameter3",	"Mineral_parameter4"]
X = date[name_X]
y = date[name_y]

X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.20, random_state=33)


svr1 = SVR(epsilon=0.2,kernel='rbf')
svr2 = xgb.XGBRegressor(objective='reg:squarederror',**other_params)
svr3 = RandomForestRegressor(max_depth=2, random_state=0)
params = {
    'iterations':330,
    'learning_rate':0.1,
    'depth':10,
    'loss_function':'RMSE'

}


svr4 = CatBoostRegressor(**params)


models = list()
models.append(('xg', svr2))
models.append(('svr', svr1))
models.append(('RFR', svr3))
models.append(('cat', svr4))
svr = VotingRegressor(estimators=models)

mor = MultiOutputRegressor(svr)

mor = mor.fit(X_train, y_train)


y_pred = mor.predict(X_test)
y_test = y_test.values
y_test
# mse1 = mean_squared_error(y_test[:,0], y_pred[:,0])
# mse2 = mean_squared_error(y_test[:,1], y_pred[:,1])
# mse3 = mean_squared_error(y_test[:,2], y_pred[:,2])
# mse4 = mean_squared_error(y_test[:,3], y_pred[:,3])
#
# print("MSE:")
# print("1  " + str(mse1))
# print("2  " + str(mse2))
# print("3  " + str(mse3))
# print("4  " + str(mse4))
#
# mse1 = mean_absolute_error(y_test[:,0], y_pred[:,0])
# mse2 = mean_absolute_error(y_test[:,1], y_pred[:,1])
# mse3 = mean_absolute_error(y_test[:,2], y_pred[:,2])
# mse4 = mean_absolute_error(y_test[:,3], y_pred[:,3])
# # print(f'MAE for first regressor: {mae_one} - second regressor: {mae_two}')
# print("MAE:")
# print("1  " + str(mse1))
# print("2  " + str(mse2))
# print("3  " + str(mse3))
# print("4  " + str(mse4))
#
# mse1 = explained_variance_score(y_test[:,0], y_pred[:,0])
# mse2 = explained_variance_score(y_test[:,1], y_pred[:,1])
# mse3 = explained_variance_score(y_test[:,2], y_pred[:,2])
# mse4 = explained_variance_score(y_test[:,3], y_pred[:,3])
# # print(f'MAE for first regressor: {mae_one} - second regressor: {mae_two}')
# print("可解释的方差分数:")
# print("1  " + str(mse1))
# print("2  " + str(mse2))
# print("3  " + str(mse3))
# print("4  " + str(mse4))
#
#
# mse1 = r2_score(y_test[:,0], y_pred[:,0])
# mse2 = r2_score(y_test[:,1], y_pred[:,1])
# mse3 = r2_score(y_test[:,2], y_pred[:,2])
# mse4 = r2_score(y_test[:,3], y_pred[:,3])
# # print(f'MAE for first regressor: {mae_one} - second regressor: {mae_two}')
# print("r2_score:")
# print("1  " + str(mse1))
# print("2  " + str(mse2))
# print("3  " + str(mse3))
# print("4  " + str(mse4))
#
# mse1 = mean_absolute_percentage_error(y_test[:,0], y_pred[:,0])
# mse2 = mean_absolute_percentage_error(y_test[:,1], y_pred[:,1])
# mse3 = mean_absolute_percentage_error(y_test[:,2], y_pred[:,2])
# mse4 = mean_absolute_percentage_error(y_test[:,3], y_pred[:,3])
# # print(f'MAE for first regressor: {mae_one} - second regressor: {mae_two}')
# print("mean_absolute_percentage_error:")
# print("1  " + str(mse1))
# print("2  " + str(mse2))
# print("3  " + str(mse3))
# print("4  " + str(mse4))
#
# pr = pd.read_excel("preid.xlsx")
# pr
