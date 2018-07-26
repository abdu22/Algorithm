import java.util.ArrayList;
import java.util.List;

public class BinaryTreePath {

	 public static class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	 static List<String> list ;
	 
	 public static List<String> binaryTreePaths(TreeNode root) {
		 
		 String s = "";
		 list = new ArrayList<>();
		 
         if(root != null) helper(root,s);
         return list;
	    }
	 
	 public static void helper(TreeNode r, String s){
		 
		 if(r.left == null && r.right == null) {
			 s+=r.val;
			 list.add(s); 
		 }else {
		 s+=r.val+"->";
		 if(r.left != null) helper(r.left,s);
		 
		 if(r.right != null) helper(r.right,s);
		 
		 }
	 }
	public static void main(String[] args) {
		  TreeNode t = new TreeNode(1);
		  t.left = new TreeNode(2);
		  t.left.right = new TreeNode(5);
		  t.right = new TreeNode(3);
		  System.out.println(binaryTreePaths(t)); 
		  

	}

}
