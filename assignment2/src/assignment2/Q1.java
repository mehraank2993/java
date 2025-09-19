package assignment2;

class animal{
	void makesound(){
		System.out.println("animal makes sound");
	}
}
class dog extends animal{
	void makesound() {
		System.out.println("Dog barks");
	}
}
public class Q1 {
	public static void main(String[] args) {
		animal a = new animal();
		a.makesound();
		dog d = new dog();
		d.makesound();
	}

}
