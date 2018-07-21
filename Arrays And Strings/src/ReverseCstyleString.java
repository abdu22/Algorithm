
public class ReverseCstyleString {

	public static void main(String[] args) {
		System.out.println(reverse("abcdefghijklmnopqrstuvwxyz"));

	}
   public static String reverse(String s) {
	  
	   char[] cha = s.toCharArray();
	   
	   int i = 0; int j = cha.length-1;
	   char temp;
	   long start = System.nanoTime();
	   while (i<j) {
		   temp = cha[i];
		   cha[i] = cha[j];
		   cha[j] = temp;
		   i++;
		   j--;
	   }
	   long end = System.nanoTime();
	   System.out.println(end-start);
	   return new String(cha);
   }
}
