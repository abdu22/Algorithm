import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPointer {
    
	public static class RandomListNode {
		      int label;
		      RandomListNode next, random;
		      RandomListNode(int x)  { 
		    	         this.label = x; 
		    	      }
		  };
		  
    public RandomListNode copyRandomList(RandomListNode head) {
     	RandomListNode dummy = new RandomListNode(0);
     	
     	Map<RandomListNode,RandomListNode> map = new HashMap<>();
     	
     	RandomListNode p = head;
     	
     	RandomListNode q = dummy;
     	
     	while(p != null) {
     		 q.next = new RandomListNode(p.label);
     		 map.put(p, q.next);
     		 q = q.next;
     		 p = p.next;
     	}
     	
     	q = dummy.next;
        p = head;
    	   while(q != null) {
    		   RandomListNode r = map.get(p.random);
    		   q.random = r;
    		   q = q.next;
    		   p = p.next;
    	   } 
		return dummy.next;
      }
		  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
