package assignment2;
class Shape{
	void area(){
		System.out.println("area");
		
	}
}
class Circle extends Shape{
	float r= 5.5f;
	float pi=3.14f;
	void area(float r){
		float result = r*r*pi;
		System.out.println("area is :" + result ); 
	}
	
}

public class Q5 {
	public static void main(String[] args) {
		Circle c = new Circle();
		System.out.println("area of circle is: "+c);
		
		
	}

}
