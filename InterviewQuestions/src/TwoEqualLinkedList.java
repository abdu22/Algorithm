import java.util.List;
class ListNode{
	int val;
	ListNode next; 
	ListNode(int v){
		this.val = v;
	}
}
public class TwoEqualLinkedList {
  
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(3);
		//l1.next.next.next = new ListNode(4);
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(2);
		l2.next.next = new ListNode(3);
		
		System.out.println(isEqual(l1,l2));
		
	}
   public static boolean isEqual(ListNode l1,ListNode l2) {
	   ListNode h1 = l1;
	   ListNode h2 = l2;
	     while(h1 != null && h2 != null) {
	    	 
	    	 if(h1.val != h2.val) return false;
	    	 
	    	 h1 = h1.next;
	    	 h2 = h2.next;
	     }
	     if(h1 == null  && h2 == null) return true;
	     else return false;
   }
}
