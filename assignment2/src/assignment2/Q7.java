package assignment2;
class Student1{
	private String name;
	private int marks;
	public Student1(String name,int marks) {
		this.name=name;
		this.marks=marks;
	}
	public String getname() {
		return name;
	}
	public String setname(String name) {
		return this.name=name;
	}
	public int getmarks() {
		return marks;
	}
	public int setmarks(int marks) {
		return this.marks=marks;
	}	
}




public class Q7 {
	public  static void main(String[] args) {
		Student1 b = new Student1("MK",35);
		System.out.println("Detaisl: " + b.getname()+" "+b.getmarks());
		b.setmarks(45);
		System.out.println("Detaisl updated : " + b.getname()+" "+b.getmarks());

	}

}
