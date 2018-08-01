
public class ValidateBinarySearchTree {

	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right; 
		TreeNode(int v) {
			this.val = v;
		}
	}
//========================================================	
// The time complexity for the following solution is O(n2)
//========================================================

/*	public static boolean isValidBST(TreeNode root) {
		if(root == null) return true;
		return isSubtreeLessThan(root.left,root.val) 
			&& isSubtreeGreaterThan(root.right, root.val)
		    && isValidBST(root.left) && isValidBST(root.right);
	}
	public static boolean isSubtreeLessThan(TreeNode r, int n) {
		if(r==null) return true;
		return  r.val < n 
			&& isSubtreeLessThan(r.left,n)
			&& isSubtreeGreaterThan(r.right, n);
	}
	public static boolean isSubtreeGreaterThan(TreeNode r, int n) {
		if(r == null)  return true;
		return  r.val > n
			&& isSubtreeLessThan(r.left,n)
			&& isSubtreeGreaterThan(r.right, n);
		
	}	*/
 //========================================================	
 // The time complexity for the following solution is O(n2)
 //========================================================
/*public static boolean isValidBST(TreeNode root) {
	 if(root == null) return true;
	 if(root.left != null && root.right != null) {
		  if(root.val > root.left.val && root.val < root.right.val   && 
		 isAllLess(root.left, root.val) && isAllGreater(root.right, root.val)) {
			  return isValidBST(root.left) && isValidBST(root.right);
		  }else {
			  return false;
		  }
	 }else if (root.left != null) {
		 if(root.val > root.left.val && isAllLess(root.left, root.val)) 
			 return isValidBST(root.left);
		 else return false;
	 }else if(root.right != null) {
		 if(root.val < root.right.val && isAllGreater(root.right, root.val)) 
			 return isValidBST(root.right);
		 else return false;
	 }else
        return true;
    }
	public static boolean isAllGreater(TreeNode r, int n) {
		boolean g = true;
		if(r==null) return g;
		if(r.right != null && r.left != null) {
			if(r.right.val > n && r.left.val > n) 
				return isAllGreater(r.right,n) && isAllGreater(r.left,n);
			else g = false;
		}else if(r.right !=null) {
			 if(r.right.val > n) return isAllGreater(r.right,n);
			 else g = false;
		}else if(r.left != null) {
			 if(r.left.val > n) return isAllGreater(r.left,n);
			 else g = false;
		}else 
		    return true;
		return g;
	}
	public static boolean isAllLess(TreeNode r, int n) {
		boolean l = true;
		if(r == null) return true;
		if(r.right !=null && r.left != null) {
			if(r.right.val < n && r.left.val <n)  
				return isAllLess(r.right,n) && isAllLess(r.left,n);
			else l = false;
		}else if (r.left !=null) {
			if(r.left.val < n) return isAllLess(r.left,n);
			else l = false;
		}else if (r.right!= null){
			if(r.right.val <n) return isAllLess(r.right,n);
			else l = false;
		}else 
			return true;
		return l;
	}*/


//========================================================	
// The time complexity for the following solution is O(n)
// by creating a range to check the validity of each node for the entire tree
//========================================================
	public static boolean isValidBST(TreeNode root) {
		if (root ==null) return true;
		else return helper(root, null, null);
	}	
	public static boolean helper(TreeNode root, Integer min, Integer max) {
		if(root == null) return true;
		
		return (min == null || root.val > min ) && (max == null || root.val < max)  
			&& helper(root.left, min, root.val) 
			&& helper(root.right, root.val, max);
	}
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(4);
		t1.left = new TreeNode(1);
		t1.right = new TreeNode(15);
		t1.right.left = new TreeNode(13);
		
        TreeNode t2 = null;
		
		System.out.println(isValidBST(t1));
		System.out.println(isValidBST(t2));
	}
}
