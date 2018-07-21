
public class AddBinary {

	public static void main(String[] args) {
		String a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
		String b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
		
		String x = "1010";
		String y = "1011";
		System.out.println(toDecimal(a));
		System.out.println(toDecimal(b));
		
		long c = toDecimal(a)+toDecimal(b);
		
		//the problem is about data type
		System.out.println(addBinary(a,b));
		int v = 10;
		int w = 11;
		
		//System.out.println(addBinary(a,b));

	}
public static String addBinary(String a, String b) {
	long DeciSum = toDecimal(a)+toDecimal(b);
	
	return toBinary(DeciSum);  
    }
    public static int toDecimal(String s){
        int n = 0;
        int x = 0;
        int d = 0;
        while(s.length()>0){
            d = Integer.parseInt(s.substring(s.length()-1));
            if(d==0 && x == 0) {
            	  n = 0;
            }else {
            	n += Math.pow((2*d),x);
            }
            
            x++;
            s = s.substring(0,s.length()-1);
        }
        return  n;
    }
    public static String toBinary(Long n){
    	    if(n==0) return "0";
        String s = "";
        while(n>0) {
        Long m = n%2;
        s = s+ m.toString();
        n = n/2;
        }
        s =  new StringBuffer(s).reverse().toString();
        return s;
    }
}
