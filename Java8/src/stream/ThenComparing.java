package stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class ThenComparing {

	public static void main(String[] args) {
       Function<Employee, String> byname = e -> e.getName(); 
       Function<Employee, Integer> byage = e -> e.getAge();
       
       List<Employee> emp = Arrays.asList( new Employee("abdu", 25),
    		   								new Employee("abdu", 20),
    		   								new Employee("elias", 19));  
       
       Collections.sort(emp, Comparator.comparing(byname).thenComparing(byage).reversed());
       			for(Employee x:emp) 
       					System.out.println(x.getName()+" , "+x.getAge());
       			
       			/*		elias , 19
       					abdu ,  25
       					abdu ,  20	*/
	}
}
class Employee {
	private String name;
	private int age;
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	} 
	
	
}