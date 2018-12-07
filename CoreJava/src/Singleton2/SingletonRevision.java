package Singleton2;

public class SingletonRevision {

	public static void main(String[] args) {
		
		Tr1 t1 = new Tr1(); 
		Tr2 t2 = new Tr2();
		Tr3 t3 = new Tr3();
		Tr4 t4 = new Tr4();
		t1.start(); t2.start(); t3.start(); t4.start();
	}

}

class Singleton2 {
	private static Singleton2 obj; 
	private Singleton2 () {};
	
	public static synchronized Singleton2 getObj() {
		if(obj == null) {
		obj = new Singleton2();
		System.out.println("new obj created . . . ");
		} 
		return obj;
	}
}

class Tr1 extends Thread {
	public void run() {
		Singleton2 instance = Singleton2.getObj();
 	}
}
class Tr2 extends Thread {
	public void run() {
		Singleton2 instance = Singleton2.getObj();
 	}
}
class Tr3 extends Thread {
	public void run() {
		Singleton2 instance = Singleton2.getObj();
 	}
}
class Tr4 extends Thread {
	public void run() {
		Singleton2 instance = Singleton2.getObj();
 	}
}