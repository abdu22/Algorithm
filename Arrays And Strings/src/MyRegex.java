
public class MyRegex {

	
    
private static String pattern = "[+-]?\\d*(\\.\\d+)?";
String ipAdd = ""; 
public MyRegex(String iP) { 
    this.ipAdd = iP;
}

public boolean isMatch() {
    boolean ans = false; 
    if(ipAdd.charAt(0) == '.' || ipAdd.charAt(ipAdd.length()-1) == '.') return false;
    
    String [] a = ipAdd.split("\\."); 
    
    System.out.println(ipAdd);
    
    if(a.length != 4) return false; 
    for(String x:a){
    	System.out.println("********");
    	
        if(x.matches(pattern) && (Integer.parseInt(x)) >=0 && (Integer.parseInt(x)) <=255) {
        	ans = true ; }else {
        		return false;
        	}
        }
    
    return ans;
}
    
    public static void main(String[] args) {
		String Input = "000.12.12.034";
		String Input2 = 	"121.234.12.12";
	    String Input3 = 		"23.45.12.56";
 
	    
	    MyRegex r = new MyRegex(Input);
	    System.out.println(r.isMatch());
	    
	    String v = "000";
	    
	    String pat = "[+-]?\\d*(\\.\\d+)?";
	    
	    System.out.println((v.matches(pat)));
	}
}
