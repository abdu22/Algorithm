package re;

import re.InvertBinaryTree.TreeNode;

public class BalancedBT {
    static class TreeNode{
    	     int val;
    	     TreeNode left; 
    	     TreeNode right;
	  public TreeNode(int val) {
		 this.val = val;
		}
    	     
    }
    
	public static boolean isBalanced(TreeNode root) { 
		if(root==null) return true;

		if (help(root)==-1) return false;
		else return true;
	}
	
	public static int help(TreeNode root) {
		if(root == null) return 0;
		int l = help(root.left);
		if(l == -1) return -1;
		int r = help(root.right);
		if(r== -1) return -1;
		
		if(Math.abs(l-r) > 1) return -1;
		
		else  return (Math.max(l, r)+1);
	}
	
	
					/*            1
					     	2     ,     6
						3     , 7 ,        8
             						          9
             						              */
	
	public static void main(String[] args) {
		TreeNode r = new TreeNode(1);
        r.left = new TreeNode(2);
       // r.left.left = new TreeNode(3);
       // r.left.right = new TreeNode(4);
        r.right = new TreeNode(6);
        r.right.left = new TreeNode(7);
        r.right.right = new TreeNode(8);
        r.right.right.right = new TreeNode(9);
        
   System.out.println("      "+r.val);
   System.out.println("  "+r.left.val+"        "+r.right.val);
   System.out.println(""+"  "+"   "+" "+"  "+r.right.left.val+"     "+r.right.right.val); 
   System.out.println("                "+r.right.right.right.val);
   
       System.out.println(isBalanced(r));
	}
	


}
