package Singleton;

public class LazySingltonDoubleLockChaining {
   
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread( new Runnable() {

			@Override
			public void run() {
				Sigleton o = Sigleton.getInstance();
			}
			
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				Sigleton o2 = Sigleton.getInstance();
				
			}
			
		});
		Thread t3 = new Thread( new Runnable() {

			@Override
			public void run() {
				Sigleton o = Sigleton.getInstance();
			}
			
		});
		Thread t4 = new Thread(new Runnable() {

			@Override
			public void run() {
				Sigleton o2 = Sigleton.getInstance();
				
			}
			
		});
		
        t1.start();
        t2.start();
        t3.start();
        t4.start();
	} 
}

class Sigleton {
	 private static  Sigleton obj ;
	 String s;
	 private Sigleton () {}
	 
	 public /*synchronized*/ static Sigleton getInstance() {
		 if(obj == null) { 
			 
			 synchronized(Sigleton.class) {
				 if(obj == null) {
					 obj = new Sigleton();
					 System.out.println("Instance is Created!");
				 }
			 }
			  }
		 return obj;
	 }
	 
  } 
