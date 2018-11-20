

public class BinaryTreeUpsideDown {
	 public static class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	 static TreeNode v = null;
	 public static TreeNode upsideDownBinary(TreeNode root) {
		 if(root == null ) return null;
		 return help(root,null);
	}
	 public static TreeNode help(TreeNode r, TreeNode p) {
		 if(p==null) { 
			 
			 TreeNode x = help(r.left,r);
		                //System.out.println(x.val);
		                //System.out.println(v.val);
			   return v;
		 }
		 if( r!= null) {
			 TreeNode newP = help(r.left,r);
			 if(r.left == null) v=r ;
			 newP.left = p.right;
			 newP.right = p;
			 return newP.right;
		 }
		 return p;
	 }
	 
	 public static void main(String [] args) {
		 TreeNode t1 = new TreeNode(1);
		 t1.right = new TreeNode(3);
		 t1.left = new TreeNode(2);
		 t1.left.left = new TreeNode(4);
		 t1.left.right = new TreeNode(5);
		 TreeNode ROOT = t1; 
		 System.out.println("================================");
		 System.out.println("    Before the upsideDown");
		 System.out.println("================================");
		 
		 Integer a = null;  Integer b = null;
		 if(ROOT.right.left != null) a= ROOT.right.left.val;
		 if(ROOT.right.right != null) b= ROOT.right.right.val;
		 System.out.println("            "+ROOT.val);
		 System.out.println("     "+ROOT.left.val+ "---------------" + ROOT.right.val);
		 System.out.println(ROOT.left.left.val+ "-------" +ROOT.left.right.val+ "-----" + a+"-----"+b);
		 
		 
		
	     ROOT = upsideDownBinary(t1) ;
	     System.out.println("================================");
	     System.out.println("      After the upsideDown");
	     System.out.println("================================");
		 
		a = null;   b = null;
		 if(ROOT.left.left != null) a= ROOT.left.left.val;
		 if(ROOT.left.right != null) b= ROOT.left.right.val;
		   
		 System.out.println("             "+ROOT.val);
		 System.out.println("     "+ROOT.left.val+ "--------------" + ROOT.right.val);
		 System.out.println(a+ "---" +b+ "------" + ROOT.right.left.val+"-------"+ROOT.right.right.val);
		
	 }
}
