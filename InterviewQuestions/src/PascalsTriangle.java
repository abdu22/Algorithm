import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
	// TODO Auto-generated method stub
    public static void main(String args []) {
			int input = 4;
			List<List<Integer>> output = generate(input);
			System.out.println(output);
			for(int i=0; i<input ; i++) {
				System.out.println(output.get(i));
			}
			 /* [
					     [1],
					    [1,1],
					   [1,2,1],
					  [1,3,3,1],
					 [1,4,6,4,1]
				]*/  
		}
		 public static List<List<Integer>> generate(int numRows) {	 
		   List<List<Integer>> ans = new ArrayList<List<Integer>>();
			 List<Integer> a = new ArrayList<Integer>();
			if(numRows > 0) {
				 a.add(1);
				 List<Integer> prev=a; 
				 ans.add(a);
				 for(int i=1; i<numRows ; i++) {
			       a = new ArrayList<Integer>();
			       a.add(1);  
			       int count=1;
				          while(prev.size()>count) {
				        	  int newN = prev.get(count)+prev.get(count-1);
				        	  a.add(newN); 
				        	  count++;
				          }	
				   a.add(1);
				   ans.add(a);
				   prev = a;
				 }
			}
			return ans;  
		    }

}
