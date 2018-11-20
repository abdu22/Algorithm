
public class DivideTwoInteger {
	// GOOD But too slow (O(n); 
	public static int divide(int dividend, int divisor) {
		// GOOD But too slow (O(n);
		int sign1 = 1;  int sign2 = 1;
		if(dividend == Integer.MIN_VALUE) {
			dividend = dividend+1;
		}
		if(divisor<0) {
			sign1 = -1;
			divisor = Math.abs(divisor);
		}
        if(dividend<0) {
    		//System.out.println("***********"+dividend);
			sign2 = -1;
			dividend = Math.abs(dividend);
			//System.out.println("##########"+dividend);	
		}
		int count = 0;
		//System.out.println(dividend + " , "+divisor);
		while(dividend >= divisor) {
			dividend = 	dividend-divisor;
			count++;
		}
		
        return count*sign1*sign2;
        
    }
	// option two use bit manipulation. 
	
	public static void main(String[] args) {
		System.out.println(divide(10,3));
		System.out.println(divide(7,-3));
		System.out.println(divide(-7,3));
		
		System.out.println(divide(-2147483648,-1));
		System.out.println(divide(2147483647,1));
		//int a = 2147483647;
		//int x = Math.abs(-2147483648);
		//System.out.println(x);
	}

}
