import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Sum3 {

	public static void main(String[] args) {
		int [] a = {-4,-1,-1,0,1,2};
		int [] b = {0,0,1,0,-1};
		int [] c = {-2,0,0,2,2};
		
        List<List<Integer>> output = threeSum(a);
        System.out.println(output);       
        System.out.println(threeSum(b));
        System.out.println(threeSum(c));
        
	}
    public static List<List<Integer>> threeSum(int[] nums) {
    	List<List<Integer>> ans = new ArrayList<List<Integer>>();
    	List<Integer> x  = new ArrayList<>();
    	Arrays.sort(nums);
    	for(int i=0; i<nums.length-2;i++) { 
    	 if(i==0 || (nums[i] != nums[i-1])) {
    		 int l = i+1; int r = nums.length-1;
    		 //System.out.println(nums[i]+" ," +nums[l]+" ,"+nums[r]);
    		 while(l<r) {
    			 if(nums[i]+nums[l]+nums[r]==0) {
    				 x.add(nums[i]); x.add(nums[l]); x.add(nums[r]);
    				 l++;
    				 //System.out.println(x);
    				 ans.add(x); 
    				 x = new ArrayList<>();
    				 while(l<r && nums[l]==nums[l-1]) l++;
    			 }else if(nums[i]+nums[l]+nums[r]>0) {
    				 r--;
    			 }else {
    				 l++;
    			 }
    		 }
    	  }	
    		 
    	}
    	//System.out.println(ans);
         return ans;
    }
  
  /*Given array nums = [-1, 0, 1, 2, -1, -4],

		  A solution set is:
		  [
		    [-1, 0, 1],
		    [-1, -1, 2]
		  ]
   */
}
