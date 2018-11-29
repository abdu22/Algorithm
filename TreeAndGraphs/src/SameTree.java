
public class SameTree {
 
	public static class TreeNode {
		      int val;
		    TreeNode left;
		    TreeNode right;
		     TreeNode(int x) { val = x; }
		}
		
    public static boolean isSameTree(TreeNode p, TreeNode q) {
		        boolean ans = false;
		        if(p != null && q != null){
		        if(p.val == q.val){
		            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
		        }else {
		            ans =false;
		        }
		        }else if (p == null && q == null){
		            ans = true;
		        }else {
		            ans = false;
		        }
		        return ans;
		    }

		    
	public static boolean isSameTree2 (TreeNode p, TreeNode q) {
		if(p == null && q == null) return true;
		if(p==null || q==null) {
			System.out.println(p.val);
			 return false;
		}
		
		return (p.val == q.val) &&
				isSameTree2(p.left, q.left) &&
				isSameTree2(p.right, q.right);
	}	    
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(1);
		t1.left = new TreeNode(2);
		t1.right = new TreeNode(3);
		
		TreeNode t2 = new TreeNode(1);
		t2.left = new TreeNode(2);
		t2.right = new TreeNode(3);
		
		System.out.println(isSameTree2(t1,t2));

	}

}
