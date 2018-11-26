package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LetterStartsWith {

	public static void main(String[] args) {
		List<String> in = Arrays.asList("abdu", "Elias", "alemu", "abdu");
		List<String> out_1 = findStartsWithLetterToUpper_1(in,'a');
		List<String> out_2 = findStartsWithLetterToUpper_2(in,'a');
		
		System.out.println(out_1);
		System.out.println(out_2);
	}
	// before Java 8
	public static List<String> findStartsWithLetterToUpper_1( List<String> list, char c) {
		
		List<String> ans = new ArrayList<String>();
		
		for(String x:list) {
			if(x.charAt(0)==c) ans.add(x);
		}
		return ans; 	
	}
	//  Java 8
		public static List<String> findStartsWithLetterToUpper_2( List<String> list, char c) {
			
			List<String> ans = new ArrayList<String>();
			
			ans = list.stream()
					   .filter(x ->x.startsWith(""+c))
					   .distinct()
					   .map(x -> x.toUpperCase())
					   .collect(Collectors.toList());
			return ans; 	
		}
}
