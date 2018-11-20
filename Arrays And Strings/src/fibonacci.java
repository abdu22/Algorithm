
public class fibonacci {

	public static void fib(int n){
	      int a = 1; 
	      int b = 1; 
	      int c  = a+b; 
	      System.out.println(a);
	      System.out.println(b);
	      System.out.println(c);
	      int count = 3;
	      help(b,c,n,count);
	      
	    }
	public static void help(int i, int j, int n, int count){
	      
	      if(n>count)  {
	              int k=i+j; 
	              System.out.println(k);
	              i = j; 
	              j = k; 
	              count++;
	              help(i,j,n,count);
	       }
	 }
	
	public static void main(String[] args) {
		fib(7);

	}

}
