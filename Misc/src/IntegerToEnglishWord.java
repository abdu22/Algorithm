import java.util.HashMap;

public class IntegerToEnglishWord {

	public static void main(String[] args) {
		String s = numberToWords(1234567891);
		String s2 = numberToWords(2100000000);
		//problem on 1,000,000  
       System.out.println(s);
       System.out.println(s2);
	}
  
 
   public static String numberToWords(int num) {
	   HashMap<Integer,String> h1 = new HashMap<>();
	   HashMap<Integer,String> h2 = new HashMap<>();
	   HashMap<Integer,String> h3 = new HashMap<>(); 
	   HashMap<Integer,String> h4 = new HashMap<>();
	   
	   h1.put(1,"One");   h1.put(2,"Two");  h1.put(3,"Three");   h1.put(4,"Four");  h1.put(5,"Five"); 
	   h1.put(6,"Six");   h1.put(7,"Seven"); h1.put(8,"Eight");  h1.put(9,"Nine");
	   
	   h2.put(2, "Twenty"); h2.put(3, "Thirty"); h2.put(4, "Forty"); h2.put(5, "Fifty");
	   h2.put(6, "Sixty"); h2.put(7, "Seventy"); h2.put(8, "Eighty"); 
	   h2.put(9, "Ninety");   
	   h3.put(2, "Hundred");   h3.put(3, "Thousand");  h3.put(6,"Million"); h3.put(9, "Billion");
	   
	   h4.put(10,"Ten");  h4.put(11,"Eleven");   h4.put(12,"Twelve");  h4.put(13,"Thirteen");
	   h4.put(14,"Fourteen");  h4.put(15,"Fifteen"); 
	   h4.put(16,"Sixteen");   h4.put(17,"Seventeen"); h4.put(18,"Eighteen");  h4.put(19,"Nineteen");
	   
	   
	   int count = 0;
	   String ans = "";
	   int dig;
	   int tempDig = num%100;
	   if(num==0) return "Zero";
	   //if(num % 1000000 ==)
	     if(tempDig>9 && tempDig<20) {
	    	 ans = h4.get(tempDig);
	    	 count = count+2;
	    	 num = num/100;
	    	 dig = num%10;
	     }else {
	    	 dig = num%10;
	  	     if(dig != 0)  ans = h1.get(dig);
	     }
	   
	   while(num>0) {
		   if(dig > 0) {
		   if(count == 3||count == 6 || count == 9 ) {
			     ans = h3.get(count) + " "+ans;
			       tempDig = num%100;
			     if(tempDig>9 && tempDig<20) {
			    	 ans = h4.get(tempDig) +" "+ans;
			    	 count = count+2;
			    	 num = num/100;
			    	 dig = num%10;
			    	 continue;
			     }
			     ans = h1.get(dig) + " "+ans;
		   }else if (count == 1 || count == 4||count == 7) {
			     ans = h2.get(dig) +" "+ ans;
		   }else if(count == 2 || count == 5||count ==8) {
			     ans = h3.get(2) +" "+ ans;
			     ans = h1.get(dig)+ " "+ ans;
		   }
		   }else if(dig==0) {
			   if(count == 3||count == 6 || count == 9 ) {
				     ans = h3.get(count) + " "+ans;
				       tempDig = num%100;
				     if(tempDig>9 && tempDig<20) {
				    	 ans = h4.get(tempDig) +" "+ans;
				    	 count = count+2;
				    	 num = num/100;
				    	 dig = num%10;
				    	 continue;
				     }
				     //ans = h1.get(dig) + " "+ans;
			   }
		   }
		   num = num/10;
		   dig = num%10;
		   count++;
	   }
	   
	   return ans.trim();
    }
}
