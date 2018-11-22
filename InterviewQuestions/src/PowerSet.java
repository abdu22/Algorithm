import java.util.ArrayList;
import java.util.List;

public class PowerSet {

	public static void main(String[] args) {
		int[] input = {1,2,3};
		List<List<Integer>> output = subsets(input);
		
		System.out.println(output);
		
		
	}
 
	// Given a set of distinct integers, nums, return all possible subsets (the power set).
	/*Input: nums = [1,2,3]
			Output:
			[
			  [3],            
			  [1],            0001
			  [2],
			  [1,2,3],
			  [1,3],
			  [2,3],
			  [1,2],
			  []
			]*/
	
	public static List<List<Integer>> subsets(int nums[]){
		int l = (int) Math.pow(2, nums.length);
		
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		
		
		for(int i=0; i<l ; i++) {
			ArrayList<Integer> a = new ArrayList<Integer>();
		    int k = i;
		    int count = 0;
		    while(k>0) {
		    	           if(k%2 == 1) {   
		    	           a.add(nums[count]);   
		    	        	}
		    	        count ++;  k = k/2;
		    }
		   ans.add(a);
		  // System.out.println(a);
		  //a.clear();
		}
		return ans;
		
	}
}
