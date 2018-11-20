import java.util.Stack;

public class ReversePolish {
	
	
    public static int evalRPN(String[] tokens) {
    	  Stack<Integer> s = new Stack<>();
    	     
    	  for(int i = 0; i<tokens.length ; i++) {
    		  
    		  if(tokens[i] == "/" || tokens[i] == "*" || tokens[i]=="+" || tokens[i] == "-"){
    			  if((tokens.length >=2)) {
    				  int y = s.pop();
        			  int x = s.pop();
        			  s.push(help(x,y,tokens[i]));
    			  }else {
    				  System.out.println("error");
    				  break;	  
    			  }	  
    		  }else {
    		      s.push(Integer.parseInt(tokens[i]));
    		  }
    	  }
         return s.peek();
    }
    
    public static Integer help(int x, int y, String op) {
    	   if(op == "+")       return x+y;
    	   else if (op == "-") return x-y;
    	   else if (op == "*") return x*y;
    	   else                return x/y;
    }
    
    
	public static void main(String[] args) {
		String[] tokens = {"2","1","+","3","*"};
		System.out.println(evalRPN(tokens));
		
		String[] tokens2 = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
		System.out.println(evalRPN(tokens2));
		
		String[] tokens3 = {"4", "13", "5", "/", "+"};
		System.out.println(evalRPN(tokens3));
		
		int a = 1;
		if(a == 1)
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	
     
}
