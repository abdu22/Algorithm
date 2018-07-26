

public class RemoveNthElement {

	public static class ListNode {
		int val;
		ListNode next;
		 ListNode(int val){
			 this.val = val;
			 this.next = null;
		 }
	}
	public static void print(ListNode h) {
		System.out.println();
		while(h!=null) {
		System.out.print(h.val + "-->");
		h = h.next;
	    }
	}
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode dummy = new ListNode(0);
		dummy.next = head;
        ListNode x = dummy;
        ListNode y = x;
        int count = 0;
        while(y.next != null) {
         	count ++;
        	   y = y.next;
        	   if(count>n) {
        		   x = x.next;
        	   }
        }
        ListNode z = x.next.next; 
             x.next = z; 
        return dummy.next;
    }
	
	public static void main(String[] args) {
		ListNode l = new ListNode(1);
		   l.next = new ListNode(2);
		   l.next.next = new ListNode(3);
		   l.next.next.next = new ListNode(4);
		   l.next.next.next.next = new ListNode(5);
		   
		   print(l);
		   
		   print( removeNthFromEnd(l,2));
		   
		}

}
