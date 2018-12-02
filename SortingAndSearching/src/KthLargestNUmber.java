public class KthLargestNUmber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  k = 2;
        int a[] = {3,9,2,6,7,1,4,8} ;    
  
  System.out.println("result : "+kthLargest(a,k));
   
   for(int x:a)
   System.out.print(x);
  
	}
   public static int kthLargest(int a[], int k) {
	   
	   sort(a,0,a.length-1);  
	   return a[a.length-k];
   }
   public static void sort(int a[], int l, int r) {
	    int m = (l+r)/2;
	    if(l<r) {
	    	sort(a,l,m);
	    	sort(a,m+1,r);
	    	merge(a,l,m,r);
	    }
   }       
   private static void merge(int[] a, int l, int m, int r) {
	       int la [] = new int[m-l+1];
	       int ra [] = new int[r-m];
	       
	        for(int i=0; i<la.length ; i++)  la[i] = a[l+i];
	        
	        for(int i=0; i<ra.length; i++)  ra[i] = a[m+i+1];
	        
	        int k = 0;  int len1 =0; int len2 = 0; 
	        
	        while(len1 < la.length && len2 < ra.length) {
	        	  
	        	   if(la[len1] < ra[len2]) {
	        		    a[l+k] = la[len1];
	        		    len1++;
	        	   }else {
	        		   a[l+k] = ra[len2];
	        		   len2++;
	        	   }
	        	   k++;
	        } 
	        
	        while(len1<la.length) {
	        	 a[l+k] = la[len1]; 
	        	 len1++; k++;
	        }
	        while(len2<ra.length) {
	        	 a[l+k] = ra[len2];
	        	 len2++; k++;
	        }
     }
}
