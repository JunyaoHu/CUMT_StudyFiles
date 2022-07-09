#! /usr/bin/env python3
import socket
import time
ip = input("请输入服务器ip（xxx.xxx.xxx.xxx）:")
print("服务器已开启")   
sk=socket.socket(socket.AF_INET,socket.SOCK_STREAM)
ip_port=(ip,5000)
sk.setsockopt(socket.SOL_SOCKET, socket.SO_REUSEADDR, 1)
sk.bind(ip_port)
sk.listen(1)

print("socket已连接")
a,b=sk.accept()
print(a)
print("")

while True:
    data=a.recv(1024)
    recv_msg = data.decode('utf-8')
    if recv_msg == "exit":
        print("服务器被动退出...")
        break
    print ("[recv] [" + time.ctime(time.time()) + "] " + recv_msg)
    print("服务器正在计算中...")
    try:
        result = str(eval(recv_msg))
    except ZeroDivisionError:
        result = "【错误：除数为0】"
    except NameError:
        result = "【错误：暂不支持变量名输入】"
    except SyntaxError:
        result = "【错误：公式输入有误】"
    print("计算结果为: " + result)
    a.send(result.encode('utf-8'))
    print("[send] [" + time.ctime(time.time()) + "] " + result)
    print("")
sk.close()
print ("退出")
