```shell
source /home/cumt/EasyWriting-venv/bin/activate
cd /home/cumt/EasyWriting

/home/cumt/EasyWriting/myproject_nginx.conf 


import pymysql
pymysql.install_as_MySQLdb()
pymysql.connect('121.36.220.171','root', 'cumt','writing','3306')

ps -ef 
ps -ef | grep nginx
ps -ef | grep uwgsi
pkill -9 nginx
pkill -9 uwsgi

nginx -c /home/cumt/EasyWriting/myproject_nginx.conf
nginx -s quit
nginx -s stop
nginx -s reload
service nginx start
service nginx restart

uwsgi --ini uwsgi.ini
uwsgi --reload uwsgi.ini
uwsgi --stop uwsgi.ini

修改配置
/etc/nginx/nginx.conf
/home/cumt/EasyWriting/myproject_nginx.conf
/home/cumt/EasyWriting/uwsgi.ini

日志
/home/cumt/EasyWriting/uwsgi.log
/var/log/nginx/error.log
```

1. /home/cumt/EasyWriting 大小写



6.13 500 寄

![image-20220616203524733](https://s2.loli.net/2022/06/16/yjb9itZLCTkPYSn.png)

6.16 草。今天新出现的。这下数据库也连不上了，超时

![image-20220616194538312](https://s2.loli.net/2022/06/16/Qf1uoyVwkzpJ3Xi.png)

```
*10 upstream timed out (110: Connection timed out) while reading response header from upstream
```









# remake

```
mkdir ~/.pip
vim ~/.pip/pip.conf

[global]
timeout      = 6000
index-url    = https://pypi.tuna.tsinghua.edu.cn/simple
[install]
use-mirrors  = true 
mirrors      = https://pypi.tuna.tsinghua.edu.cn/simple
trusted-host = pypi.tuna.tsinghua.edu.cn

pip3 install virtualenv

```

# review

## update domestic source of ubuntu

https://blog.csdn.net/zj490044512/article/details/122427832

```
sudo cp /etc/apt/sources.list /etc/apt/sources.list.back
sudo vim /etc/apt/sources.list

i

deb http://mirrors.aliyun.com/ubuntu/ bionic main restricted universe multiverse
deb-src http://mirrors.aliyun.com/ubuntu/ bionic main restricted universe multiverse
deb http://mirrors.aliyun.com/ubuntu/ bionic-security main restricted universe multiverse
deb-src http://mirrors.aliyun.com/ubuntu/ bionic-security main restricted universe multiverse
deb http://mirrors.aliyun.com/ubuntu/ bionic-updates main restricted universe multiverse
deb-src http://mirrors.aliyun.com/ubuntu/ bionic-updates main restricted universe multiverse
deb http://mirrors.aliyun.com/ubuntu/ bionic-proposed main restricted universe multiverse
deb-src http://mirrors.aliyun.com/ubuntu/ bionic-proposed main restricted universe multiverse
deb http://mirrors.aliyun.com/ubuntu/ bionic-backports main restricted universe multiverse
deb-src http://mirrors.aliyun.com/ubuntu/ bionic-backports main restricted universe multiverse

esc :wq

sudo apt-get update
sudo apt-get upgrade
```

## mysql

https://blog.csdn.net/weixx3/article/details/80782479

```
sudo apt-get update
sudo apt-get install mysql-server

sudo mysql_secure_installation

systemctl status mysql.service
```

![image-20220617170423808](C:\Users\hujunyao\AppData\Roaming\Typora\typora-user-images\image-20220617170423808.png)

```
sudo mysql -uroot -p

[your password]


# 指定root用户的Host字段为%
use mysql
# select user,host from user;
# update user set host='%' where user='root';
#如果执行update语句时出现ERROR 1062 (23000): Duplicate entry '%-root' for key 'PRIMARY' 错误，说明有多个ROOT用户纪录在USER表中了.需要select host from user where user = 'root';查看一下host是否已经有了%这个值，有了就可以了.
 
set global validate_password_policy=0;
set global validate_password_length=1;
 
# 给任意主机root账户连接mysql服务器权限：
GRANT ALL PRIVILEGES ON *.*  TO 'root'@'%' IDENTIFIED BY 'cumt' WITH GRANT OPTION;
flush privileges;                                    # 刷新权限表，使配置生效

exit

vim /etc/mysql/mysql.conf.d/mysqld.cnf
bind-address = 0.0.0.0  <- [comment it]

关掉mysql服务：sudo /etc/init.d/mysql stop
启动mysql服务：sudo /etc/init.d/mysql start
```

navicat configuration

![image-20220617175302295](https://s2.loli.net/2022/06/17/AuK8CqhSmn4RDo9.png)

![image-20220617175345484](https://s2.loli.net/2022/06/17/Btnw3Apqr2dJOzk.png)

pycharm configuration

![image-20220617175447888](https://s2.loli.net/2022/06/17/29pZKYSu3db5mDt.png)

```
setting

 'default': {
        'ENGINE': 'django.db.backends.mysql',  # 数据库引擎
        'NAME': 'writing',  # 数据库名称
        'USER': 'root',  # 连接数据库的用户名称
        'PASSWORD': 'cumt',  # 用户密码
        'HOST': '.....',  # 访问的数据库的主机的ip地址
        'PORT': '3306',  # 默认mysql访问端口
    }
```

## install python3.9.6

```
sudo apt install -y wget build-essential libreadline-dev libncursesw5-dev libssl-dev libsqlite3-dev tk-dev libgdbm-dev libc6-dev libbz2-dev libffi-dev zlib1g-dev

// you can download it by windows system on your PC and upload by huaweicloud couldshell
wget https://www.python.org/ftp/python/3.9.6/Python-3.9.6.tgz --no-check-certificate

cd /home/cumt/python
tar -xvzf Python-3.9.6.tgz 
cd Python-3.9.6
./configure --enable-optimizations
make
sudo make install
python3 -V
sudo ln -sf /usr/local/bin/python3.9 /usr/bin/python3.9
sudo ln -sf /usr/local/bin/pip3 /usr/bin/pip3
sudo ln -sf /usr/local/bin/python3.9 /usr/bin/python
sudo ln -sf /usr/share/pyshared/lsb_release.py /usr/local/lib/python3.9/site-packages/lsb_release.py
sudo pip3 install --upgrade pip
```

## update python source

```
pip config set global.index-url https：//pypi.tuna.tsinghua.edu.cn/simple/
// Writing to /root/.config/pip/pip.conf
```

## upload project and edit some detail

```
// in your local PC
pipreqs ./ --encoding=utf-8
```

## connect SSH and upload

## uwgsi+ngnix

```
pip install uwsgi

[uwsgi]
# 使用http访问，0表示任何IP，8001表示端口号，要求同上
http=0:8001
# 项目的绝对路径
chdir=/home/cumt/EasyWriting
# 项目的wsgi.py文件，如果你怕写乱，此处建议写绝对路径
wsgi-file==/home/cumt/EasyWriting/EasyWriting.py
# 允许主线程存在
master=true
# 开启进程的数量
processes=1
# 开启多线程
enable-threads=false
# 当服务器退出的时候自动清理环境，删除socket文件和pid文件
vacuum=true
# 使进程在后台运行，并将日志打到指定的日志文件
daemonize=uwsgi.log
# 指定pid文件的位置，记录主进程的pid号，主要用于关闭服务
pidfile=uwsgi.pid

# 开启uwsgi，可通过浏览器进行验证
uwsgi --ini uwsgi.ini   
# 关闭uwsgi，需要使用到配置文件中指定的路径下的pid文件，该文件在开启uwsgi后会自动创建
uwsgi --stop uwsgi.pid   

# 在settings.py文件中增加一句代码如下。配置完成后 STATIC_ROOT=项目根目录+"文件路径"
STATIC_ROOT = os.path.join(BASE_DIR, "文件路径")

# 配置完保存退出，执行下列指令收集静态资源
# 它会把原来的静态资源收集到上述代码配置的文件中，并且还会多一个admin文件夹
 python manage.py collectstatic

# 更新apt-get
sudo apt-get update
# 安装nginx
sudo apt-get install nginx

# 验证配置是否正确，不正确会报错。也可以看到默认的配置文件，建议大家记录一下
nginx -t
# 查看nginx版本（详细版本用指令：nginx  -V）
nginx -v
# 启动nginx（我的好像是安装就已经启动了）
service nginx start    #或者  start  nginx
# 快速停止nginx
nginx -s stop
# 正常关闭nginx
nginx -s quit
# 配置文件修改重装载命令
nginx -s reload

uwsgi.ini
socket = 0.0.0.0:8002  #复制时删掉注释；0.0.0.0表示所有IP，端口需要选用空闲端口

```

```
my_ngnix.cong

user root;   #设置权限，后面会讲这个问题
worker_processes auto;
pid /run/nginx.pid;
events {
        worker_connections 768;
}
http {
        sendfile on;
        tcp_nopush on;
        tcp_nodelay on;
        keepalive_timeout 65;
        types_hash_max_size 2048;
        include /etc/nginx/mime.types;  #这个文件有的教程说复制到项目根目录，我写了绝对路径
        default_type application/octet-stream;
        ssl_protocols TLSv1 TLSv1.1 TLSv1.2; # Dropping SSLv3, ref: POODLE
        ssl_prefer_server_ciphers on;
        #下面两行是nginx的请求与错误日志，路径自行设计，可查看其内容修改bug
        access_log /var/log/nginx/access.log;
        error_log /var/log/nginx/error.log;
        gzip on;
        upstream django {
                server 127.0.0.1:8002;  #这个地方很重要，需要用与步骤1.2中写的端口一致
        }
        server{
                root /var/www/html;
                index index.html index.htm index.nginx-debian.html;

                listen 8001;    #监听端口，浏览器访问的就是这个端口
                server_name 121.37.68.41;  #你的服务器IP
                client_max_body_size 75M;
                charset     utf-8;
                location / {
                uwsgi_pass  django;
                include  /etc/nginx/uwsgi_params;  #这个可以根据自己nginx的文件找到在哪
                }
                location /static/ {   #配置静态资源，此处写什么，在浏览器访问就需要写什么
                          alias /home/cumt/EasyWriting/static_new/;  #静态资源的绝对路径，最后的/一定要加
                }
                location /templates/ {
                          alias /home/cumt/EasyWriting/templates/;
                }
        }
}
```



```
uwsgi --ini uwsgi.ini
sudo nginx -c /home/cumt/EasyWriting/my_nginx.conf
nginx -s reload
```

