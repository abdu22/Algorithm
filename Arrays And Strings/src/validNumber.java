
public class validNumber {
	
    public static boolean isNumber(String s) {
    	   int i=0;           int j = s.length();
    	   boolean befoE = false;
    	   boolean afteE = true;    
    	   
    	   
    	   if(s.isEmpty()) return false;
    	   boolean ans = false;
    	   // skiping the first white spaces. 
    	   while(i<j && Character.isWhitespace(s.charAt(i))) 
    		    i++;
    	   // if we get -/+ before any digit , skip it
    	   if(i<j && ((s.charAt(i) == '-') || (s.charAt(i) =='+')))  i++;
    	
    	   // scan through the numbers 
    	   
    	   while(i < j && Character.isDigit(s.charAt(i))) {
    		     //if(s.charAt(i)>'0') 
    		   befoE = true;
    		     ans = true;
    		     i++;
    	   }
    	   
    	  // if we got ' . '  , skip it once  and continue scanning the rest. 
    	  if(i < j && s.charAt(i) == '.') {
    		     i++;      
    	  }
    	  while(i < j && Character.isDigit(s.charAt(i))) {
    		  //if(s.charAt(i)>'0') 
    		  befoE = true;
	    	    ans = true;
	    	    i++;
	     }
    	  
    	  if(i < j && s.charAt(i) == 'e' && befoE==true) {
    		  afteE = false;       // if we get e . . we need to get other digit to make aftE=true   
 		     i++; 
    	  }
    	  if(i<j && (s.charAt(i-1)=='e') &&((s.charAt(i) == '-') || (s.charAt(i) =='+')))  i++;
    	  while(i < j && Character.isDigit(s.charAt(i))) {
	    	    ans = true;
	    	    afteE = true;      // making back afteE = true;
	    	    i++;
	     }
    	  // if we have white space after numbers 
    	  while(i < j && Character.isWhitespace(s.charAt(i)))  i++;
    	  
    	  // if we get any character other than (digit, '-' , '+' ) and number after white space  ======   j and i will not be equal. 
    	   
        return ans && i == j && afteE;
    }
	public static void main(String[] args) {
		String s1 = " ";
		String s2 = "3.4e10";
		String s3 = "e ";
		
		
		//System.out.println(isNumber(s1));
		//System.out.println(isNumber(s2));
		System.out.println(isNumber(s3));

	}

}
