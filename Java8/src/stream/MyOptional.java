package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MyOptional {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("aaa","bbb","ccc","aaa");
	    Optional<String> aNames = names.stream()
	    		                   .filter(x -> x.startsWith("a"))
	    		                   .findAny();
	    
	     System.out.println(aNames.isPresent());
	     aNames.ifPresent(x-> System.out.println(x));
	     //System.out.println(aNames.orElse("Not found"));
        
	     System.out.println("================");
	     List<Integer> n = Arrays.asList(1,2,3,4,5,6,7,10);
	     Integer sum = n.stream().filter(x->x>5).reduce(1, (x,y) -> x*y);
	     System.out.println(sum);
	}

}
