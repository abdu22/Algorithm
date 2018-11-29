package re;



public class InvertBinaryTree {
	
	static class TreeNode {
		int val; 
		TreeNode left;
		TreeNode right;
		public TreeNode(int val) {
			this.val = val; 
		}
		
	}
	public static void main(String[] args) {
		TreeNode r = new TreeNode(1);
		         r.left = new TreeNode(2);
		         r.left.left = new TreeNode(3);
		         r.left.right = new TreeNode(4);
		         r.right = new TreeNode(6);
		         r.right.left = new TreeNode(7);
		         r.right.right = new TreeNode(8);
		         
		    System.out.println("      "+r.val);
		    System.out.println("  "+r.left.val+"  ,   "+r.right.val);
		    System.out.println(""+r.left.left.val+" , "+r.left.right.val+" , "+r.right.left.val+" , "+r.right.right.val);
		
	     System.out.println("===============");
	     System.out.println("===============");
		    
		TreeNode ans = invertTree(r);
		
		System.out.println("      "+ans.val);
	    System.out.println("  "+ans.left.val+"  ,   "+ans.right.val);
	    System.out.println(""+ans.left.left.val+" , "+ans.left.right.val+" , "+ans.right.left.val+" , "+ans.right.right.val);
		         
	}

	   public static TreeNode invertTree(TreeNode root) {
		
		   if(root == null) return null;
		  TreeNode left = invertTree(root.left);
		  TreeNode right = invertTree(root.right);
		  root.left = right;
		  root.right =left;
		  
		return root;   
	    }
}
