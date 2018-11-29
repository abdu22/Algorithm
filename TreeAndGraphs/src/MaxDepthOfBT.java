
public class MaxDepthOfBT {
 
	
	public static class TreeNode {
	      int val;
	    TreeNode left;
	    TreeNode right;
	     TreeNode(int x) { val = x; }
	}
	
	public static int maxDepth(TreeNode root) {
		if(root == null) return 0;
		int depth = 1;
		
		return Math.max(depth+maxDepth(root.left),depth+maxDepth(root.right));
	}
	public static int minDepth(TreeNode root) {	
	if(root == null) return 0;
    int depth = 1;
    
    if(root.left == null && root.right != null) return depth+minDepth(root.right);
    else if(root.right == null&& root.left != null) return  depth+minDepth(root.left);
    else {
        return Math.min(depth+minDepth(root.left),depth+minDepth(root.right));
         }
	}
 
	public static int maxDepth2(TreeNode root) {
		if(root == null) return 0; 
		
		return Math.max(maxDepth2(root.left)+1, maxDepth2(root.right)+1);
	} 
    
	public static void main(String[] args) {
		TreeNode t = new TreeNode(4);
		t.left = new TreeNode(2);
		t.right = new TreeNode(8);
	    t.right.left = new TreeNode(7);
	    t.right.left.right= new TreeNode(19);
		
		System.out.println(maxDepth2(t));
		System.out.println(minDepth(t));
	}

}
