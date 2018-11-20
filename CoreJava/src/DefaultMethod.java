
interface Imy1 {
	default void sqr() {
		System.out.println("interface1 : "+2*2);
	};
}

interface Imy2 {
	default void sqr() {
		  System.out.println("interface2 : "+3*3);
	};
}

class my implements Imy1, Imy2 {
	public void sqr() {
		Imy2.super.sqr();
		Imy1.super.sqr();		
	}
}
public class DefaultMethod {
	public static void main(String[] args) {
		my m = new my();
		m.sqr();
		
	}

}
