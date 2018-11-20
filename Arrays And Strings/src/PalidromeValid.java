
public class PalidromeValid {
    
	public static boolean isPalindrome(String s) {
	
		String x = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		//System.out.println(x);
		
	  int l = 0; int r = x.length()-1;
	 // System.out.println(r);
	   while(l<r) {
		    if(x.charAt(l) != x.charAt(r)) {
		    	return false;
		    	}
		    l=l+1; r--;
	   }
	   //System.out.println(l+ " , "+ r);
        return true;
    } 
	
	
	
	public static void main(String[] args) {
	   String s = "A man, a plan, a canal: Panama";
	  
	   
	   System.out.println(isPalindrome(s));
	   
	   String s2 = "";
	   System.out.println(isPalindrome(s2));
	   
	} 

}
