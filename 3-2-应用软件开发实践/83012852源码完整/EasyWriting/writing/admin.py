from django.contrib import admin

from .models import Article


class ArticleAdmin(admin.ModelAdmin):
    # ...
    list_display = ('title', 'category', 'author', 'create_time', 'update_time', 'was_created_recently')
    list_filter = ['update_time']


admin.site.register(Article, ArticleAdmin)
