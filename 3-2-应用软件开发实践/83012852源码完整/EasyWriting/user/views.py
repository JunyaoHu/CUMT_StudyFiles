from django.http import HttpResponse
from django.shortcuts import render, redirect
from django.contrib.auth.models import User
from django.contrib.auth import login, logout, authenticate


# Create your views here.
# 登录
def loginView(request):
    if request.user.is_authenticated:
        return redirect("/writing")
    else:
        if request.method == "POST":
            username = request.POST.get("username")
            password = request.POST.get("password")
            if User.objects.filter(username=username):
                user = authenticate(username=username, password=password)
                if user:
                    login(request, user)
                    request.session['username'] = username
                    msg = "登录成功"
                    # print(request.session.get('username'))
                    request.session.set_expiry(86400)
                    # 保存一天的session
                    return redirect("/writing")
                else:
                    msg = "用户名密码错误，或被限制登录"
            else:
                msg = "用户名不存在"
    return render(request, "user/login.html", locals())


# 注册
def registerView(request):
    if request.method == "POST":
        username = request.POST.get("username")
        password = request.POST.get("password")
        email = request.POST.get("email")
        if User.objects.filter(username=username):
            msg = "用户名已存在"
        else:
            user = User.objects.create_user(username=username, password=password, email=email)
            msg = "注册成功"
            return redirect("/login/")
    return render(request, "user/register.html", locals())


def logoutView(request):
    logout(request)
    return redirect('user:login')
