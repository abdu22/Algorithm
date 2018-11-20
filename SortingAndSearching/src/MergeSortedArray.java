
public class MergeSortedArray {
   
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
           int k = 0 ;
          if(nums2.length > 0) { 
           for(int i=0; i<m && k<n ; i++) {
        	      if(nums1[i] > nums2[k]) {
        	    	     for(int j = m ;j>i ; j--)
        	    	    	   nums1[j] = nums1[j-1];
        	    	   nums1[i] = nums2[k];
        	    	   k++; m++;
        	      }
           }
           while( k < nums2.length) {
        	       nums1[m] = nums2[k];
        	       k++; m++;
           }
          }
    }
	
	public static void main(String[] args) {
		 int n1 []= {2,0} ;
		 int n2 []= {1};
		 int m = 1;
		 int n = 1;
		 merge(n1,m,n2,n);
		 
		 for(int x:n1)
			 System.out.println(x);
		 
	}

}
