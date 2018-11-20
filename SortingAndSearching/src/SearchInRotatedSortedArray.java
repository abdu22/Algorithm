
public class SearchInRotatedSortedArray {
	
	public static int search(int[] nums, int target) {
	  // find the min value. to know where the circular sorting starts
	if(nums.length == 0) return -1;
	  int l = 0 ; int r = nums.length-1;  int k=0;

		  while(l<r) {
			  if(r-l == 1) {
				  k = r;
				  break;
			  }
			  int m = (l+r)/2;
			  if(nums[m]>nums[r]) l=m;
			  else if(nums[m] < nums[l]) r=m;
			  else l = l+1;                       // for duplication 
		  }
	  System.out.println(k+"___");
	  // decide which way to go. to the right or to the left of the min value
	  l = 0; r = nums.length-1 ;
	  if(target >= nums[k] && target <= nums[r])
		  l=k;
	  else 
		  r=k-1;
	  // serach for target 
	  
	  
	  while(l<=r) {
		 int  m = (l+r)/2;
		 if(nums[m] == target) return m;
		 
		 if(nums[m] > target)  r = m-1;
		 else l = m+1;
	  }
       return -1; 
    }
	
	
   public static void main(String []args) { 
	   int nums [] = {4,5,6,7,0,1,2};
	   int target = 0;
	   System.out.println(search(nums,target));
	   
	   
	   int nums2 [] = {2,5,6,0,0,1,2};
	   int target2 = 0;
	   System.out.println(search(nums2,target2));
   }
} 
