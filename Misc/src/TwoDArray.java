
public class TwoDArray {

	 
	public static void main(String[] args) {
		int a [] [] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}}	;
		
		//print the initial array
		System.out.println("--------------------");
		System.out.println("the initial 2d array");
		System.out.println("--------------------");
		for(int i=0; i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				System.out.print(a[i][j]+" , ");
			}
			System.out.println();
		}
		
         
         //System.out.println(l);
         // converting to a 1d array 
         int b[] = new int [a[0].length* a.length];
         int x = 0;
         for(int i=0;i<a.length;i++) {
        	       for(int j = 0; j<a[0].length ; j++) {
        	    	      b[x] = a[i][j];
        	    	      x++;
        	       }
         }
         System.out.println("--------------------");
         System.out.println("turned to 1d array");
         System.out.println("--------------------");
         for(int v:b) {
        	   System.out.print(v+" , ");
         }        
         // rotate the matrix   
         int c [] [] = new int [a[0].length][a.length];
         int row = 0; int col = 0; 
        
       for(int k = 0;k<a[0].length;k++) { 
         for(int j=0 ; j<a.length ; j++) {
        	       c[row][col] = a[j][k];
        	       col++;
         }
         col = 0;
         row++;
       }
       System.out.println();
       System.out.println("--------------------");
       System.out.println("rotated 2d array");
       System.out.println("--------------------");    
       for(int i=0; i<c.length;i++) {
			for(int j=0;j<c[0].length;j++) {
				System.out.print(c[i][j]+" , ");
			}
			System.out.println();
		}
      
	}

}
