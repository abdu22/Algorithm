package Comparable;
//implements comparable 
public class Laptop implements Comparable<Laptop>{
    public String brand; 
    public int price;
	public Laptop(String brand, int price) {
		super();
		this.brand = brand;
		this.price = price;
	}
	// compare it with the price
	@Override
	public int compareTo(Laptop o) {
		if(this.price > o.price) return 1;
		else return -1;
	}
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", price=" + price + "]";
	}
    
    
}
