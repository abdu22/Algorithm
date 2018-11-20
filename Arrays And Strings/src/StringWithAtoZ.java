import java.util.HashMap;
import java.util.Set;

public class StringWithAtoZ {
    
	public static void main(String[] args) {
		String s = "abcdefghijklmnopqrstuvwxyz";
		String s2 = "abcdefghijklmnopqrstuvwzzzz";
         System.out.println(hasAllAlphabet(s));
         System.out.println(hasAllAlphabet(s2));
	}
    public static boolean hasAllAlphabet(String s) {
    	  if(s.length()<26) return false;
    	  char c[] = s.toCharArray();
    	  HashMap<Character,Integer> h = new HashMap<Character,Integer>();
    	  
    	  for(Character x:c) {
    		  if(h.get(x) == null) {
    			  h.put(x, 0);
    		  } 
    	  }
   Set<Character> keys = h.keySet() ;
   
   if(keys.size() == 26) return true;
   else return false;
    }
} 
