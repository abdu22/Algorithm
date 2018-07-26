
public class LinkedTest {
    public static class Node{
    	   int val;
    	   Node next;
    	   public Node(int v) {
    		   this.val = v;
    	   }
    }
	
	 
	public static void main(String[] args) {
		Node n = new Node(1);
		
	    Node m = new Node(1);
	    
	    
		
		System.out.println((n == m ? true:false));
 
	}

}
