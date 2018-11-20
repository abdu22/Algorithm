
public class MyBTClass {

	static class TreeNode {
	      int val;
	      TreeNode left; TreeNode right;
	      
	       TreeNode(int val){
	       this.val = val;
	       }
	   }
	   
	  public static void printBT(TreeNode r){
	       if(r != null) {
	        System.out.println(r.val);
	        }
	        help(r);
	  }
	  public static void help(TreeNode r){
		  if(r != null) {
	      //System.out.println();
	      if(r.left !=null ) {
	    	   int l = r.left.val;
	    	  System.out.print(l+"  ");
	      }
	     if(r.right !=null ) {
	    	  int right = r.right.val;
	    	  System.out.print(right+ " ");
	    	  
	     }
	     help(r.left); 
	     help(r.right);
	   
		  }

	  }
	  
	  public static void main(String [] args){
	     TreeNode root = new TreeNode(1);
	        root.left = new TreeNode(2);
	        root.right = new TreeNode(3);
	        root.left.left = new TreeNode(4);
	        root.left.right = new TreeNode(5);
	        root.right.left = new TreeNode(6);
	        root.right.right = new TreeNode(7);
	        
	        printBT(root);
	  }

}
