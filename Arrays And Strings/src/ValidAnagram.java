import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;

public class ValidAnagram {
  
	
   public static boolean isAnagram(String s, String t) {
	   char[] a = s.toCharArray();
	   char[] b = t.toCharArray();
	   
	   Arrays.sort(a);
	   Arrays.sort(b);
	   
	 
	   
	return Arrays.equals(a, b);
        
    }
	
	public static void main(String[] args) {
		System.out.println(isAnagram("abdu","dbua"));
      
		 HashMap<Integer, Integer> i = new HashMap<Integer, Integer>();
	}
}
