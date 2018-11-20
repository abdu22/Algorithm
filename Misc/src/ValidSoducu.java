
public class ValidSoducu {
	public static boolean isValidSudoku(char[][] board) {
        // check for rows 
	for(int j=0; j<9 ; j++) {
		char aa[] = new char [9];
          for(int k=0 ; k<9;k++) {
              	 aa[k] = board[j][k];
             }    
        //for(char x:aa) System.out.print(x);  
         if(!checkrepetInLine(aa)) {
       	  System.out.println("1 isvalid");
       	     return false;
         }       
	}
        // check for rotated array row = given column 
	for(int j=0; j<9 ; j++) {
           char a[] = new char [9];
           for(int k=0 ; k<9;k++) {
               	 a[k] = board[k][j];
              }  
          if(!checkrepetInLine(a)) {
        	  System.out.println("1 isvalid");
        	     return false;
          } 
	}
        // check for 3X3 internal  
        // convert each 3X3 to linear array 
        int m = 3;
        while(m <=9) {
                int n = 3 ;
                while (n <=9) {
                    char [] Convertedarray = convert3x3toLinear(board,m,n);
                    if(!checkrepetInLine(Convertedarray)) return false;
                    n = n+3;
                }
                   m = m+3;
            }   
        return true;  
    }  
    public static boolean checkrepetInLine(char [] a){
        
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i]!= '.' && a[i] == a[j]) {
                	 System.out.println("1 check" + a[i]+" , "+a[j]);
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
    	     System.out.println(isValidSudoku(input));
    }
}
