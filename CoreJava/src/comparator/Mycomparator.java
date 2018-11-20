package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Mycomparator {

	public static void main(String[] args) {
		List<Laptop2> lap = new ArrayList<>();
        lap.add(new Laptop2("mac", 2500));
        lap.add(new Laptop2("serface", 1000));
        lap.add(new Laptop2("hp", 1500));
        
        // Comparator is an interface. 
        // We can implement it with Anonymous inner class
        
        Comparator<Laptop2> comp = new Comparator<Laptop2>() {

			@Override
			public int compare(Laptop2 o1, Laptop2 o2) {
				
				// to compare with brand (String) 
				return o1.brand.compareTo(o2.brand);
				// to comapre with price 
				/*if(o1.price > o2.price) return 1;
				else return -1;*/
			}
        	
        };
        
        Collections.sort(lap, comp );
        for(Laptop2 x:lap) 
        	  System.out.println(x);
	}

}
