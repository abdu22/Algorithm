package Singleton2;

public class Singleton4DesignPattern {

	public static void main(String[] args) {
		Runnable r = new multiA();
		
		Thread a = new Thread(r);
		multiB b = new multiB();
		multiC c = new multiC();
		multiD d = new multiD();
		a.start();
		
		b.start(); c.start(); d.start();	
	}
}
class SingletonX {
	 static SingletonX obj ;
	 private SingletonX () {} 
	 public static synchronized SingletonX getSing() {
		 if(obj == null) {
			 System.out.println("obj created ...");
			 obj = new SingletonX();
		 }
		return obj;
	 }
}
class multiA implements Runnable{
	public void run() {
		 SingletonX a = SingletonX.getSing();	
	}
}
class multiB extends Thread{
	public void run() {
		 SingletonX a = SingletonX.getSing();	
	}
}
class multiC extends Thread{
	public void run() {
		 SingletonX a = SingletonX.getSing();		
	}
}
class multiD extends Thread{
	public void run() {
	 SingletonX a = SingletonX.getSing();	
	}
}