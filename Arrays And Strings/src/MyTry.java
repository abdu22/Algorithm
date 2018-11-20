import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MyTry {

	public static void main(String[] args) {
		/*Integer a = 79;
		String s = "";
		//System.out.println(a%10);
		//System.out.println(a/10);
 
		
		s = s + a.toString();
		
		System.out.println(new StringBuffer(s).reverse());
		
		System.out.println(Math.pow(0, 0));
		
		long e = 2147483647;
		long f = 2147483647;
		//long g = 4294967294;
		//System.out.println(g);
*/
		String s1 = new String("xxx");
		 String s2 = new String("xxx");
		 String s3 = s1;
		 
		 System.out.println(s1==s2);
		 System.out.println(s1==s3);
		 System.out.println(s1.equals(s2));
		 System.out.println("==============");
		 String s4 = new String();
		 String s5 = new String();
		 
		 System.out.println("xxxxxxxxxxx");
		 System.out.println(s4==s5);
	    	 System.out.println(s4.equals(s5)+": equal ");
	    	 System.out.println("=============="); 	 
	  Integer i =new Integer(1);
	  Integer j =new Integer(1);
	  System.out.println(i==j);
	  System.out.println("=============="); 	 
	  System.out.println("=============="); 	 
	  String x = "  123";
	  System.out.println(x);
	  
	  String y = x.replaceAll(" ", "");
	  System.out.println(y);
	  System.out.println(!y.startsWith("[^0-9]"));
	  
	  
	  String d = "  ";
	 System.out.println(d.length());
	  
	 Collection c = new ArrayList<>();
	}
    public void x() {
   
    }
}
