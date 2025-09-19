package constructor_chaining;
class Vehicle{
	private String make;
	private String model;
	private int year;

	public Vehicle(String make,String model,int year) {
		this.make=make;
		this.model=model;
		this.year=year;
	} 
	public String getmake() {
		return make;
	}
	public String getmodel() {
		return model;
	}
	public int getyear() {
		return year;
	}
}
class Car extends Vehicle{
	 int numofdoors;

	public Car(String make, String model, int year,int numofdoors) {
		super(make, model, year);
		this.numofdoors=numofdoors;
	}
	public Car(String make,String model) {
		super(make,model,2025);
		this.numofdoors=4;
	}
	public int getnumofdoors() {
		return numofdoors;
	}
	
}
public class Rental {
	public static void main(String args[]) {
		Car car1=new Car("toyota","supra",2025,2);
		System.out.println("car1: "+ car1.getmake()+" "+car1.getmodel()+" "+car1.getyear()+" "+car1.getnumofdoors());
		Car car2=new Car("lambo", "urus");
		System.out.println("car2: "+car2.getmake()+" "+car2.getmodel()+" "+car2.getyear()+" "+car2.getnumofdoors());
	}
	

}
