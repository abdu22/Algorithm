import java.util.LinkedList;
import java.util.Queue;

public class PrintLevelOrder {
	static class TreeNode {
	      int val;
	      TreeNode left; TreeNode right;
	      
	       TreeNode(int val){
	       this.val = val;
	       }
	   }
	
	static void printLevelOrder(TreeNode root) {
		
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		if(root != null) {
			q.add(root);
		 while(true) {
			 int count = q.size();
			 if(count == 0) break;
			  while(count >0 ) {
				  TreeNode temp = q.peek();
				  System.out.print(temp.val+ " ");
				  if(temp.left != null) {
					  q.add(temp.left);
				  }
				  if(temp.right != null) {
					  q.add(temp.right);
				  }
				  q.remove();  count--;  
			  }
			  System.out.println();
		 }	
		}	
	}
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1); 
        root.left = new TreeNode(2); 
        root.right = new TreeNode(3); 
        root.left.left = new TreeNode(4); 
        root.left.right = new TreeNode(5); 
        root.right.right = new TreeNode(6);
        printLevelOrder(root); 
       
	}
  
}
