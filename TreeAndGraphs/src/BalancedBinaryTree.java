

public class BalancedBinaryTree {
	 public static class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	public static boolean isBalanced(TreeNode root) { 
		if(root == null) return true;
		
 		return (help(root)==-1? false:true);
	}
//================================================	
// lets go to bottom up tree traverse 
//================================================	
   public static int help(TreeNode r) {
	      if(r == null) return 0;
	    int x = help(r.left);          // " x " saved the recursion returned value b/c we will use it to compare 
	      if(x == -1) return -1;       // once we get -1 we will keep returning -1
	    int y= help (r.right);
	      if(y == -1) return -1;
	    
	    if(Math.abs(x-y) <= 1) return Math.max(x+1, y+1);
	    
	    else return -1;
   }
	 
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(4);
		t1.left = new TreeNode(1);
		t1.right = new TreeNode(15);
		t1.right.left = new TreeNode(13);
		t1.right.left.left = new TreeNode(1);
		System.out.println(isBalanced(t1));
	
	}

}
