import java.util.Stack;

public class MinStack {
     
/*	Stack<Integer> stack = new Stack<>();
	Stack <Integer> minStack = new Stack<>();
	public void push(int a) {
		stack.push(a);
		if(minStack.isEmpty() || a <= minStack.peek()) minStack.push(a);   // ' <= ' is important 
	}
    public void pop() {
    	  if(!stack.isEmpty()) {
    	    //  if(stack.peek() == minStack.peek()) minStack.pop();       // donn't use '==' instade use "equals"
    	        if(stack.peek().equals(minStack.peek())) minStack.pop();
    	    stack.pop();
    	  }
    }
    public int top() {
    	   return stack.peek(); 
    }
    
    public int getMin() {
    	return minStack.peek();
    	}
    */
    
    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();
    
    public void push(int x) {
       stack.push(x);
       if (minStack.isEmpty() || x <= minStack.peek()) {
          minStack.push(x);
       }
 }
    public void pop() {
       if (stack.pop().equals(minStack.peek())) minStack.pop();
 }
    public int top() {
       return stack.peek();
 }
    public int getMin() {
       return minStack.peek();
 }
    
    public static void main(String [] args) {
    	  MinStack s = new MinStack();
    	  s.push(9);
    	  s.push(1);
    	  s.push(4);
    	  s.push(0);
    	  s.push(2);
    	  
    	  System.out.println(s.top());
    	  System.out.println(s.getMin());
    	  s.pop();
    	  s.pop();
    	  
    	  System.out.println(s.top());
    	  System.out.println(s.getMin());
    	  
    	  Stack<Integer> x = new Stack<>();
    	 // x.pop();
    	  
    }
}
