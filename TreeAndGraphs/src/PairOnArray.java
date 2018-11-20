import java.util.HashMap;

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
	
	
	public static void main(String[] args) {
		 int a [] =  {23, 12, 27, 15, 18, 7, 9, 10, 20};
		 
		System.out.println(findTwoSum(a,32));
	}

}
