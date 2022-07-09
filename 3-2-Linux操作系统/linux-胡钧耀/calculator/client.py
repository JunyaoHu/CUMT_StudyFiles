#! /usr/bin/env python3
import socket
import time
ip = input("请输入服务器ip（xxx.xxx.xxx.xxx）:")
print("客户端已开启")
sk=socket.socket(socket.AF_INET,socket.SOCK_STREAM)
ip_port=(ip,5000)
while True:
    try:    
        sk.connect(ip_port)
        break
    except ConnectionRefusedError:
        print("服务器拒绝连接，继续尝试连接...")
        time.sleep(2)

print("socket已连接")
print(sk)
print("")

while True:
    message = input("请输入四则运算公式（输入exit退出）")
    sk.send(message.encode('utf-8'))
    if message==('exit'):
        print("客户端主动退出...")
        break
    print("[send] [" + time.ctime(time.time()) + "] " + message)
    print("服务器正在计算中...")
    data=sk.recv(1024)
    print ("[recv] [" + time.ctime(time.time()) + "] " + data.decode('utf-8'))
    print("计算结果为: " + data.decode('utf-8'))
    print("")
    
sk.close()
print ("退出")
