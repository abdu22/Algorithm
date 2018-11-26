package stream;

import java.util.Arrays;
import java.util.List;

public class Stream_1 {

	public static void main(String[] args) {
		
		List<String> in = Arrays.asList("abdu", "Elias", "alemux", "abdu","xxx");
       
		long out = in.stream()
				            .filter(x -> x.startsWith(""+'a'))
				            .filter(x -> !x.endsWith(""+'n'))
				            .count();
		System.out.println(out);
		
		
	}

}
