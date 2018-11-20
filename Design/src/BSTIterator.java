import java.util.Deque;
import java.util.Stack;

public class BSTIterator {
    public  TreeNode root;
    public  Stack<Integer> stack; 
    
	public BSTIterator(TreeNode root) {
          this.root = root;
          stack = new Stack<Integer>(); 
          pushToStack(root);
    }
	
     private  void pushToStack(TreeNode r) {
    	     if(r != null) {
    	           pushToStack(r.right);
      	       stack.push(r.val);
      	       pushToStack(r.left);
    	     }     
     }
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
       return stack.size()>0; 
    }

    /** @return the next smallest number */
    public int next() { 
       return stack.pop(); 
    }
	
	public static void main(String[] args) {
		TreeNode r = new TreeNode(8);
		r.left = new TreeNode(4);
		r.right = new TreeNode(12);
		r.left.left = new TreeNode(1);
		r.left.right = new TreeNode(5);
		r.right.left = new TreeNode(10);
		r.right.right = new TreeNode(14);
 
		BSTIterator i = new BSTIterator(r); 
		
		while(i.hasNext())
			System.out.println(i.next());
	}

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}