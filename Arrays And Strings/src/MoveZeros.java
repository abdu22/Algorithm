
public class MoveZeros {

	public static void main(String[] args) {
		int a [] = {0,1,0,0,0,3,12};
		
		int b [] = {0,0,1,0,0,0};
		moveZeroes3(a);
		System.out.println();
		moveZeroes3(b);
		System.out.println();
		System.out.println("= = = = = = = = = = = = = =");
		//moveZeroes2(a);
		System.out.println();
		//moveZeroes2(b);
	}
    
	public static void moveZeroes(int[] nums) {
		
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] ==0 && nums[i+1]!=0 ) {
                int temp = nums[i];
                nums[i] = nums[i+1]; 
                nums[i+1] = temp;
                i = -1;
            }
        }
        for(int x:nums) {
        	System.out.print(x+",");
        }  
    }
	
    public static void moveZeroes2(int[] nums) {
		int count = 0;
		
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0)
            	   nums[count++] = nums[i]; 
        }
        
        while(count<nums.length) {
        	  nums[count++] =0;
        }
        for(int x:nums) {
        	System.out.print(x+",");
        }
        
    }

    public static void moveZeroes3(int[] nums) {
    	
    	int count = 0;
    	for(int i=0; i<nums.length ; i++) {
    		if(nums[i]!=0) {
    			nums[count] = nums[i];
    			count++;
    		}	
    	}
		for(int k=count;k<nums.length;k++) {
		  nums[k] = 0;        		
		}
		for(int x:nums)
		System.out.print(x+",");
		
    }
}
