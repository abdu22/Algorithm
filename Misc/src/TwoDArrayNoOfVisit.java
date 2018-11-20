
public class TwoDArrayNoOfVisit {     
	public static int [][] noOfVisit(int a[][]){
		int b [][] = new int [a.length][a[0].length];
		for(int i=0; i<a.length; i++) {		
			 for(int j=0; j<a[i].length ; j++) {
				 int count = 1;
				 int x = i+1; int y = j+1 ;
				 
					 while(x<a.length) {
						  if(a[i][j] > a[x][j]) {
							  count++; x++;
						  }else { break; }
					 }			 
                      while(y<a[i].length) {
						   if(a[i][j] > a[i][y]) {
							   count++; y++;
						   }else { break; }
					 }
				  b[i][j] = count;
			 }
		}
		return b;
	} 
	public static void main(String[] args) {
		int c [] [] = { {1,2,3},
				        {2,3,1},
				        {3,1,2}  }; 
		for(int i=0; i<c.length;i++) {
			for(int j=0;j<c[0].length;j++) {
				System.out.print(c[i][j]+" , ");
			}
			System.out.println();
		}
		 c = noOfVisit(c);
		 System.out.println("==========");
		for(int i=0; i<c.length;i++) {
			for(int j=0;j<c[0].length;j++) {
				System.out.print(c[i][j]+" , ");
			}
			System.out.println();
		}
	}

}
