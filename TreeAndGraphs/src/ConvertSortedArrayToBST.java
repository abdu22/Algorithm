

public class ConvertSortedArrayToBST {
 
	public static class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	//static TreeNode r = null;
//====================================================
// the following creates a binary tree from array 
// but the tree is "not a BST"
//====================================================
  /*public static TreeNode sortedArrayToBST (int nums []) {
	  if(nums.length == 0) return null;
	  r = new TreeNode(nums[0]);
	  for(int i = 1; i< nums.length ; i++) {
		   help(r,nums[i]);
	  }
	  return r;
  }
  
  public static void help(TreeNode r, int n) {
	   if( n < r.val) {
		   if(r.left == null) r.left = new TreeNode(n);
		   else help(r.left,n);
	   }
       if (n > r.val) {
    	       if(r.right == null) r.right = new TreeNode(n);
    	       else help (r.right,n);
       }
  }*/
//====================================================
// the following creates a balanced search tree and it is balanced
//
//==================================================== 
  public static TreeNode sortedArrayToBST(int nums []) {
	  if(nums.length == 0) return null;
	  return help(nums,0,nums.length-1);
  }
  public static TreeNode help(int a[],int min, int max) {
	  if(min > max) return null;
	  int mid = (max+min)/2;
	  TreeNode r = new TreeNode(a[mid]);
	  r.left = help(a,min,mid-1);
	  r.right = help(a,mid+1,max);
	 return r;
  }
 
	public static void main(String[] args) {
		int a [] = {10,30,40,50,55,60,70};
		TreeNode ans = sortedArrayToBST(a);
       System.out.println("      /---(" + ans.val +")---\\");  
       System.out.println("  /-(" + ans.left.val +")-\\" + "     " + "/-(" + ans.right.val +")-\\" );
       System.out.println("(" + ans.left.left.val +")" + "   " + "(" + ans.left.right.val +")" + "   "+"("+ ans.right.left.val +")" + "   " + "(" + ans.right.right.val +")" );
	
	    //int b[] = {};
	   // TreeNode ans2 = sortedArrayToBST(b);
	}

}
