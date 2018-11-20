
public class LCAofBST {
	public static class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	}
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    	   if(root == null) return null;
    	    
        return help(root,p,q);
    }
    
    public static TreeNode help(TreeNode ans, TreeNode p, TreeNode q) {
    	     
    	if(ans == null) return null;
    	
    	if(p.val < ans.val && q.val < ans.val) {
    		 ans =  ans.left;
    		return  help(ans,p,q);
    	}else if (p.val > ans.val && q.val > ans.val) {
    		 ans = ans.right;
    		return  help(ans,p,q) ;
    	}else {
    	    return ans;
    	}
    }
	public static void main(String[] args) {
		TreeNode r = new TreeNode(6);
		r.left = new TreeNode(2);
		r.right = new TreeNode(8);
		r.left.left = new TreeNode(0);
		r.left.right = new TreeNode(4);
		r.left.right.left = new TreeNode(3);
		r.left.right.right = new TreeNode(4);
		r.right.left = new TreeNode(7);
		r.right.right = new TreeNode(9);
		
		TreeNode anse = lowestCommonAncestor(r, new TreeNode(3), new TreeNode(5));
       System.out.println(anse.val);
	}
 
}
