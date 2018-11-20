package Singleton2;

public class SingletonDesign {

	public static void main(String[] args) {
		
		T1 a =new T1();
		T2 b =new T2();
		T3 c =new T3();
		T4 d = new T4();
		a.start();    b.start();   c.start();     d.start();
	}

}


class T1 extends Thread {
	
	public void run() {
		Singleton obj =Singleton.getSingelton();
	}
	   
}
class T2 extends Thread {
	
	public void run() {
		Singleton obj =Singleton.getSingelton();
	}
	   
}

class T3 extends Thread {
	
	public void run() {
		Singleton obj =Singleton.getSingelton();
	}
	   
}
class T4 extends Thread {
	
	public void run() {
		Singleton obj =Singleton.getSingelton();
	}
	   
}

class Singleton {
	
	 private static Singleton instance = null; 
	 
	 private Singleton () {};
	
	 
	 public /*synchronized*/ static  Singleton  getSingelton() {
		 
		 if(instance == null) {
			 instance =  new Singleton();
			 System.out.println("instance created");
		 }
		
		 return instance;
	 }
	 
	 
}
