class test
{
	int intval;
	public test(int i)
	{
		intval=i;
		}
	}

public class Say
{
public static void main(String args[])
  {
    test a, b;

    a = new test(10);
    b = new test(50);

    System.out.println("before swap...");
    System.out.println("a is " + a.intval);
    System.out.println("b is " + b.intval);
    swap(a, b);
    System.out.println("after swap...");
    System.out.println("a is " + a.intval);
    System.out.println("b is " + b.intval);
  }

  public static void swap(test m, test n)
  {
    test temp = m;
    m= n;
    n= temp;
    m.intval=m.intval+1;
    n.intval=n.intval+10;
  }	
	}