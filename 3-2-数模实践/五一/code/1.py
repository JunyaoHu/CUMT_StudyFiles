from sklearn.datasets import make_regression
from sklearn.multioutput import MultiOutputRegressor
from sklearn.svm import SVR
from sklearn.model_selection import train_test_split
from sklearn.metrics import mean_squared_error, mean_absolute_error
import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns
import numpy as np
# %matplotlib inline
sns.set(color_codes=True)
pal = sns.color_palette("viridis", 10)
sns.set_palette('muted')

date = pd.read_excel("time-hours.xlsx")
date

date.info()

sns.pairplot(date)

name = ["index_A","index_B","index_C","index_D","Temperature_of_system1",	"Temperature_of_system2",	"Mineral_parameter1",	"Mineral_parameter2",	"Mineral_parameter3",	"Mineral_parameter4"]
date[name]

df = pd.DataFrame(date)
corr = df.corr()
plt.figure(figsize=(16,12))
sns.set_context('paper',font_scale=1.4)
sns.heatmap(corr, cmap='Blues', annot=True)

from sklearn.multioutput import MultiOutputRegressor
from sklearn.svm import SVR
from sklearn.metrics import mean_squared_error, mean_absolute_error
from sklearn.metrics import explained_variance_score,r2_score
from sklearn.metrics import mean_absolute_percentage_error

name_X = ["Temperature_of_system1",	"Temperature_of_system2",	"Mineral_parameter1",	"Mineral_parameter2",	"Mineral_parameter3",	"Mineral_parameter4"]
name_y = ["index_A","index_B","index_C","index_D"]
name = ["index_A","index_B","index_C","index_D","Temperature_of_system1",	"Temperature_of_system2",	"Mineral_parameter1",	"Mineral_parameter2",	"Mineral_parameter3",	"Mineral_parameter4"]
X = date[name_X]
y = date[name_y]

svr = SVR(epsilon=0.2,kernel='rbf')
mor = MultiOutputRegressor(svr)
mor = mor.fit(X_train, y_train)
y_pred = mor.predict(X_test)
y_test = y_test.values
mse1 = mean_squared_error(y_test[:,0], y_pred[:,0])
mse2 = mean_squared_error(y_test[:,1], y_pred[:,1])
mse3 = mean_squared_error(y_test[:,2], y_pred[:,2])
mse4 = mean_squared_error(y_test[:,3], y_pred[:,3])
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
print("可解释的方差分数:")
print("1  " + str(mse1))
print("2  " + str(mse2))
print("3  " + str(mse3))
print("4  " + str(mse4))


mse1 = r2_score(y_test[:,0], y_pred[:,0])
mse2 = r2_score(y_test[:,1], y_pred[:,1])
mse3 = r2_score(y_test[:,2], y_pred[:,2])
mse4 = r2_score(y_test[:,3], y_pred[:,3])
print("r2_score:")
print("1  " + str(mse1))
print("2  " + str(mse2))
print("3  " + str(mse3))
print("4  " + str(mse4))

mse1 = mean_absolute_percentage_error(y_test[:,0], y_pred[:,0])
mse2 = mean_absolute_percentage_error(y_test[:,1], y_pred[:,1])
mse3 = mean_absolute_percentage_error(y_test[:,2], y_pred[:,2])
mse4 = mean_absolute_percentage_error(y_test[:,3], y_pred[:,3])
print("mean_absolute_percentage_error:")
print("1  " + str(mse1))
print("2  " + str(mse2))
print("3  " + str(mse3))
print("4  " + str(mse4))

pr = pd.read_excel("preid.xlsx")
pr

pt_val = mor.predict(pr[name_X])
pt_val