import java.util.List;

public class FindAllAnagram {

	
   public List<Integer> findAnagrams(String s, String p) {
	    
  List<Integer> l = new ArrayList<>();
         if (s == null || s.length() < 1 || p.length() > s.length()) {
             return l;
         }
         int [] aP = new int[26];
         for(int i=0; i <p.length(); i++) {
             aP[p.charAt(i)-'a']++;
         }
         for(int i = 0; i < s.length()-p.length() +1 ; i++){

             int []aS = new int[26];
             for (int j = i; j< (i+p.length()); j++){
                 aS[s.charAt(j)-'a']++;
             }
             if(isMatch(aP,aS)) l.add(i);
         }
       return l;
    }

    public static boolean isMatch(int [] a, int []b) {
        for (int i = 0; i < a.length; i++) {
            if(a[i] != b[i]) return  false;
        }
        return true;
    }
	public static void main(String[] args) {
		

	}

}
