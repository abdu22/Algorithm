
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
	
	
	public static boolean isPalindrome2(String s) {
		String reg = "[^a-zA-Z0-9]";
	    String str = s.replaceAll(reg, "");
	    str = str.toLowerCase();
	    System.out.println(str);
		char []c  = str.toCharArray();
		int l=0; int r=c.length-1;
		while(l<r) {
			if(c[l]!=c[r]) {
				System.out.println(c[l]+","+c[r]);
				return false; 
				}
			l++; r--;
		}
		return true;
	}
	public static void main(String[] args) {
	   String s = "A man, a plan, a canal: Panama";
	  
	   
	   System.out.println(isPalindrome2(s));
	   
	   String s2 = "";
	   System.out.println(isPalindrome2(s2));
	   
	} 

}
