class Base {
static int i;

Base() {
add(1);
System.out.println("i in Base constructor is:"+i);
}
void add(int v) {
i += v;
}

void print() {
System.out.println(i);
}
}
class Extension extends Base {
Extension() {
super();
add(2);
System.out.println("i in extension constructor is:"+i);
}
void add(int v) {
i += v*2;
}
}
public class Test11 {
public static void main(String  args[]) {
 Base b=new Base();
 Extension ex=new Extension();
 b=ex;
 b.add(2);
 b.print();
 }
}
