package assignment2;
class Car2{
	private String model;
	private int year;
	private int price;
	public Car2(String model,int year,int price) {
		this.model=model;
		this.year=year;
		this.price=price;
	}
	public String getmodel() {
		return model;
	}
	public String setmodel(String model) {
		return this.model=model;
	}
	public int getyear() {
		return year;
	}
	public int setyear(int year) {
		return this.year=year;
	}	
	public int getprice() {
		return price;
	}
	public int setpricel(int price) {
		return this.price=price;
	}
}




public class Q8 {
	public  static void main(String[] args) {
		Car2 b = new Car2("MK",35,50000);
		System.out.println("Detaisl: " + b.getmodel()+" "+b.getyear()+" "+b.getprice());
		b.setyear(45);
		System.out.println("Detaisl updated : " + b.getmodel()+" "+b.getyear()+" "+b.getprice());

	}

}
