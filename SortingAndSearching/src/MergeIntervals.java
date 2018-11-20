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
		 
		 Interval x = new Interval();
		 x.start = intervals.get(0).start;
		 x.end = intervals.get(0).end;
		 
		 for(int k=1; k< intervals.size()-1;k++) {
			   if(x.end < intervals.get(k+1).start) {
				    x.end = Math.max(x.end,intervals.get(k).end);
				    ans.add(x);
				    x = new Interval();                                // we must creat a new object after each x is added to the new list 'ans'; 
				    x.start = intervals.get(k+1).start;
			   }
		 }
		 x.end = Math.max(x.end,intervals.get(intervals.size()-1).end);
		 ans.add(x);
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