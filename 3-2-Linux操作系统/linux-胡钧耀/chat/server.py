#! /usr/bin/env python3
import socket
import threading
import time
import os

def sendThread(name):
    while True:
        message = input()
        if message == 'exit':
            sk.sendto(("[" + myname + "] 关闭了聊天室").encode('utf-8'), ip_port)
            print("关闭聊天室")
            sk.close()
            os._exit(0)
        
        message = "[管理员]" + message
        for i in expected_ip_port:
            sk.sendto(message.encode('utf-8'), i)   
        print("[send] [" + time.ctime(time.time()) + "]")
        print(message)
        print("")
             
    

def recvThread(name):
    global expected_ip_port

    while True:        
        recv_data=sk.recvfrom(1024)#客户端发送的数据存储在recv里，1024指最大接受数据的量
        
        if recv_data[1] not in expected_ip_port:
            for i in expected_ip_port:
                sk.sendto(recv_data[0], i)
            expected_ip_port.add(recv_data[1])
            print("[" + time.ctime(time.time()) + "]")
            print(recv_data[0].decode('utf-8'))
            print("")
            
        elif "] 退出了聊天室" in recv_data[0].decode('utf-8'):
            expected_ip_port.remove(recv_data[1])
            for i in expected_ip_port:
                sk.sendto(recv_data[0], i)
            print("[" + time.ctime(time.time()) + "]")
            print(recv_data[0].decode('utf-8'))
            print("")
            
        else:
            for i in expected_ip_port:
                if i != recv_data[1]:
                    sk.sendto(recv_data[0], i)
            print("[recv] [" + time.ctime(time.time()) + "]")
            print(recv_data[0].decode('utf-8'))
            print("")
 
    sk.close()

sk = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
ip = input("请输入服务器ip（xxx.xxx.xxx.xxx）:")
port = 10000
ip_port=(ip, port)
expected_ip_port = set({})
sk.bind(ip_port)
print(sk)
print("")
myname = '管理员'
print("聊天室已开启")

# 创建新线程
aRecvThread = threading.Thread(target=recvThread ,args=("recv",))
aSendThread = threading.Thread(target=sendThread ,args=("send",))
aRecvThread.start()
aSendThread.start()

print("")
aRecvThread.join()
aSendThread.join()

