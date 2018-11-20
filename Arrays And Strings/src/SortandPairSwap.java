
public class SortandPairSwap {

	public static void main(String[] args) {
		int a [] = {4,3,2,5,7,9,11};
		
		Swap(a);
		
		//for(int x:b)
		//	System.out.println(x);

	}

	public static int [] Swap(int [] a){
		
		for(int x:a)
			System.out.print(x);
       
       for(int i = 0; i< a.length-1;i++) {  
           
           int x=i;
           
            for(int j=i+1; j<a.length; j++) {         
                  if(a[j] < a[x])
                      x = j;
                      
              int temp = a[x];
              a[x] = a[i];
              a[i] = temp;        
                   
              }
          } 
	     System.out.println();
	     
	     for(int x:a)
				System.out.print(x);
	                
	     int i=1;
	    while(i<a.length-1) {
	         int temp = a[i];
	         a[i] = a[i+1];
	         a[i+1] = temp;  
	         
	         i = i+2;     
	     }
	    System.out.println();
	    for(int x:a)
			System.out.print(x);
		return a;         
	     
	}
}
