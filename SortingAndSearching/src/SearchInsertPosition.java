
public class SearchInsertPosition {
// ======================================================
//  Option One : linear searching = O(n);
// ======================================================	
	/*public static int searchInsert(int[] nums, int target) {
		for(int i=0; i<nums.length; i++) {
			  if(nums[i] == target) return i;
			  if(nums[i] > target) return i;
		}
		return nums.length;
    }*/
// ======================================================
//  Option Two : Binary searching = O(n);   Using Recursion 
// ======================================================	
/*	public static int searchInsert(int[] nums, int target) {
		int l = 0; int m = nums.length-1;
		
		return help(nums,target,l,m);
    }
	public static int help(int [] nums,int target,int l, int m) {
		if(m<l) m = l;   //  to keep 'm' not to become less than 'l'; 
		int mid = (m+l)/2;
		
		if(nums[mid]==target)  return mid;
		if(l == m&& target<nums[mid]) return mid; 
		if(l == m&& target>nums[mid]) return mid+1; 
		if(nums[mid] > target) { 
			
			return help(nums,target,l,mid-1);
		}else {
		    return help(nums,target,mid+1,m);
		}
	}
*/

// ======================================================
//  Option Three (Best) : Binary searching = O(n);   Using while loop 
// ======================================================	
	public static int searchInsert(int[] nums, int target) {
		int l = 0; int m = nums.length-1;
		
		while( l < m) {
			int mid = (m+l)/2;
			if(nums[mid] == target) return mid;
			
			if(nums[mid] < target) l = mid+1;
			else m = mid;
		}
		
		if(nums[l] < target) return l+1;
		else return l;
    }
	public static void main(String[] args) {
		int a[] = {1,3,5,6,7};
		System.out.println(searchInsert(a,5));

		System.out.println(searchInsert(a,0));
		
		System.out.println(searchInsert(a,2));
		
		System.out.println(searchInsert(a,7));
		
		int B[] = {1,3};
		System.out.println(searchInsert(B,0));

	}

}
