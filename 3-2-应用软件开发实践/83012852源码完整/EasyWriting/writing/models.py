import datetime

from django.contrib import admin
from django.db import models
from django.utils import timezone


class Article(models.Model):
    title = models.CharField(max_length=50)
    abstract = models.TextField(max_length=300)  # 摘要
    body = models.TextField()  # 正文（因为文章的正文字数会很多，所以需要使用该类TextField）
    keyword = models.CharField(max_length=40)
    category = models.CharField(max_length=5)  # 类型
    author = models.CharField(max_length=10)  # 作者
    create_time = models.DateTimeField(auto_now_add=True)  # 创建时间
    update_time = models.DateTimeField(auto_now=True)  # 更新时间

    def __str__(self):
        return self.title

    def was_updated_recently(self):
        now = timezone.now()
        return now - datetime.timedelta(days=7) <= self.update_time <= now

    @admin.display(boolean=True, ordering='create_time', description='created recently?', )
    def was_created_recently(self):
        now = timezone.now()
        return now - datetime.timedelta(days=7) <= self.create_time <= now
