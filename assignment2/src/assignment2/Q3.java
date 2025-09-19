package assignment2;

class Employee{
	String name;
	int salary;
	public Employee(String name, int salary ){
		this.name=name;
		this.salary=salary;
	}
}
class Manager extends Employee{
	int bonus;
	public Manager(String name, int salary, int bonus){
		super(name,salary);
		this.bonus=bonus;
	}
	public int totalsalary(){
		return this.salary+this.bonus;
	}
	public void display() {
		System.out.println("total salary is "+totalsalary());
	}
}


public class Q3 {
	public static void main(String[] args) {
		Manager m = new Manager("mehraan",50000,5000);
		m.display();
	}

}
