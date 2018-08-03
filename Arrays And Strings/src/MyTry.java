
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
		 
		 System.out.println(s4==s5);
	    	 System.out.println(s4.equals(s5));
	    	 System.out.println("=============="); 	 
	  Integer i =new Integer(1);
	  Integer j =new Integer(1);
	  System.out.println(i==j);
	
	
	
	}

}
