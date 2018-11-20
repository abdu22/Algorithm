
public class Palindrem {

	public static void main(String[] args) {
		String reg = "[^a-zA-Z0-9]";    
		String s = " a bdu";
		
		System.out.println(s);
		s = s.replaceAll(reg, "");
		System.out.println(s);
 
		 
	}

}
