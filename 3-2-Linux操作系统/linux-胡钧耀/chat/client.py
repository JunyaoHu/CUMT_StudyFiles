#! /usr/bin/env python3
import socket
import threading
import time
import os

def sendThread(name):
    while True:
        message = input()
        if message == 'exit':
            sk.sendto(("[" + myname + "] 退出了聊天室").encode('utf-8'), ip_port)
            print("退出聊天室")
            sk.close()
            os._exit(0)
                    
        message = '[' + myname + '] ' + message
        sk.sendto(message.encode('utf-8'), ip_port)
        print("[send] [" + time.ctime(time.time()) + "]")
        print(message)
        print("")
           

def recvThread(name):
    while True:
        data=sk.recvfrom(1024)#客户端发送的数据存储在recv里，1024指最大接受数据的量
        if data[0].decode('utf-8') == "exit":
            print("客户端被动关闭socket")
            break
            
        print ("[recv] [" + time.ctime(time.time()) + "]")
        print(data[0].decode('utf-8'))
        print("")
    print ("recv退出线程：" + name)    

ip = input("请输入服务器ip（xxx.xxx.xxx.xxx）:")
sk = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
port = 10000
ip_port=(ip, port)
print(sk)
print("")

myname = input("输入你的聊天昵称：")
sk.sendto(("[" + myname + "] 进入了聊天室").encode('utf-8'), ip_port)

# 创建新线程
aRecvThread = threading.Thread(target=recvThread ,args=("recv",))
aSendThread = threading.Thread(target=sendThread ,args=("send",))
aRecvThread.start()
aSendThread.start()

print("")
aRecvThread.join()
aSendThread.join()

