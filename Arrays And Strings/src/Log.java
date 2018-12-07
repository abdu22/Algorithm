import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Log {
	
	static HashMap<String, Integer> h = new HashMap<>();
	 private static final Scanner scan = new Scanner(System.in);
	    
	    public static void main(String args[]) throws Exception {
	        // read the string filename
	    	System.out.print("Enter the file name with extension : ");
	        String filename;
	        filename = scan.nextLine();
	        File file = new File(filename);  
	        //Scanner input = new Scanner(file); 
	        
	        BufferedReader br=new BufferedReader(new FileReader(file));
	     	
	     	
	    	String s;
            while((s=br.readLine()) != null) {
            	   System.out.println(s);
            	   String[] splt = s.split(" ");
            	   //System.out.println(splt[0]);
            	   if(h.get(splt[0]) == null) {
            		    h.put(splt[0], 1);
            	   }else {
            		   h.put(splt[0], h.get(splt[0])+1);
            	   }
            }
     List<String> arr = new ArrayList<String>( h.keySet());
     
     for(String x:arr)
    	 System.out.println(x+" "+h.get(x));
     
     FileWriter writer = new FileWriter("/Users/abdurahmanmustefa/git/Algorithm/Arrays And Strings/src/a2.txt"); 
     for(String y:arr) {
    	     String v = y+h.get(y);
    	     writer.write(v+"\n");
     }  	
            br.close();
            writer.close();
	       
	    }
}
