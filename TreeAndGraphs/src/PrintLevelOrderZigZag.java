import java.util.LinkedList;
import java.util.Queue;

public class PrintLevelOrderZigZag {
 static class TreeNode {
	  String val;
	  TreeNode left;
	  TreeNode right;
	  TreeNode(String v){
		  this.val = v;
	  }
 }
  public static void InLinePrint(TreeNode r) {
	   Queue<TreeNode> q = new LinkedList<>();
	   
	   if(r != null) q.add(r);
	   else System.out.println(" Owww . . . null input");
	   
	   while(!q.isEmpty()) {
		     int count = 0;
		     int size = q.size();
		     while(count<size) {
		    	 TreeNode temp = q.poll();
		    	 count++;
		    	 System.out.print(temp.val+" ");
		    	 if(temp.left != null) q.add(temp.left);
		    	 if(temp.right != null) q.add(temp.right);
		     }
		     System.out.println();
	   }
	   
  }
  public static void zigZag(TreeNode r) {
	   Queue<TreeNode> q = new LinkedList<>();
	   
	   if(r != null) q.add(r);
	   else System.out.println(" Owww . . . null input");
	   int zigCount= 0;
	   while(!q.isEmpty()) {
		     int count = 0;
		     int size = q.size();
		     while(count<size) {
		    	 TreeNode temp = q.poll();
		    	 count++;
		    	 System.out.print(temp.val+" ");
		   if(zigCount%2 == 0) {
			   if(temp.left != null) q.add(temp.left);
		    	if(temp.right != null) q.add(temp.right);
		    	zigCount++;
		   } else {
			   if(temp.right != null) q.add(temp.right);
			   if(temp.left != null) q.add(temp.left);
			   zigCount++;
		   }	   	
		     }
	   }
  }
	public static void main(String[] args) {
		TreeNode r = new TreeNode("A");
		r.left = new TreeNode("B");
		r.right = new TreeNode("C");
		r.left.left = new TreeNode("D");
		r.left.right = new TreeNode("E");
		r.right.left = new TreeNode("F");
		r.right.right = new TreeNode("G");
		
		InLinePrint(r);
		zigZag(r);

	}

}
