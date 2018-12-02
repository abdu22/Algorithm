
public class MergeKsortedList {
  static class ListNode{
	  int val;
	       ListNode next;
	       ListNode(int x) { val = x; }
  }
  
	public static void main(String[] args) {
		ListNode l1 = new ListNode(3);   l1.next = new ListNode(4);  l1.next.next = new ListNode(5);
		ListNode l2 = new ListNode(1);    l1.next = new ListNode(3);  l1.next.next = new ListNode(4);
		ListNode l3 = new ListNode(2);    l1.next = new ListNode(6); 
		ListNode [] lists = {l1,l2,l3};
		//ListNode ANS = mergeKLists(lists);
		System.out.println(Integer.MAX_VALUE);
	}
/*	Input:
		[
		  3->4->5,
		  1->3->4,
		  2->6
		]
		Output: 1->1->2->3->4->4->5->6   */
    public static ListNode mergeKLists(ListNode[] lists) {	
    	ListNode Dummy = new ListNode(0);
    	ListNode  ansCur = Dummy;
    	// to hold the current node for reach lists
    	ListNode [] current = new ListNode[lists.length];    
    	for(int i=0; i<lists.length;i++) current[i] = lists[i];
    	
    	System.out.println(" , "+lists[0].val);
    	System.out.println(current[0].val+" , ");
    	
    	//initial min is max value
    	int  min = Integer.MAX_VALUE;  
    	while(true) {
    	int k = 0;      // to keep track of which current node is added. 	
    	
    		for(int i=0; i<lists.length ; i++) {   		 
    			if(min > current[i].val) {
    				min = current[i].val;  
    				k = i;
    			} 
        	}
    		
    		// move the added node to the next using k
    		if(current[k].next != null) {
				current[k] = current[k].next;
             }else {
               
			   current[k] = new ListNode(Integer.MAX_VALUE);  // if the current node reched to the end, mark the value as MAX
	        }
    		// add the min value to the sorted list
    		ansCur.next = new ListNode(min);
    		ansCur= ansCur.next;
    		
    		//check if all Current node in the lists reached to the end.
    		int finalReachedNodeCount = 0;
    		
    		for(int i=0;i<lists.length; i++) {
    			if(current[i].val == Integer.MAX_VALUE)  finalReachedNodeCount ++;
    		}
    		System.out.println(finalReachedNodeCount);
    		// if all current reached it's destination break from while. 
    		if(finalReachedNodeCount == lists.length)  break;	      
    	}  		
        return Dummy.next;
    }
}
