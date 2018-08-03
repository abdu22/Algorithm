import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesis {
 
	public static boolean isValid(String s) {
		
// ======================================================
//  Option Once : Using HashMap	 to store the Characters 
// ======================================================	

		HashMap <Character, Character> m = new HashMap<>();
		m.put('(',')');
		m.put('[',']');
		m.put('{','}');
		
		Stack<Character> st = new Stack<>();
		char [] c = s.toCharArray();
		
		for(char x:c) {
			if(m.containsKey(x)) {
				st.push(m.get(x));
			}else {
				if(st.isEmpty() || st.pop() != x) return false;
			}
		}
		 return st.isEmpty();
	    }
// ====================================================
//   Option two : Using "if"	 to store the Characters 
//=====================================================		
/*	public static boolean isValid(String s) {
		 if(s.length() == 0) return true;
		if(s.length() % 2 !=0) return false;
		 Stack<String> stack = new Stack<>();
		 
		 for(int i=0; i<(s.length()) ; i++) {
			 
			 if(s.substring(i, i+1).equals("[")) 
			      stack.push("]");
	
			 if(s.substring(i, i+1).equals("(")) 
				 stack.push(")");
				 
			 if(s.substring(i, i+1).equals("{")) 
				 stack.push("}");
			 if(stack.empty()) continue;
			 if(s.substring(i, i+1).equals("]")) { if(!stack.pop().equals("]")) return false; }
			 if(s.substring(i, i+1).equals(")")) { if(!stack.pop().equals(")")) return false; }
			 if(s.substring(i, i+1).equals("}")) { if(!stack.pop().equals("}")) return false; }
				
		 } 
		 if(!stack.empty()) return false;
       return true;
	    }
	*/
	public static void main(String[] args) {
		String x = "{[()]}";
		
		System.out.println(isValid(x));
		
	    String y = ")[";
			
	    System.out.println(isValid(y));
	    
	    String Z = "[](){}";
		
		System.out.println(isValid(Z));
		
        String v = "((";
		
		System.out.println(isValid(v)); 
	}

}
