
public class ImplementStrStr {

	
public static int strStr(String haystack, String needle) {
	if(needle.isEmpty() ) return 0;
	if(haystack.isEmpty() || haystack.length() < needle.length()) return -1;
	int hl = haystack.length();   int nl = needle.length();
	int k = 0; int j = 0;
	for(int i=0; i<hl; i++) {
		
		 if(haystack.charAt(i) == needle.charAt(0)) {
			 j = i;
			 while(k<nl && j<hl){
				 
				// System.out.println(haystack.charAt(j)+" , "+needle.charAt(k));
				 if(haystack.charAt(j) != needle.charAt(k)) {
					 break;
				 }
				 j++; k++;
			 }
			 
			 if(k==nl) {
				 return (j-k);
			 }
			 else k = 0;
		 }
		 k = 0;
	}
	return -1;   
    }
	public static void main(String[] args) {
		//System.out.println(strStr("aaa", "aaaaaaa"));
		//System.out.println(strStr("hello", "ll"));
		System.out.println(strStr("mississippi", "issip"));
		
		System.out.println(strStr("missipssippi", "issip"));

	}

}
