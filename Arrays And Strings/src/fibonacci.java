
public class fibonacci {

	public static int fib(int n){
	 if(n==1 || n==2) return 1;
	 int n1 = 1;
	 int n2 = 1;
	 int count = 2;
	 while(count<n) {
		 int temp = n1;
		 n1 = n2;
		 n2=n2+temp;
		 count++;
	 }
	 return n2;
	 }
	
	public static void main(String[] args) {
		System.out.println(fib(6));

	}

}
