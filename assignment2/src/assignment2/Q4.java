package assignment2;
class Person{
	String name;
	int age;
	public Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	void display() {
		System.out.println(name+ " "+age);
	}
	
}
class Student extends Person {
	int rollno;
	int marks;
	public Student(String name,int age,int rollno,int marks) {
		super(name,age);
		this.marks=marks;
		this.rollno=rollno;
	}
	void display() {
		System.out.println("details = "+ name +" "+age+" "+rollno+" "+marks);
	}
}
public class Q4 {
	public static void main(String[] args) {
		Student std=new Student("mehraan",22,2202609,50);
		std.display();
	}

}
