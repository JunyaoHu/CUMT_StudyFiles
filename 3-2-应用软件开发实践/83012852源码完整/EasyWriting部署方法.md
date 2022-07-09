## 下载源码

<img src="https://s2.loli.net/2022/07/08/ozMHFyEPglfjuq1.png" alt="image.png" style="zoom: 80%;" />

* 如果您只需要title_model的三个参数文件（**我们在比赛上传可执行文件和源码时没有上传title_model文件夹，只需下载这个补充进入项目根目录EasyWriting下面即可**）：

> 链接：https://pan.baidu.com/s/1KJo9awmTe1kqTuiwAV0QhQ?pwd=cumt 
> 提取码：cumt 

* 如果您需要一次性下载全部文件：

>链接：https://pan.baidu.com/s/1JbbWpqvaDkio5wTrBfFmIQ?pwd=cumt 
>提取码：cumt

## 部署

1. 使用pycharm打开EasyWriting

2. 配置Pycharm的python编译器，建议使用3.9版本，并创建虚拟环境

   <img src="https://s2.loli.net/2022/07/08/ROgYedv4VwTjxXh.png" alt="image-20220708124712703" style="zoom: 50%;" />

3. `pip install -r requirements.txt -i https://pypi.tuna.tsinghua.edu.cn/simple`安装必要的库，使用阿里（https://mirrors.aliyun.com/pypi/simple）或者清华镜像源

   ```
   # requirements.txt
   beautifulsoup4==4.11.1
   bottle==0.12.21
   Django==4.0.4
   jieba==0.42.1
   keras==2.3.1
   networkx==2.8.4
   nltk==3.7
   numpy==1.19.3
   pandas==1.4.2
   PyMySQL==1.0.2
   requests==2.27.1
   rouge==1.0.1
   sentencepiece==0.1.96
   six==1.15.0
   tensorflow==2.5.1
   tensorflow-gpu==2.5.1
   tqdm==4.64.0
   protobuf==3.20.1
   wordcloud==1.8.1
   scipy==1.8.1
   lxml==4.7.1
   tqdm==4.64.0
   bert4keras==0.11.3
   textrank4zh==0.3
   ```

   

   <img src="https://s2.loli.net/2022/07/08/n5o6tV1Eyb3wYHd.png" alt="image-20220708125801754" style="zoom: 67%;" />

4. 直接运行Django项目

   <img src="https://s2.loli.net/2022/07/08/fDj4Er2O1maBoLl.png" alt="image-20220708135311049" style="zoom:50%;" />

5. 打开网站可以进入系统 [写作小助手-主页](http://127.0.0.1:8000/writing/)

   登录用户名 hujunyao 密码 123456 ，即可进入主页进行各种操作