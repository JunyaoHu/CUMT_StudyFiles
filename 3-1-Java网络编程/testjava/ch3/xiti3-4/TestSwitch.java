public class TestSwitch{
public static void main(String args[ ]){
int  x=1,y=2,i=0,j=0;
switch(x){
case 1: 
switch(y){
case 1: i++;
break;
case 2: j++;
break;
//default:i++;
//j++;
}
case2: i++;
j++;
break;
//default:i++;
//j++;
}
System.out.println("i="+i);
System.out.println("j="+j);
}
}
