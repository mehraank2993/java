package menu_driven;
import java.util.*;
class data{
	private String ename;
	private String eid;
	private String dept;
	
	public data(String ename,String eid,String dept ) {
		this.dept=dept;
		this.eid=eid;
		this.ename=ename;
	}
	public String getename() {
		return ename;
	}
	public String getdept() {
		return dept;
	}
	public String geteid() {
		return eid;
	}	
	public String setdept(String dept) {
		return this.dept=dept;
	}
	public void details() {
		System.out.println(ename+" "+eid+" "+dept);
	}
}

class Employee{
	private ArrayList<data> list=new ArrayList<>();
	public void addemp(data emp) {
		list.add(emp);
	}
	public void updateemp(String eid,String dept) {
		if(list.isEmpty()) {
			System.out.println("no data");
		}
		else {
			for(data e:list) {
				if(e.geteid().equals(eid)) {
				e.setdept(dept);
				e.details();
				}
			}
						}
	}
	public void removeemp(String eid) {
		if(list.isEmpty()) {
			System.out.println("no data");
		}
		else {
			for(data e:list) {
				if(e.geteid().equals(eid)) {
				list.remove(e);}
			}
				
		}
	}
	public void displayall() {
		if(list.isEmpty()) {
			System.out.println("no data");
		}
		else {
			for(data e:list) {
				e.details();
			}
		
		}
	}
	
}

public class Edata {
	public static void main(String args[]) {
		Employee empl=new Employee();
		Scanner sc=new Scanner(System.in);
		int choice;
		
		while(true) {
			System.out.println("\n employee database");
			System.out.println("1: add employee");
			System.out.println("2: update");
			System.out.println("3: remove");
			System.out.println("4: display");
			System.out.println("5: exit");
			
			choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				System.out.println("enter the name");
				String name =sc.nextLine();
				System.out.println("enter the employee id");
				String id = sc.nextLine();
				System.out.println("enter the department");
				String d = sc.nextLine();
				empl.addemp(new data(name,id,d));
				break;
			case 2:
				System.out.println("enter the id");
				String i=sc.nextLine();
				System.out.println("enter  the value to change");
				String cv=sc.nextLine();
				empl.updateemp(i, cv);
				break;
			case 3:
				System.out.println("Enter the id");
				String ei = sc.nextLine();
				empl.removeemp(ei);
				break;
			case 4:
				empl.displayall();
				break;
				
			case 5:
				System.out.println("exiting");
				System.exit(0);
			default:
				System.out.println("invalid");
			}

			
		}
	}

}
