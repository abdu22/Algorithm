package Singleton2;

class Sigleton {
	private static Sigleton obj;
	
	private Sigleton () {};
	
	public static /*synchronized*/ Sigleton getObj() {
		 
		if(obj == null) {
			synchronized(Sigleton.class) {
				if(obj == null) {
					obj = new Sigleton();
					 System.out.println("obj created");
				}
			}
			 
		 } 
		return obj;
	}
	
}
class A implements Runnable {
	 public void run() {
		 Sigleton o1 = Sigleton.getObj();
		 
		 for(int i=0;i<5;i++) {
			  try {System.out.println("from A"); Thread.sleep(0); } catch (InterruptedException e) {e.printStackTrace();}
		 }
	 }
}
class B extends Thread {
	 public void run() {
		 Sigleton o1 = Sigleton.getObj();
		 for(int i=0;i<5;i++) {
			  try {System.out.println("from B"); Thread.sleep(0); } catch (InterruptedException e) {e.printStackTrace();}
		 }
	 }
}
class C extends Thread {
	 public void run() {
		 Sigleton o1 = Sigleton.getObj();
		 for(int i=0;i<5;i++) {
			  try {System.out.println("from C"); Thread.sleep(500); } catch (InterruptedException e) {e.printStackTrace();}
		 }
	 }
}
class D extends Thread {
	 public void run() {
		 Sigleton o1 = Sigleton.getObj();
		 for(int i=0;i<5;i++) {
			  try {System.out.println("from D"); Thread.sleep(500); } catch (InterruptedException e) {e.printStackTrace();}
		 }
	 }
}
public class Singleton2 {

	public static void main(String[] args) throws InterruptedException {
		
          Runnable r = new A();
          Thread  a = new Thread(r);
          B b = new B();
          C c = new C();
          D d = new D();
          
          a.start();
          b.start();
          c.start();
          d.start();
          a.join(); b.join(); c.join(); d.join();
	System.out.println("this is from the parent thread");	

	}

}
