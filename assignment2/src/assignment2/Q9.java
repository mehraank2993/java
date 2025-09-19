package assignment2;
class laptop{
	private String brand;
	private double price;
	public laptop(String brand,double price) {
		this.brand=brand;
		this.price=price;
	} 
	public String getbrand() {
		return brand;
	}
	public String setbrand(String brand) {
		return this.brand=brand;
	}
	public double getprice() {
		return price;
	}
	public double setprice(double price) {
		return this.price=price;
	}
}

public class Q9 {
	public static void main(String[] args) {
		laptop l= new laptop("hp",350000);
		System.out.println("Details :"+l.getbrand()+" "+l.getprice());
	}

}
