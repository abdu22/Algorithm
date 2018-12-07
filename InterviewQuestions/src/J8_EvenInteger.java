import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class J8_EvenInteger {

	public static void main(String[] args) {
		List<Integer> input = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
		List<Integer> output = EvenInt2(input);
		
		System.out.println(output);
	}
	public static List<Integer> EvenInt2 (List<Integer> ints){
		
		return ints.stream().filter(x -> (x%2)==0).collect(Collectors.toList());
		
	}
	 public static List<Integer> EvenInt (List<Integer> ints){

			 List<Integer> EvenNums = new ArrayList<Integer>();
	
			 EvenNums =ints.stream().filter(e -> e%2 == 0)
					 .map(x -> x+100)
					 .distinct().collect(Collectors.toList());
	
			 return EvenNums;
      }

}
