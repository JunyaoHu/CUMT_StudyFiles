a,b,c=int(input()),input(),input()
ls=b.split(' ')
ls1=[]
for i in range(len(ls)):
    ls1.append(int(ls[i]))
s=0
for i in ls1:
    if i > sum(ls1)/a:
        s += i-sum(ls1)/a
print(int(s))
