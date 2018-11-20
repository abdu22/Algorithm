
public class Unique {

	public static void main(String[] args) {
		System.out.println(isAllUnique("AcAcAcAcB")); 

	}
	public static boolean isAllUnique(String st) {
		for(int i=0; i<st.length()-1; i++) {
			
			if(st.charAt(i)!=st.charAt(i+1)) return false;
			
			
			
		}
		return true;
	}

}
