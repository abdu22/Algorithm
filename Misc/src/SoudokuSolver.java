
public class SoudokuSolver {

	public static void solveSudoku(char[][] board) {
        // check for rows 
	for(int j=0; j<9 ; j++) {
		int count = 1;
		int i=0;
		while(i<9) {
			 if(board[j][i] == '.') {
				 board[j][i] = (char)count;
				 count++;
				//after inserting the number
				 //check for the row
				 char aa[] = new char [9];
				 for(int k=0 ; k<9;k++) {
	              	 aa[k] = board[j][k];
				 }
	              	if(!checkrepetInLine(aa)) {
	                 	 // System.out.println("row");
	                 	     continue;
	                   }    
	             
				 //check for the column 
				 for(int k=0 ; k<9;k++) {
	              	 aa[k] = board[k][i];
	              	if(!checkrepetInLine(aa)) {
	                 	  //System.out.println("column");
	                 	    continue;
	                   }    
	             }
				//check for 3X3 matrix
				 
				//find which  3x3 matrix we r in. 
				 int m = 3 ; int n = 3;
				 while(m < 9) {
					 if((m-i)<=0) m= m+3;
					 else break;
				 }
				 while(n < 9) {
					 if((n-j)<=0) m= m+3;
					 else break;
				 }
				// convert each 3X3 to linear array 
				 char [] Convertedarray = convert3x3toLinear(board,m,n);
				 if(!checkrepetInLine(Convertedarray)) {
					//System.out.println("3x3 is invalid  at:");
					 continue;
				  }
			 }
			 i++;
			 System.out.println(" j : "+j+" i : " + i);
		}  
		System.out.println("###############################");
		if(j==2 && i == 9) break;
	} 
    }  
    public static boolean checkrepetInLine(char [] a){
        
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i]!= '.' && a[i] == a[j]) {
                	 //System.out.println("1 check" + a[i]+" , "+a[j]);
                  	return false;
                } 
            }
        }
       return true;   
    }
    public static char [] convert3x3toLinear(char [][] board,int m, int n ){
        char [] Convertedarray = new char [9];
            int p = 0;
            for(int j=m-3 ; j <m; j++) {
                for(int i=n-3; i<n; i++) {
                     Convertedarray[p] = board[j][i];
                     p++;
                } 
            } 
        return Convertedarray;
    }
    
    public static void main(String[] args) {
    	     char [] [] input = {
    	    		 
    	    		 {'5','3','1','.','7','.','.','.','.'},
    	    		 {'6','.','.','.','.','.','.','.','.'},
    	    		 {'.','.','.','.','.','.','.','.','.'},
    	    		 {'.','.','.','.','.','.','.','.','.'},
    	    		 {'4','3','.','.','.','.','.','.','.'},
    	    		 {'7','.','.','.','.','.','.','.','.'},
    	    		 {'8','.','.','.','.','.','.','.','.'},
    	    		 {'.','.','.','.','1','.','.','.','.'},
    	    		 {'.','.','.','.','8','.','.','.','9'},
    	    		 
    	    		                 }; 
    	     for(int i=0;i<9; i++) {
    	    	    for(int j = 0 ; j<9 ; j++) {
    	    	    	System.out.print((input[i][j])+" , ");
    	    	    }
    	    		System.out.println();
    	     }
    	     System.out.println("========================================");
    	     solveSudoku(input);
    	     System.out.println("========================================");
    	     
    	     for(int i=0;i<9; i++) {
 	    	    for(int j = 0 ; j<9 ; j++) {
 	    	    	System.out.print((input[i][j])+" , ");
 	    	    }
 	    		System.out.println();
 	     }
    }
}
