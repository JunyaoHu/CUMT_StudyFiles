"""
 @author: hujunyao
 @create date: 2022.6.8
"""
import requests
from bs4 import BeautifulSoup

kv = {'user-agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) '
                    'Chrome/102.0.5005.63 Safari/537.36 Edg/102.0.1245.30',
      'cookie': 'SINAGLOBAL=8134414668216.274.1617202890239; _td=dec95211-6683-4c56-af9e-34daaf9b5736; UM_distinctid=17dc1e39cc23f6-0218421d30c2da-5919195f-144000-17dc1e39cc33bf; SUBP=0033WrSXqPxfM725Ws9jqgMF55529P9D9WF4zQvjY2m03mIaCG-T9Czg5JpX5KMhUgL.FozE1h5c1h5peoB2dJLoIE-_i--RiKn0i-2pi--ci-2XiK.Ei--ci-2XiK.Ei--ci-2XiK.E; ALF=1686311074; SSOLoginState=1654775075; SCF=Atb-Mc8iaCTfdApxnkiAB6pnyEQL1rfaqKDcXxNLWovajryYf-QIWdgU7qPkST0r-pq-NBW3xGpad6NlUnczEEE.; SUB=_2A25Ppa1zDeRhGeRM41IX-C7NyTiIHXVs0pm7rDV8PUNbmtB-LRXYkW9NU90B-QOoQeT-ZgXjkiao3zWB7Clb_NAC; _s_tentry=login.sina.com.cn; Apache=7749300227723.565.1654775077437; ULV=1654775077478:34:2:2:7749300227723.565.1654775077437:1654665969982; UOR=,,www.baidu.com'}
SEARCH_NUM = 20

# 微博
url = "https://s.weibo.com/top/summary?cate=realtimehot"
selector = '#pl_top_realtimehot > table > tbody > tr > td.td-02 > a'
response = requests.get(url, headers=kv).text
print(response)
weibo = BeautifulSoup(response, features="lxml").select(selector)[:SEARCH_NUM]
weibo_link_and_title = []
for wb in weibo:
    weibo_link_and_title.append([wb.get("href"), wb.get_text()])
print(weibo_link_and_title)




