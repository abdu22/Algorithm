package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CharaterStream {

	public static void main(String[] args) {
		List<String> in = Arrays.asList("abdu", "Elias", "alemux", "abdu","xxx");  
		
		Stream<String> s = in.stream();
		System.out.println(s.filter(x -> x.startsWith(""+'E')).count());
		
		/*List<String> in = Arrays.asList("abdu", "Elias", "alemux", "abdu","xxx");  
		
		
		List<String> out = in.stream().map(x->x.toUpperCase()).filter(x -> x.startsWith("A")).collect(Collectors.toList());
		
        out.stream().forEach(x-> System.out.println(x));*/
		
		// ??????
		// Stream<Stream<Character>> cs = in.stream().map(x -> characterStream(x));

	}

}
