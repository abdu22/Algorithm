

public class AddTwoNumbers {
	   static ListNode h1;
	   static ListNode h2;
        static class ListNode{
        	  int val;
        	  ListNode next;
        	  ListNode(int value){
        		  this.val = value;
        		  this.next = null;
        	  }
        }
	    
       /* public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        * 
        * this solution has a problem of size limitation on data type of n1 & n2
	      	long n1 = 0;
	        long n2 = 0;
	        int x =0;int y=0;
	        while(l1!=null){
	            n1 += l1.val*(Math.pow(10, x));
	            l1 = l1.next;
	            x++;
	        }
	        System.out.println();
	        System.out.println(n1);
	        while(l2!=null){
	            n2 += l2.val*(Math.pow(10, y));
	            l2 = l2.next;
	            y++;
	        }
	        System.out.println(n2);
	        long sum = n1+n2;
	        System.out.println(sum);
	        ListNode head = new ListNode((int) (sum%10));
	        ListNode current = head; 
             sum = sum/10;
	        while(sum>0) {
	        	  
	           current.next = new ListNode((int) (sum%10));
                current = current.next;
                sum = sum/10;
	        }
           current = null;
	        return head;     
	    }*/
	    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	    	ListNode beforeHead = new ListNode(0);
	    	ListNode curr = beforeHead;  
	    	int carry = 0;
	    	
	    	
	    	while(l1 !=null || l2 != null) {
	    		int x = 0; int y = 0;
	    		if(l1 != null) { x = l1.val;}

	    		if(l2 != null) { y = l2.val; }

	    		int sum = carry + x + y;
	    		carry = sum/10;
	    		ListNode temp = new ListNode(sum%10);
	    		curr.next = temp;
	    		curr = curr.next;
	    		if(l1 != null) l1 = l1.next;
	    		if(l2 != null) l2 = l2.next;
	    	}
	    	if(carry > 0) {
	    		curr.next = new ListNode(carry);
	    	}
	       return beforeHead.next;
	    }
	    public static ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
	    	ListNode dummy = new ListNode(0);
	    	ListNode curAns = dummy;
	    	ListNode cur1=l1;  ListNode cur2 = l2;
	    	int carryOn = 0;
	    	while(cur1!=null && cur2!=null) {
	    		 int sum = carryOn+ cur1.val+cur2.val;
	    			 curAns.next = new ListNode(sum%10);
	    			 carryOn = sum/10;
	    		  curAns = curAns.next;
	    		  cur1 = cur1.next;
	    		  cur2 = cur2.next;
	    	}
	    	while(cur1!=null) {
	    		curAns.next = new ListNode(cur1.val); 
	    		 curAns = curAns.next; cur1 = cur1.next;
	    	    }
	    	while(cur2!=null) {
	    		curAns.next = new ListNode(cur2.val); 
	    		 curAns = curAns.next; cur2 = cur2.next;
	    	    }    	
	    	return dummy.next; 
	    }
	    public static void print(ListNode h) {
			System.out.println();
			while(h!=null) {
			System.out.print(h.val + "-->");
			h = h.next;
		    }
		}	
	public static void main(String[] args) {
		AddTwoNumbers l = new AddTwoNumbers();
			l.h1 = new ListNode(2);
			l.h1.next = new ListNode(4);
			l.h1.next.next = new ListNode(3);
			
			print(h1);
			
		AddTwoNumbers l2 = new AddTwoNumbers();
		l2.h2 = new ListNode(5);
		l2.h2.next = new ListNode(6);
		l2.h2.next.next = new ListNode(4);
		/*l2.h2.next.next.next = new ListNode(9);
		l2.h2.next.next.next.next = new ListNode(9);
		l2.h2.next.next.next.next.next = new ListNode(9);
		l2.h2.next.next.next.next.next.next = new ListNode(9);
		l2.h2.next.next.next.next.next.next.next = new ListNode(9);
		l2.h2.next.next.next.next.next.next.next.next = new ListNode(9);
		l2.h2.next.next.next.next.next.next.next.next.next = new ListNode(9);*/
			
			print(h2);
			print(addTwoNumbers2(h1,h2));
			
			
			

	}

}
