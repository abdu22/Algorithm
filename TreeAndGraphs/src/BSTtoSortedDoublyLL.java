
public class BSTtoSortedDoublyLL {
	 public static class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	 public static class DLNode{
	  	   int val;
	  	 DLNode next;
	  	 DLNode prev;
	  	   public DLNode(int v) {
	  		   this.val = v;
	  	   }
	  } 
	static DLNode dummy = new DLNode(0);
	static DLNode current = dummy;
	
	public static DLNode BSTtoSortedDLL(TreeNode r) {
		 if(r== null) return null;
		 help(r);
		 dummy = dummy.next;
		 dummy.prev = null;
		 return dummy;
	}
	public static void help(TreeNode r) {
		if(r != null) {
			 help(r.left);
				 DLNode temp = new DLNode(r.val);
				  temp.prev = current;
				  current.next = temp;
				  current = temp;
			 help(r.right); 
					  
		}
	}
	public static void main(String[] args) {
		TreeNode r1 = new TreeNode(20);
		r1.left =  new TreeNode(10);
		r1.right = new TreeNode(30);
		r1.left.left =  new TreeNode(5);
		r1.left.right =  new TreeNode(15);
		r1.right.left =  new TreeNode(25);
		r1.right.right =  new TreeNode(40);
		
		DLNode DL1 = BSTtoSortedDLL(r1);

		System.out.println(DL1.val);
		System.out.println(DL1.next.val);
		System.out.println(DL1.next.next.val);
		System.out.println(DL1.next.next.next.val);
		System.out.println(DL1.next.next.next.next.val);
		System.out.println(DL1.next.next.next.next.next.val);
		System.out.println(DL1.next.next.next.next.next.next.val);

	}

}
