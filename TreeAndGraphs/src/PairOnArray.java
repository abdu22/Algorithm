import java.util.HashMap;
import java.util.IllegalFormatException;

public class PairOnArray {
    
	/*
	 * How to find all pairs on integer array whose sum is equal to given number?
	 * 
			int [] arrInt = new int[]{23, 12, 27, 15, 18, 7, 9, 10, 20};
			
			int target = 32 ;
			
			public void findTwoSum(int[]intArray, int target){

			}

			your function should find that:
			[23 , 9]
			[12, 20]
			
			*/
	
	
	
	public static String findTwoSum(int[]intArray, int target){
          
		HashMap <Integer, Integer> h = new HashMap<Integer, Integer>();
		String ans = "";
		
		for(int i=0; i<intArray.length ; i++) {
			
			   int n = target-intArray[i];
			   
			   if(h.get(n) == null) {
		
				     h.put(intArray[i], 0); 
				     
			   }else { 
                      ans = ans + " [ " + n + " , " +  intArray[i] + " ]" ; 
			   } 
		   }
		return ans;
	}
	
	
	public static String findTwoSum2(int [] a , int t) {
		HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
		 String s = "";
		for(int i=0; i<a.length ; i++) {
			 if(h.get(t-a[i]) != null) {
				 s = s+"[ "+h.get(t-a[i]) +" , "+a[i]+" ] ";
			 } 
			 h.put(a[i], a[i]);
		}
		return s;
	}
	public static void main(String[] args) {
		 int a [] =  {23, 12, 27, 15, 18, 7, 9, 10, 20};
		 
		System.out.println(findTwoSum2(a,32));

	}

}
