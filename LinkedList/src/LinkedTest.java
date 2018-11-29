
public class LinkedTest {
    public static class ListNode{
    	   int val;
    	   ListNode next;
    	   public ListNode(int v) {
    		   this.val = v;
    	   }
    }
    public static void print(ListNode h) {
		
		while(h!=null) {
		System.out.print(h.val + "-->");
		h = h.next;
	    }
		System.out.println();
		System.out.println();
	} 
	 
	public static void main(String[] args) {
		
		// Copying list   
	   // Deep copy and shallow copy 
		ListNode n = new ListNode(1);
		n.next = new ListNode(2);
		n.next.next = new ListNode(3);
		System.out.println("list n Origignal");
        print(n);
        
        ListNode o = n;
        System.out.println("list o Shallow ");
        print(o);
        o.next.next = new ListNode(99);
        System.out.println("list o after chang 99 using 'o'");
        print(o);
        System.out.println("list n after chang 99 using 'o' ");
        print(n);
        
        ListNode m = new ListNode(n.val);
        m.next = new ListNode(n.next.val); 
        m.next.next = new ListNode(n.next.next.val);
        System.out.println("list m Deep");
        print(m);
        
        m.next.next = new ListNode(999);
        System.out.println("list m after chang 999 using m");
        print(m);
        System.out.println("list n after chang 999 using m");
        print(n);
	}

}
