import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseWord {
	// works but it doesn't work for double space 
	 /*public static String reverseWords(String s) {
		 
		List<String> l = new ArrayList<String>();
		
		l.addAll(Arrays.asList(s.split(" ")));
		StringBuilder sb = new StringBuilder();
		
		for(int i=l.size()-1 ; i>=0 ; i--) {
			 sb.append(l.get(i)).append(" ");
		}
		
		return sb.toString();  
		
	    }*/
	
	
	 
	 public static String reverseWords(String s) {
		 
			StringBuilder sb = new StringBuilder();
			
		    int j = s.length();
		    for(int i = s.length()-1; i>=0; i--) {
		    	      if(s.charAt(i)==' ') {
		    	    	      j=i;
		    	      }else if(i==0 || s.charAt(i-1) == ' ') {
		    	    	         if(sb.length() == 0) {
		    	    	        	       sb.append(s.substring(i, j));
		    	    	         }else {
		    	    	        	        sb.append(' ').append(s.substring(i,j));
		    	    	         }
		    	      }
		    }
			
			return sb.toString();  
			
		    }
	public static void main(String[] args) {
		String s = "the sky is blue"; 
		System.out.println(reverseWords(s));
        String [] r = s.split(" ");
        String R = "";
        int v = r.length-1;
        while(v>=0) {
        	   R=R+r[v] + " ";
        	   v--;
        }
        System.out.println(R);
	}

}
