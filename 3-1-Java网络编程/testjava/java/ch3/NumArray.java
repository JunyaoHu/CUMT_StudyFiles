public class MultiArray{
	public static void main(String[] args){
		final int maxLine=10;
		int yanghui[][]=new int[maxLine][];
		for(int i=0;i<yanghui.length;i++)
		 yanghui[i]=new int[i+1];
		yanghui[0][0]=1;
		
		for(int i=1;i<yanghui.length;i++)
		{
			yanghui[i][0]=1;
			yanghui[i][yanghui[i].length-1]=1;
			for(int j=1;j<yanghui[i-1].length;j++)
			{ yanghui[i][j]=yanghui[i-1][j-1]+yanghui[i-1][j];}
		}
		for(int i=0;i<yanghui.length;i++)
		{for(int j=0;j<yanghui[i].length;j++)
		   System.out.print(yanghui[i][j]+"\t");
		   System.out.println();
		}
	}
}
				