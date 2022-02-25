public class MaxDiv
{
	public static void main(String[] args){
		int a=99;
		int i=a-1;
		while(i>0){
			if(a%i==0)break;//不带标号的break，用于结束本层循环
			i--;
		}
		System.out.println(a+"的最大公约数为："+i);
	}
}