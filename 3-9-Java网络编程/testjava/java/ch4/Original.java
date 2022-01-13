package p1;

public class Original{
	int n_friendly=1;
	private int n_private=2;
	protected int n_protected=3;
	public int n_public=4;
	
	void Access(){
		System.out.println("**** ��ͬһ������ ****");
		System.out.println("friendly member "+n_friendly);
		System.out.println("private member"+n_private);
		System.out.println("protected member "+n_protected);
		System.out.println("public member "+n_public);
	}
}

class Derived extends Original{
      void Access(){
        System.out.println("**** ��ͬ�������� ****");
        System.out.println("friendly member "+n_friendly);
        //System.out.println("private member "+n_private);
        //���ܷ���
        System.out.println("protected member "+n_protected);
        System.out.println("public member "+n_public);

        Original o=new Original();
        System.out.println("**** ��ͬ����������������� ****");
        System.out.println("friendly member "+o.n_friendly);
        //System.out.println("private member "+o.n_private);
        //���ܷ���
        System.out.println("protected member "+o.n_protected);
        System.out.println("public member "+o.n_public);
       }
     }


class SamePackageClass{
   void Access(){
     Original o=new Original();
     System.out.println("**** ��ͬ���������� ****");
     System.out.println("friendly member "+o.n_friendly);
     //System.out.println("private member"+o.n_private);
     //���ܷ���
     System.out.println("protected member "+o.n_protected);
     System.out.println("public member "+o.n_public);
    }

}



class AccessControl{
    public static void main(String args[]){

       Original o=new Original();
       o.Access();
       Derived d=new Derived();
       d.Access();
       SamePackageClass s=new SamePackageClass();
       s.Access();
    }
   }











