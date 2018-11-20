package Singleton;

class SingleClass {
	 private static SingleClass inst = new SingleClass();
	 private SingleClass() { }
	 public static SingleClass getInstance() {
		 return inst;
	 }
	 int c = 0;
	 public void message() {
		 c++;
		 System.out.println("singleton created : "+c);
	 }
	 
}
public class EagerSinglton {

	public static void main(String[] args) {
		// error b/c we make constructor private
		//SingleClass obj = new SingleClass();
		
		SingleClass obj = SingleClass.getInstance(); 
		obj.message();
		
		
		
		System.out.println("=================");
		

	}
}
