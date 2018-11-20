
public class MaxDepthofParenthesis {
	public static void main(String[] args) {
		 
		
		/*int depth = -1;
		boolean success = false; 
		
		if(depth >=0) success = true;
		 try {
      	     success = true;
          }catch (Exception e) {
         
          System.out.println("wrong parenthesis input");
         }
		 
		 System.out.println("GOOD");
		
		int b = 0;
		
		    if (b == 0) {
		      try {
				throw new Exception("Wrong parenthesis");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			    }       
		    }*/
		
		
		System.out.println(maxD("abccu(1(2)3(x(y)z))m(n)o"));
		System.out.println(maxD("abccu(1(2)3(x(y)z))m(n)o"));
		
		System.out.println(maxD(")"));
		
	}
	
	public static int maxD(String s){
		   char [] cha = s.toCharArray(); 
		   
		   
		   int depth = 0;  int maxD = 0;
		   
		   
		   for(int i = 0 ; i<cha.length ; i++){
		   
		        if(cha[i] == '('  ) depth ++; 
		        
		        if(maxD < depth) maxD = depth;
		        
		        if(cha[i] == ')' ) depth --; 
		        
		            try{
		               	if(depth < 0)  throw new myException("Wrong Parentesis Patern");  // if we get ')' before '(' 
		            }catch(myException e){
		            	
		             System.out.println("=============");
		            	 System.out.println(e.getMessage());
		            	 
		            }
		          
		         }
		   
		      try{
		    	  if(depth != 0) throw new myException("Wrong Parentesis Patern" );  // if we have extra '('
		            }catch(myException e){
		            	System.out.println("||||||||||||||");
		             System.out.println(e.getMessage());
		            }
		   return maxD;
		}
}

class myException extends Exception 
{
  
    public myException(String errorMessage) 
    {
        super(errorMessage);
    }
}
