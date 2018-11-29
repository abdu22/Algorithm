
public class DiameterOfBinaryTree {

	public static class TreeNode {
	      int val;
	    TreeNode left;
	    TreeNode right;
	     TreeNode(int x) { val = x; }
	}
	public static int ans;
	public static int diameterOfBinaryTree(TreeNode root) {
		ans = 1; 
		help(root);
        return ans-1;
    }
	
	public static int help(TreeNode root) {
		if(root == null) return 0;
		
		int L = help(root.left);
		int R = help(root.right);
		
		ans = Math.max(ans, L+R+1);
		return (Math.max(L, R)+1);
	}

	
	public static int diameterOfBinaryTree2(TreeNode root) {
		if(root==null) return 0;
		help2(root);
		return ans-1;
	}
	
	public static int help2(TreeNode root) {
		if(root==null) return 0;
		int l = help(root.left);
		int r = help(root.right);
		int d = l+r+1;
		if(d > ans) ans = d;
		
		return Math.max(l, r)+1;
		
	}
	
	/*                          10
	 *                  3________________20
	 *             2__________5
	 * .     1           4_________6
	 *                                7
	 * 
	 * 
	 * */
	
	public static void main(String[] args) {
		TreeNode r = new TreeNode(10);
		r.right =new TreeNode(20);
		r.left = new TreeNode(3);
		r.left.left = new TreeNode(2);
		r.left.left.left = new TreeNode(1);
		r.left.right = new TreeNode(5);
		r.left.right.left = new TreeNode(4);
		r.left.right.right = new TreeNode(6);
		r.left.right.right.right = new TreeNode(7);
		
		System.out.println(diameterOfBinaryTree(r));
		System.out.println(diameterOfBinaryTree2(r));

	}

}
