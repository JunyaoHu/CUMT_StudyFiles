public class ChoiceSort
{
	public static void main(String arg[])
	{
		int i,min;
		int str[]={2,13,41,58,32};
		for(i=0;i<5;i++)
		{
			min=i;
			//数组产生越界
			for(int j=i+1;j<6;j++)
			{
				if(str[min]>str[j])
				{
					int at=str[j];
					str[j]=str[min];
					str[min]=at;
				}
			}
		}
		for(i=0;i<5;i++)
		System.out.println(str[i]+" ");
	}
}