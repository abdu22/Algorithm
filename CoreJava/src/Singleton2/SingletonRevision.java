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

class Singleton3 {
	private static Singleton3 obj; 
	private Singleton3 () {};
	
	public static /*synchronized */Singleton3 getObj() {
		if(obj == null) {
		obj = new Singleton3();
		System.out.println("new obj created . . . ");
		} 
		return obj;
	}
}

class Tr1 extends Thread {
	public void run() {
		Singleton3 instance = Singleton3.getObj();
 	}
}
class Tr2 extends Thread {
	public void run() {
		Singleton3 instance = Singleton3.getObj();
 	}
}
class Tr3 extends Thread {
	public void run() {
		Singleton3 instance = Singleton3.getObj();
 	}
}
class Tr4 extends Thread {
	public void run() {
		Singleton3 instance = Singleton3.getObj();
 	}
}