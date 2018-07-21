
public class LinkedList {
	
     static Node head;
	 static class Node {
		int data;
		Node next;
		Node (int d){
			this.data = d;
			this.next = null;
		}
	}	 
	public static void print(Node h) {
		System.out.println();
		while(h!=null) {
		System.out.print(h.data + "-->");
		h = h.next;
	    }
	}	
	public static Node reverse(Node h) {
		Node prev = null;
		Node tempNxt = null;
		Node current = h;
		while(current!= null) {
			prev = current.next;
			current.next = tempNxt;
			tempNxt = current;
			current = prev;
		}
	     head = tempNxt;
		return head;
	}
	 public Node reverseBetween(Node h, int m, int n) {
		 Node current =h;
		 Node x = null ,y=null, z=null;
		 int counter = 1;
		 
		 while(counter<n) {
			 current = current.next;
			 counter++; 
			 if(counter == n-1) z = current;
		 }
		 x = current; y = current.next; counter=m;
		 Node newnxt = y; 
		 Node oldnxt = null; 
		 current = z;
		 current.next = x;
		 current = z.next;
		 
		 while(counter<n) {
			 oldnxt = current.next;
			 current.next = newnxt;
			 newnxt = current;
			 current = oldnxt;
			 counter++;
		 }
		 head = h;
		 return head;
     }
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.head = new Node(10);
		l.head.next = new Node(20);
		l.head.next.next = new Node(30);
		l.head.next.next.next = new Node(40);	
		l.head.next.next.next.next = new Node(50);
		l.print(head);
       // l.reverse(head);
       // l.print(head);
	    System.out.println();
        System.out.println(head.data+"-"+head.next.data+"-"+head.next.next.data+"-"+head.next.next.next.data+"-"+head.next.next.next.next.data);

          l.reverseBetween(head, 2, 4);
       // l.print(head);
        System.out.println();
        System.out.println(head.data+"-"+head.next.data+"-"+head.next.next.data+"-"+head.next.next.next.data+"-"+head.next.next.next.next.data);
       // l.print(head);
         }

}
