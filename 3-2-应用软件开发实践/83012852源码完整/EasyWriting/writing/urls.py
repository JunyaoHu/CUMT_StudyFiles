from django.urls import path

from . import views

app_name = 'writing'
urlpatterns = [
    # 页面

    path('', views.index, name='index'),  # 总览
    path('list/', views.writing, name='list'),  # 编辑
    path('<int:article_id>/', views.edit, name='edit'),  # 编辑
    path('create/', views.create, name='create'),  # 新建
    path('help/', views.help, name='help'),  # 帮助
    path('about/', views.about, name='about'),  # 关于
    path('user/', views.user, name='user'),  # 用户信息

    # 操作
    path('add/', views.add, name='add'),  # 增
    path('update/', views.update, name='update'),  # 改
    path('query/', views.query, name='query'),  # 查
    path('delete/', views.delete, name='delete'),  # 删

    path('user_update/', views.user_update, name='user_update'),  # 更新用户信息

    path('generate/', views.generate, name='generate'),  # 更新用户信息
]
