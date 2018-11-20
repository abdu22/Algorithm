import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test2 {

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee("d", 250));
		list.add(new Employee("a", 20));
		list.add(new Employee("b", 30));
		
		Collections.sort(list , new MyComparator());
		
		for(Employee x:list) {
			System.out.println(x.getName() +" , "+ x.getName());
		}
		

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

class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1 = (Employee)o1;
		Employee e2 = (Employee)o2;
		
	return e1.getName().compareTo(e2.getName());
	}
	
}