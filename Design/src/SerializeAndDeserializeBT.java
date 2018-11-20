
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class SerializeAndDeserializeBT {


	    public static class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
		 

		    // Encodes a tree to a single string.
		    public static String serialize(TreeNode root) {
		    	  StringBuilder sb = new  StringBuilder();
		    	  if(root == null) return null;
				helpSeri(root,sb);
				return sb.toString();
		        
		    }
		    
		    public static void helpSeri(TreeNode r, StringBuilder sb) {
		    	  if(r==null) {
		    		  sb.append("X").append(",");
		    	  }else {
		    	   sb.append(r.val).append(",");
		    	   helpSeri(r.left,sb);
		    	   helpSeri(r.right,sb); 
		    	  }
		    }
		    
		    // Decodes your encoded data to tree.
		    
		    public static TreeNode deserialize(String data) {
		      if(data == null) return null;
		    	   Deque<String> d = new LinkedList<String>();
		    	   d.addAll(Arrays.asList(data.split(",")));
		    	 //  if(d.isEmpty()) return null;
		    	   
		    	    return helpDeseri(d);
		        
		    }
		    
		    public static TreeNode helpDeseri(Deque<String> d) {
		    	String removed = d.remove();
		    	 if(removed.equals("X")) { 
		    		 return null; 
		    	 }else {
		    		 TreeNode r = new TreeNode(Integer.parseInt(removed));
			    	    r.left = helpDeseri(d);
			    	    r.right = helpDeseri(d);
			    	 return r;
		    	 }
		    	   
		    }
		    
		    
	public static void main(String[] args) {
		
          TreeNode r = new TreeNode(1);
          r.left = new TreeNode(2);
          r.right = new TreeNode(3);
          r.right.left = new TreeNode(4);
          r.right.right = new TreeNode(5);
          System.out.println("  "+r.val);
          System.out.println(r.left.val+" , "+r.right.val);
          System.out.println("  "+r.right.left.val+" , "+r.right.right.val);
          String s = serialize(r);
          System.out.println("=====================");
          System.out.println(s);
          
        TreeNode r2 = deserialize(serialize(r));
       //  TreeNode r2 = deserialize("1,2,X,X,3,4,X,X,5,X,X,");
         System.out.println("=====================");
         System.out.println("  "+r2.val);
         System.out.println(r2.left.val+" , "+r2.right.val);
         System.out.println("  "+r2.right.left.val+" , "+r2.right.right.val);
         
         System.out.println("=====================");
         TreeNode r3 = null;
         String s3 = serialize(r3);
         System.out.println(s3);
	}

}
