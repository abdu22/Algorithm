import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LCAofBT {
    
	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data = data;
			left = right = null;
		}	
	}
	Node root;
	List<Integer> l1 = new ArrayList<>();
	List<Integer> l2 = new ArrayList<>();
	
	public int findLCA(int i, int j) {
		 if(root == null) return -1;
		 l1.clear();
		 l2.clear();
		 return findLCA(root,i,j);
		 //return 0;
	}
	public int findLCA(Node root, int i, int j) {
		
		if(!Path(root,i,l1) || !Path(root,j,l2))   return -1;
		int k;
		
		for(int x:l1) System.out.println(x+" , ");
		for(int x:l2) System.out.println(x+" , ");
		
		    for(k = 0; k<l1.size() && k<l2.size(); k++) {
		    	  
			    if(!l1.get(k).equals(l2.get(k)))  break;
		    } 
		    
		  System.out.println("k :"+k);
		return l1.get(k-1); 
		
	}
	
	public boolean Path(Node root, int n, List<Integer> l) {
		
		if(root == null) return false;
		
		l.add(root.data) ;
		if(root.data == n) return true; 
		
		if(root.left != null && Path(root.left,n,l)) return true;
		if(root.right != null && Path(root.right,n,l)) return true;
		
		 l.remove(l.size()-1);
		  return false;
	}

    public int findLCA2(int i, int j) {
    	l1.clear();
    	l2.clear();
    	return findLCA2(root,i,j) ;
    }
    
    public int findLCA2(Node root, int i, int j) {
    	int ans = -1;
    	
    	if(!path2(root,l1,i) || !path2(root,l2,j)) return ans;
    	System.out.println(l1);
    	System.out.println(l2);
    	int a = 0;
    	for(a=0; a<l1.size()&& a<l2.size() ; a++) {
    		  if(l1.get(a) != l2.get(a)) {
        		  break;
    		  } 
    	}
    	
    	return l1.get(a-1);
    }
    public boolean path2(Node root, List<Integer> l, int i) {
    	if(root == null) return false;
    	l.add(root.data);
    	
    	if(root.data == i) return true;
    	
    	if(root.left !=null && path2(root.left,l,i)) return true;
    	
    	if(root.right !=null && path2(root.right,l,i)) return true;
    	
    	l.remove(l.size()-1);
    	
    	return false;
    }
    
	public static void main(String[] args) {
		LCAofBT tree = new LCAofBT(); 
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
        tree.root.right.left = new Node(6); 
        tree.root.right.right = new Node(7); 
  
        String w = "zzz";
        w.toCharArray();
    
        System.out.println("LCA(4, 5): " + tree.findLCA2(4,5)); 
        System.out.println("LCA(4, 6): " + tree.findLCA2(4,6)); 
        System.out.println("LCA(3, 4): " + tree.findLCA2(3,4)); 
        System.out.println("LCA(2, 4): " + tree.findLCA2(2,4)); 

	}

}
