class A{
  static void method1(){
    System.out.println("method1");
  }
}
class B extends A{
}
class StaticMethod{
 public static void main(String[] args){
    A.method1();
    B.method1();
}
}
    