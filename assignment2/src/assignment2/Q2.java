package assignment2;

class Ehicle{
	String brand;
	float speed;
	Ehicle(String brand, float speed){
		this.brand=brand;
		this.speed=speed;
	}
	
	void displaycardetails() {
		System.out.println(brand + " " + speed );
	}
}
class Car extends Ehicle{
	String fueltype;
	Car(String brand, float speed, String fueltype){
		super(brand,speed);
		this.fueltype=fueltype;
	}
	
	void displaycardetails() {
		System.out.println(brand + " "+speed+" "+fueltype);
	}
	
	
	
}

public class Q2 {
	public static void main(String[] args) {
		Car c =new Car("bmw",222.5f,"petrol");
		c.displaycardetails();
	}

}
