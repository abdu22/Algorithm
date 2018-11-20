package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mymain {
 
	public static void main(String[] args) {
         List<Laptop> lap = new ArrayList<>();
         lap.add(new Laptop("mac", 2500));
         lap.add(new Laptop("serface", 1000));
         lap.add(new Laptop("hp", 1500));
         
         Collections.sort(lap);
         for(Laptop x:lap)
        	 System.out.println(x);
	}

}
