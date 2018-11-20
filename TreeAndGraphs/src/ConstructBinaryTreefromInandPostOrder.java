public class ConstructBinaryTreefromInandPostOrder {
    
	public static class TreeNode {
	      int val;
	    TreeNode left;
	    TreeNode right;
	     TreeNode(int x) { val = x; }
	}
	static int backIdx = -1;
	public TreeNode buildTree(int[] inorder, int[] postorder) {
		backIdx = postorder.length-1;
		int L = 0; int R = inorder.length-1;
		TreeNode r = new TreeNode(postorder[backIdx]);
		
		// get index of root from inorder array 
		int rootIdx = search(inorder,postorder[backIdx]) ;
		backIdx--;
		r.right = help(inorder,postorder,r,rootIdx+1,R);
		backIdx--;
		r.left = help(inorder,postorder,r,L,rootIdx-1);
	
        return r;
    }
    
	public static TreeNode help(int[] inorder, int[] postorder, TreeNode r,int L, int R) {
		
		TreeNode x = new TreeNode(postorder[backIdx]); 
		int rootIdx = search(inorder,postorder[backIdx]) ;
		backIdx--;
		
		r.right = help(inorder,postorder,x,rootIdx+1,R);
		
		backIdx--;
		
		r.left = help(inorder,postorder,r,L,rootIdx-1);
		return r;
	}
	
	public static int search(int a[], int v) {	
		for(int i=0;i<a.length; i++)
			if(a[i] == v) return i ;	 
		
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
