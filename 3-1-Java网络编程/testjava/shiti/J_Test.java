public class J_Test
{
  public static void main(String args[])
  {
     int a=2;
     switch(a)
     {
     	case 1:
     	    a+=1;
     	    break;
     	case 2:
     	    a+=2;
        case 3:
            a+=3;
            break;
        case 4:
            a+=4;
            break;
        default:
            a=0;
     }
     System.out.println(a);
  }
}
        