//hjghj
 package p2;

class Derived extends p1.Original{
    void Access(){
      System.out.println("**** 不同包的子类 ****");
      //System.out.prinln("friendly member "+n_friendly);
      //不能访问
      //System.out.println("private member "+n_private);
      //不能访问
      System.out.println("protected member "+n_protected);
      //子类可以访问父类
      System.out.println("public member "+n_public);
      
      p1.Original o=new p1.Original();
      System.out.println("****不同包的子类中定义的父类的对象 ****");
     // System.out.println("friendly member "+o.n_friendly);
      //不能访问
      //System.out.println("private member "+o.n_private);
      //不能访问
      //System.out.println("protected member "+o.n_protected);
      //不能访问
      System.out.println("public member "+o.n_public);
      Derived dx=new Derived();
      System.out.println("****不同包的子类中定义的子类类的对象 ****");
      // System.out.println("friendly member "+dx.n_friendly);
      //不能访问
      //System.out.println("private member "+dx.n_private);
      //不能访问
      System.out.println("protected member "+dx.n_protected);
      System.out.println("public member "+dx.n_public);

    }
    

}

class AnotherPackageClass{
   void Access(){
     p1.Original o=new p1.Original();
     System.out.println("**** 另一个包中的其他类 ****");
     //System.out.println("friendly member "+o.n_friendly);
     //不能访问
     //System.out.println("private member "o.n_private);
     //不能访问
     //System.out.println("protected member "+o.n_protected);
     //不能访问
     System.out.println("public member "+o.n_public);
  }
}


public class AccessControl{
   public static void main(String args[]){
       Derived d=new Derived();
       d.Access();
       AnotherPackageClass a=new AnotherPackageClass();
       a.Access();
    }
  }






