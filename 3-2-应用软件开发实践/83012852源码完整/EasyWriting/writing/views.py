import os.path
import re

from django.contrib.auth.decorators import login_required
from django.http import HttpResponse, JsonResponse
from django.shortcuts import render

from .models import Article

import datetime

import requests
from bs4 import BeautifulSoup

from wordcloud import WordCloud

from writing.generate_title import *


@login_required(login_url='/login/')
def writing(request):
    username = request.session.get('username')
    return render(request, 'writing/writing.html', locals())


@login_required(login_url='/login/')
def edit(request, article_id):
    try:
        username = request.session.get('username')
        article = Article.objects.get(pk=article_id)
        return render(request, 'writing/edit.html', locals())
    except:
        return HttpResponse("fail")


@login_required(login_url='/login/')
def update(request):
    try:
        selected_article = Article.objects.get(pk=request.POST['id'])
        selected_article.abstract = request.POST['abstract']
        selected_article.title = request.POST['title']
        selected_article.body = request.POST['body']
        selected_article.category = request.POST['category']
        selected_article.keyword = request.POST['keyword']
        selected_article.save()
        return HttpResponse("success")
    except:
        return HttpResponse("fail")


@login_required(login_url='/login/')
def query(request):
    # try:
    pageNo = int(request.POST.get("pageNo"))
    pageSize = int(request.POST.get("pageSize"))
    left = (pageNo - 1) * pageSize
    right = pageNo * pageSize
    type = request.POST.get("search_type")
    search = request.POST.get("search")
    category = request.POST.get("search_category")
    if not category:
        category = ""
    if type == 'title':
        article = Article.objects.filter(author=request.session.get('username'), category__contains=category,
                                         title__contains=search)
    elif type == 'abstract':
        article = Article.objects.filter(author=request.session.get('username'), category__contains=category,
                                         abstract__contains=search)
    elif type == 'body':
        article = Article.objects.filter(author=request.session.get('username'), category__contains=category,
                                         body__contains=search)
    else:
        article = Article.objects.filter(author=request.session.get('username'), category__contains=category)
    context = {
        "code": 0,
        "msg": "",
        "count": article.count(),
        "data": list(article[left:right].values())
    }
    return JsonResponse(context)


# except:
#     return HttpResponse("fail")


@login_required(login_url='/login/')
def delete(request):
    if request.GET.get('article_id'):
        Article.objects.filter(pk=request.GET.get('article_id')).delete()
        return HttpResponse("success")
    else:
        return HttpResponse("fail")


@login_required(login_url='/login/')
def add(request):
    try:
        Article.objects.create(title=request.POST.get('title'),
                               author=request.POST.get('author'),
                               abstract=request.POST.get('abstract'),
                               category=request.POST.get('category'),
                               body=request.POST.get('body'),
                               keyword=request.POST.get('keyword'))
        return HttpResponse("success")
    except:
        return HttpResponse("fail")


@login_required(login_url='/login/')
def create(request):
    # try:
    username = request.session.get('username')
    return render(request, 'writing/create.html', locals())
    # except:
    #     return HttpResponse("fail")


@login_required(login_url='/login/')
def index(request):
    username = request.session.get('username')

    # 近七天的个人新建和全站新建文章数量统计
    data_user = []
    data_all = []
    for i in range(-6, 1):
        start = datetime.date.today() + datetime.timedelta(days=i)
        end = datetime.date.today() + datetime.timedelta(days=i + 1)
        data_user.append(Article.objects.filter(create_time__range=(start, end), author=username).count())
        data_all.append(Article.objects.filter(create_time__range=(start, end)).count())
    list_recent_a_week = [(datetime.date.today() + datetime.timedelta(days=i)).strftime('%m-%d') for i in range(-6, 1)]

    # 所有时间全站人一天中分时段活跃情况（创建文章数量）
    data_hour_all = []
    for i in range(0, 24, 2):
        data_hour_all.append(Article.objects.filter(create_time__hour=i).count())

    # 近七天所有人文章内容关键词统计云图，一天只绘制一个，减少计算量
    today = datetime.date.today().strftime("%y%m%d")
    static_root = "static"
    filename = static_root + "/media/web/wordcloud/wordcloud_" + today + ".png"
    if not os.path.exists(filename):
        start = datetime.date.today() - datetime.timedelta(days=7)
        end = datetime.date.today()
        all_text = list(Article.objects.filter(create_time__range=(start, end)).values_list("keyword", flat=True))
        text = ','.join(all_text)

        wordcloud = WordCloud(
            background_color="white",
            max_words=50,
            width=1200,
            height=800,
            # mask=background,
            font_path= static_root + '/media/font/font.TTF'
        )
        if text == "":
            text = "无写作内容"
        wordcloud.generate(text)
        wordcloud.to_file(static_root + "/media/web/wordcloud/wordcloud_" + datetime.date.today().strftime("%y%m%d") + ".png")

    # 爬虫配置
    kv = {'user-agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) '
                        'Chrome/102.0.5005.63 Safari/537.36 Edg/102.0.1245.30',
          'cookie': 'SINAGLOBAL=8134414668216.274.1617202890239; _td=dec95211-6683-4c56-af9e-34daaf9b5736; UM_distinctid=17dc1e39cc23f6-0218421d30c2da-5919195f-144000-17dc1e39cc33bf; SUBP=0033WrSXqPxfM725Ws9jqgMF55529P9D9WF4zQvjY2m03mIaCG-T9Czg5JpX5KMhUgL.FozE1h5c1h5peoB2dJLoIE-_i--RiKn0i-2pi--ci-2XiK.Ei--ci-2XiK.Ei--ci-2XiK.E; ALF=1686311074; SSOLoginState=1654775075; SCF=Atb-Mc8iaCTfdApxnkiAB6pnyEQL1rfaqKDcXxNLWovajryYf-QIWdgU7qPkST0r-pq-NBW3xGpad6NlUnczEEE.; SUB=_2A25Ppa1zDeRhGeRM41IX-C7NyTiIHXVs0pm7rDV8PUNbmtB-LRXYkW9NU90B-QOoQeT-ZgXjkiao3zWB7Clb_NAC; _s_tentry=login.sina.com.cn; Apache=7749300227723.565.1654775077437; ULV=1654775077478:34:2:2:7749300227723.565.1654775077437:1654665969982; UOR=,,www.baidu.com'}
    SEARCH_NUM = 20

    # 百度
    url = "https://top.baidu.com/board?tab=realtime"
    selector = 'div.content_1YWBm'
    response = requests.get(url, headers=kv).text
    baidu = BeautifulSoup(response, features="lxml").select(selector + " > a")[:SEARCH_NUM]
    baidu1 = BeautifulSoup(response, features="lxml").select(selector + " div.c-single-text-ellipsis")[:SEARCH_NUM]
    baidu_link_and_title = []
    for i in range(SEARCH_NUM):
        baidu_link_and_title.append([baidu[i].get("href"), baidu1[i].get_text().strip()])


    # bilibili
    url = "https://www.bilibili.com/v/popular/rank/all"
    selector = 'div.content > .info > a'
    response = requests.get(url, headers=kv).text
    bili = BeautifulSoup(response, features="lxml").select(selector)[:SEARCH_NUM]
    bili_link_and_title = []
    for bl in bili:
        bili_link_and_title.append([bl.get("href")[2:], bl.get_text()])

    # 矿大
    url = "http://xwzx.cumt.edu.cn/513/list.htm"
    selector = 'span.Article_Title > a'
    response = requests.get(url, headers=kv)
    response.encoding = response.apparent_encoding
    response = response.text
    cumt = BeautifulSoup(response, features="lxml").select(selector)[:20]
    cumt_link_and_title = []
    for c in cumt:
        cumt_link_and_title.append([c.get("href"), c.get_text()])

    # 全站文章类型统计
    type_list = ['党建', '科技', '国际', '文化', '经济']
    type_num = []
    for type in type_list:
        type_num.append(Article.objects.filter(category=type).count())
    # print(type_num)

    return render(request, 'writing/index.html', locals())


@login_required(login_url='/login/')
def help(request):
    username = request.session.get('username')
    return render(request, 'writing/help.html', locals())


@login_required(login_url='/login/')
def about(request):
    username = request.session.get('username')
    return render(request, 'writing/about.html', locals())


@login_required(login_url='/login/')
def user(request):
    user = request.user
    return render(request, 'writing/user.html', locals())


@login_required(login_url='/login/')
def user_update(request):
    msg = ''
    old_password = request.POST.get('old_password')
    new_password = request.POST.get('new_password')
    repeat_password = request.POST.get('repeat_password')
    # print(old_password, new_password, repeat_password)
    # 检查旧密码是否正确
    if request.user.check_password(old_password):
        if not new_password:
            msg = '新密码不能为空'
        elif new_password != repeat_password:
            msg = '两次密码不一致'
        elif old_password == new_password:
            msg = '新旧密码相同'
        else:
            request.user.set_password(new_password)
            request.user.save()
            msg = 'success'
    else:
        msg = '原密码输入错误'
    return HttpResponse(msg)


def generate(request):
    text = request.POST.get('content')
    text = re.sub(r'(\\n)|(<.*?>)', '', text)
    text = re.sub(r"\s+", " ", text)
    print(text)

    summary = get_summer(text)
    print(summary)
    keyword = get_key(text)
    print(keyword)
    title = get_title(text)
    print(title)

    code = 100
    msg = {
        'code': code,
        'title': title,
        'summary': summary,
        'keyword': keyword
    }

    # msg = {
    #     'title': "title",
    #     'summary': "summary",
    #     'keyword': "keyword"
    # }
    return JsonResponse(msg)
