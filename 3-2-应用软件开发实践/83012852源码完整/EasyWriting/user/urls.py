from django.urls import path

from . import views

app_name = 'user'
urlpatterns = [
    # path('admin/', admin.site.urls),
    path('', views.loginView, name='login'),
    path('login/', views.loginView, name='login'),
    path('register/', views.registerView,name='register'),
    path('logout/', views.logoutView,name='logout'),
]
