
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
	 
	public static void main(String[] args) {
		
		String input = "this is string"; 
		
		String output = reverse(input);
		
		System.out.println(output);

	}

}
