package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CharaterStream {

	public static void main(String[] args) {
		List<String> in = Arrays.asList("abdu", "Elias", "alemux", "abdu","xxx");  
		
		Stream<String> s = in.stream();
		System.out.println(s.filter(x -> x.startsWith(""+'E')).count());
		
		// ??????
		// Stream<Stream<Character>> cs = in.stream().map(x -> characterStream(x));

	}

}
