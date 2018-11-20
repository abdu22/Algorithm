
public class SwapNodesInpair {
	 public static class ListNode{
	  	   int val;
	  	   ListNode next;
	  	   public ListNode(int v) {
	  		   this.val = v;
	  	   }
	  }
	 
	 public static void print(ListNode h) {
			System.out.println();
			while(h!=null) {
			System.out.print(h.val + "-->");
			h = h.next;
		    }
		} 
	 public static ListNode swapPairs(ListNode head) {
		 
		 ListNode dummy = new ListNode(0);
		 if (head == null) return null;
		 dummy.next = head;
		 
		 ListNode curr = dummy;
		 
		 while(curr.next!= null && curr.next.next != null) {   // curr.next = to check if our curr is not at end && "curr.next.next" for odd no of list
			
			 ListNode secondN = curr.next.next;
			 curr.next.next = secondN.next;
			 secondN.next = curr.next;
			 curr.next = secondN;

			 if(curr.next.next != null) {	

				 curr = curr.next.next;

						 }
		 }
		 
	       return  dummy.next;
	    }
	public static void main(String[] args) {
		ListNode l = new ListNode(1);
		l.next = new ListNode(2);
		l.next.next = new ListNode(3);
		l.next.next.next = new ListNode(4);
		
		print(swapPairs(l));
		
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(2);
		print(swapPairs(l2));
	}

}
