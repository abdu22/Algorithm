import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
	private static class IntervalCompar implements Comparator<Interval>{
		@Override
		public int compare(Interval a, Interval b) {
			return a.start < b.start ? -1 : a.start == b.start ? 0 :1 ;
		}	 
	}
	 // Input: [[1,3],[2,6],[8,10],[15,18]]                  
    // Output: [[1,6],[8,10],[15,18]]
	
	//     1 - 3
    //       2 - - - 6
	//                   8 - 10
	//						       15 - - 18
	
	// int put : [[1,4],[0,2],[3,5]] expected [0-5]  == my 1st cod == >  [[0,4],[3,5]] 
	// sorted    [0,2],[1,4],[3,5]
	
	//   0 - 2
	//     1 - - 4
	//         3 - -5
	
			
	public static class Interval {
		int start;
		int end; 
		Interval () {start = 0; end = 0;}
		Interval (int s, int e) { 
			this.start = s;
			this.end = e;
		}
	}	
	public static List<Interval> merge(List<Interval> intervals) {
		
		 List<Interval> ans = new ArrayList<>();
		 
		 if(intervals.isEmpty()) return ans;
		 
		 Collections.sort(intervals, new IntervalCompar());        // to sort with key as "start" 
		 

		 int l = intervals.get(0).start;
		 int r = intervals.get(0).end;
		 
		 for(int i=1; i<intervals.size(); i++) {
			 
			      if(r < intervals.get(i).start) {
			    	  
			    	  ans.add(new Interval(l,r));
			    	  
			    	  l = intervals.get(i).start;
			    	  r = intervals.get(i).end;
			      }else if(r >= intervals.get(i).start && r < intervals.get(i).end) {
			    	    r = intervals.get(i).end;
			      }
		 }
		 ans.add(new Interval(l,r));
		 
		return ans;   
    }
	public static void main(String[] args) {
		List<Interval> input = new ArrayList<>();
		
		input.add(new Interval(2,3));
		input.add(new Interval(4,5));
		
		input.add(new Interval(6,7));
		input.add(new Interval(8,9));
		input.add(new Interval(1,10));
		
		//System.out.println(input.get(0).start+" , "+input.get(0).end);
		List<Interval> output = merge(input);

		for(Interval v:output)
			System.out.println(v.start+" , "+v.end);
		
		List<Interval> input2 = new ArrayList<>(); 
	    System.out.println(input2.isEmpty());
	    merge(input2);
		
	}
}