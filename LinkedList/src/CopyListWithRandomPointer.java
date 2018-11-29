import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class CopyListWithRandomPointer {
    
	public static class RandomListNode {
		      int label;
		      RandomListNode next, random;
		      RandomListNode(int x)  { 
		    	         this.label = x; 
		    	      }
		  };
		  
    public static RandomListNode copyRandomList(RandomListNode head) {
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
	
    public static RandomListNode copyRandomList2(RandomListNode head) {
    	  if(head == null) return null;
    	  RandomListNode cur = head;
    	  RandomListNode ans = new RandomListNode(head.label);
    	  RandomListNode curAns = ans;
    	  HashMap<RandomListNode, RandomListNode> h = new HashMap<>();
    	  h.put(cur, curAns);
 		 System.out.println(cur.label +" : cur  " + curAns.label+" : curAns");

    	 while(cur.next!=null) {
    		// System.out.println(cur.label +" : cur  " + curAns.label+" : curAns");
    		  cur = cur.next;
    		  curAns.next = new RandomListNode(cur.label);
    		  curAns = curAns.next;
    		  h.put(cur, curAns);
     		 System.out.println(cur.label +" : cur  " + curAns.label+" : curAns");
  		  
    	 }
    	
    	 cur = head;
    	 curAns = ans;
    	 curAns.random = h.get(cur.random);
 		 System.out.println(cur.random.label +" : cur rand " + curAns.random.label+" : curAns rand");

    	 while(cur.next != null) {
    		 cur = cur.next;
    		 curAns = curAns.next;
    		 curAns.random = h.get(cur.random);
     		 System.out.println(cur.random.label +" : cur rand " + curAns.random.label+" : curAns rand");

    	 }
    	
    	
    	return ans;
    }
	public static void main(String[] args) {
		RandomListNode n = new RandomListNode(1);
		n.next = new RandomListNode(2);
		n.next.next = new RandomListNode(3);
		n.next.next.next = new RandomListNode(4);  
		
		n.random = n.next.next;
		n.next.random = n.next.next.next;
		n.next.next.random = n.next;
		n.next.next.next.random = n.next;
		
		System.out.println(n.next.next.next.random.label);
        
		RandomListNode ans = copyRandomList(n);
		System.out.println(ans.next.next.next.random.label);
		RandomListNode ans2 = copyRandomList2(n);
		System.out.println(ans2.next.next.next.random.label);
	}

}
