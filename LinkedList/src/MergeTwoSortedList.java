
public class MergeTwoSortedList {
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
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	        ListNode dummyhead = new ListNode(0);
    	        ListNode curre = dummyhead;
    	        
    	        while(l1 != null && l2 !=null) {
    	        	
	    	        	if(l1.val < l2.val) {
	    	        		curre.next = l1;
	    	        		l1 = l1.next;
	    	        		curre = curre.next;
	    	        	}else {
	    	        		curre.next = l2;
	    	        		l2 = l2.next;
	    	        		curre = curre.next;
	    	        	}
    	        }       
    	        if(l1 != null) curre.next = l1;
    	        if(l2 != null) curre.next = l2;
    	       
	        return dummyhead.next;
	    }
	public static void main(String[] args) {
          ListNode l1 = new ListNode(1);
          l1.next = new ListNode(2);
          l1.next.next = new ListNode(4);
          print(l1);
          
          ListNode l2 = new ListNode(1);
          l2.next = new ListNode(3);
          l2.next.next = new ListNode(4);
          l2.next.next.next = new ListNode(5);
          l2.next.next.next.next = new ListNode(6);
          l2.next.next.next.next.next = new ListNode(7);
          print(l2);
          
          ListNode l3 = mergeTwoLists(l1,l2);
          print(l3);
	}

}
