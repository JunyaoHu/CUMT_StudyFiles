public class Add
{
	public static void main(String[ ]args)
    { 
       int j;   //��ѭ������
       int i;   //��ѭ������
       int k;   //��i+j
       System.out.println("     1    2    3    4    5    6    7    8    9");
       for(i=1;i<=9; i++)
       {
        for(j=0;j<=9; j++)
        { k=i+j;
          if (j==0)
          System.out.print(i+"    ");
          else
            if (k>9) System.out.print(k+"   ");    
            //��������֮��ո�һλ����һ�ո�ʹ�ӷ������
            else
              System.out.print(k+"    ");
        }
       System.out.println();
       }
    }
}
