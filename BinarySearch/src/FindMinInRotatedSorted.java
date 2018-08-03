
public class FindMinInRotatedSorted {
    
	public static int findMin(int[] nums) {
		int l = 0; int r = nums.length-1; 
		
		while(l<r) {
			if(r-l == 1) return Math.min(nums[l], nums[r]);
			int m = (r+l)/2;
			//System.out.println(l+","+m+","+r);
			/*if(nums[m]>nums[r]) l=m;
			else r=m;*/
			
			if(nums[m]>nums[r]) l=m;
            else if(nums[m] < nums[l]) r=m;
			else l=l+1;
		}
        return nums[0];
    }
	
	public static void main(String[] args) {
		int a [] = {15,16,17,0,1,2,3,4,8};
		System.out.println(findMin(a));
		
		int b [] = {2,3,4,8,9,10,11,12,0,1};
		System.out.println(findMin(b));
		
		int c [] = {1,3,5};
		System.out.println(findMin(c));
	}

}
