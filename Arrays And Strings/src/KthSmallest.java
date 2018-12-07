
public class KthSmallest {

	public static void main(String[] args) {
		int a[] = {5,2,1,7,9,12,4,3};
		int k = 7;
		System.out.println("the "+k+"th smallest is : "+smallestK(a,k));
	}
	
 //  5,2,1,7,9,12,4,3
   public static int smallestK(int [] a, int k) {
	   int ans [] =  sort(a);
	   
	   for(int x:ans) System.out.print(" , "+x);
	   System.out.println();
	   return a[k-1];
   }
   public static int[] sort(int a[]) {
	   return sort(a,0,a.length-1);
   }
   public static int[] sort(int a[],int l, int r) {
	   int m = (l+r)/2;
	   if(l<r) {
		   sort(a,l,m);
		   sort(a,m+1,r);
		   merge(a,l,m,r);	   
	   }
	   return a;
   }
   public static int [] merge(int[]a,int l,int m, int r) {
	   int l1 = m-l+1;   int l2 = r-m;
	   int a1[] = new int[l1]; 
	   int a2[] = new int[l2];
	   for(int i=0; i<a1.length ; i++)
		   a1[i] = a[l+i]; 
	   for(int i=0; i<a2.length ; i++)
		   a2[i] = a[m+1+i];
	   
	   /*for(int x:a1) System.out.print(" , "+x);
	   System.out.println();
	   for(int x:a2) System.out.print(" , "+x);*/
	   
	   int i = 0; int j = 0; int k = 0;
	   while(i<a1.length && j<a2.length) {
		     if(a1[i]< a2[j]) {
		    	 a[l+k] = a1[i];   i++;
		     }else {
		    	 a[l+k] = a2[j];   j++;
		     }
		     k++;
	   }
	   while(i<a1.length) {
		   a[l+k] = a1[i];  i++; k++;
	   }
	   while(j<a2.length) {
		   a[l+k] = a2[j];  j++; k++;
	   }
    return a;
   }
   
}
