class TestTransOfValue
{
  public static void main(String args[])
  {
    int val;
    StringBuffer sb1, sb2;

    val = 10;
    sb1 = new StringBuffer("apples");
    sb2 = new StringBuffer("pears");
    System.out.println("val is " + val);
    System.out.println("sb1 is " + sb1);
    System.out.println("sb2 is " + sb2);
    System.out.println("");

    System.out.println("calling modify");
    //按值传递所有参数
    modify(val, sb1, sb2);
    System.out.println("returned from modify");
    System.out.println("");

    System.out.println("val is " + val);
    System.out.println("sb1 is " + sb1);
    System.out.println("sb2 is " + sb2);
  }

  public static void modify(int a, StringBuffer r1,
                            StringBuffer r2)
  {
      System.out.println("in modify...");
      a = 0;
      r1 = null;  //1
      r2.append(" taste good");
      System.out.println("a is " + a);
      System.out.println("r1 is " + r1);
      System.out.println("r2 is " + r2);
  }
}
