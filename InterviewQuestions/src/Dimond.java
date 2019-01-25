	
	public class Dimond {
	
		public static void main(String[] args) {
			
			BuildDiamond(8);
			
		}
		/*  if n = , 
		               X 
		            X     X
		         X     X     X
	          X	    X     X     X
	  5 => X     X     X      X    X
	          X     X      X     X
	             X      X     X
	                X      X
	                    X  
		  */	
		public static void BuildDiamond(int n) {
			 int N = n; 
			 int c = 1;                                  // one space is represented by " ". 
			 int TspaceN = N+N-1;                        // represent total number of space including 'X'
			 //Building the first half dimond 
			 while(c<=N) {
				 String InternalSpace = " ";			 // we have internal and extrenal space		
				 int NoOfinterSpace = c-1;		         //going down ,  number of internal space is higher 	 
				 int NoOfExterSpace = TspaceN - (c+c-1); // the sume of both left and right external space
				 int x=0;
				 String ExternalSpace = "";
				 while(x<NoOfExterSpace/2) {              // going down , number of external space is lower
					 ExternalSpace = ExternalSpace+ " ";
					 x++;
				 }
				 String print = ExternalSpace+"X";
				 String temp = "";
				 while(NoOfinterSpace>0) {
					 temp = temp+InternalSpace + "X";
					 NoOfinterSpace--;
				 }
				 print = print + temp + ExternalSpace;
				 System.out.println(print);
				 c++;
			 }
			 // Building the second  half dimond 
			 // the same with the above one, except c = 4 and keep decrement. 
			c = n-1;   
			while(c>=1) {
				String InternalSpace = " ";
				 int NoOfinterSpace = c-1;
				 int NoOfExterSpace = TspaceN - (c+c-1);   // the sume of both left and right external space
				 int x=0;
				 String ExternalSpace = "";
				 while(x<NoOfExterSpace/2) {
					 ExternalSpace = ExternalSpace+ " ";
					 x++;
				 }
				 String print = ExternalSpace+"X";
				 String temp = "";
				 while(NoOfinterSpace>0) {
					 temp = temp+InternalSpace + "X";
					 NoOfinterSpace--;
				 }
				 print = print + temp + ExternalSpace;
				 System.out.println(print);
				 c--;
			}	
		}
	
	}
