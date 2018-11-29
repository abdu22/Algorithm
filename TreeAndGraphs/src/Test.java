import java.util.ArrayList;

public class Test {

	
	public static void main(String[] args) {
		String s = "abdurahman ";
 
		char [] c = s.toCharArray(); 
		
		String answer = "";
		for(int i = c.length-1; i>=0 ; i--) {
			 answer = answer + c[i];
		}
		
		System.out.println(answer);
		boolean result = true;
		
		for(int i=0 ; i<s.length() ; i++) {
			
			if(s.charAt(i) != answer.charAt(i)) {
				result = false;
				break;
			}
		}
		
		System.out.println(result);
		
		String regexpr = "[^a-zA-Z3-9 ]";
        String regexpr2 =  "[a-zA-Z0-9]";
        String regexpr3 =  "[^a-zA-Z && [o-q]]";
        
        
		
		String input = "*abd opq u 1233!";  
		
		String output = input.replaceAll(regexpr, "");
		String output2 = input.replaceAll(regexpr2, "");
		String output3 = input.replaceAll(regexpr3, "");
		
		System.out.println("[^a-zA-Z3-9 ] : "+output);
		System.out.println("[a-zA-Z0-9] : "+output2);
		System.out.println("[^a-zA-Z && [o-q] : "+output3);
		
		//if(input.length() == output.length())  System.out.println("we don't have speciall char");
		
		//else System.out.println("we have speciall char");
		
		
		
		
			}

}







