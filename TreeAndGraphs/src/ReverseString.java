
public class ReverseString {
    
	 // this is string  
	 // siht si gnirts
	
	public static String reverse(String s) {
		
		String [] sa = s.split(" ");
		
		String ans = ""; 
		
		for(int i=0; i<sa.length ; i++) {                             // 
			   
			  for(int j=sa[i].length()-1; j >= 0; j--) {             // O(n)
				      ans = ans + sa[i].charAt(j); 
			  }
			  ans = ans + " ";
		}
		return ans ;
		
	}
	public static String reverse2(String s) {
		
		String [] stAr = s.split(" ");
		String ans = "";
		for(String x:stAr) {
			String a = "";
			 for(int i=x.length()-1; i>=0 ; i--) {
				  a = a+x.charAt(i);
			 }
			 ans = ans + a + " ";
		}	
		return ans;
	}
	public static void main(String[] args) {	
		String input = "this is string"; 
		
		String output = reverse(input);
		System.out.println(output);
        String output2 = reverse2(input).trim();
		System.out.println(output2);
		System.out.println(output2.length());


	}

}
