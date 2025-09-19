package java_exam;
import java.util.*;
class Data1{
	private String sname;
	private String enrollid;
	private String cname;
	private int credits;
	
	public Data1(String sname,String enrollid,String cname,int credits) {
		this.cname=cname;
		this.credits=credits;
		this.enrollid=enrollid;
		this.sname=sname;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getEnrollid() {
		return enrollid;
	}

	public void setEnrollid(String enrollid) {
		this.enrollid = enrollid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}
	public void details() {
		System.out.println("name:"+sname+" enrollmentid:"+enrollid+" course:"+cname+" credits:"+credits);
	}
}
class enrollment1{
	private ArrayList<Data> Student=new ArrayList<>();
	public void addenrollment(Data std) {
		
		
				Student.add(std);
			
		}
	
	public void removeenrollment(String enrollid) {
		if(Student.isEmpty()) {
			System.out.println("no records");
		}
		else {
			for(Data s:Student) {
				if(s.getEnrollid().equalsIgnoreCase(enrollid)) {
					Student.remove(s);
					s.details();
				}
				else {
					System.out.println("id not found");
				}
			}
		}
		
	}
	public void updatecredit(String enrollid,int credits){
		if(Student.isEmpty()) {
			System.out.println("no records");
		}
		else {
			for(Data s:Student) {
				if(s.getEnrollid().equalsIgnoreCase(enrollid)) {
					s.setCredits(credits);
					s.details();
				}
				else {
					System.out.println("not updated");
				}
			}
		}
		
	}
	public void display() {
		if(Student.isEmpty()) {
			System.out.println("no records");
		}
		else {
			for(Data s:Student) {
				s.details();
				
			}
		}
	}
	
}

public class Question2 {
	public static void main(String args[]) {
		try {
			enrollment1 enr=new enrollment1();
			Scanner sc = new  Scanner(System.in);
			int choice;
			while (true) {
				System.out.println("\n Student enrollment");
				System.out.println("1: addenrollment");
				System.out.println("2: removeenrollment");
				System.out.println("3: updatecredits");
				System.out.println("4: display records");
				System.out.println("5: exit");
				choice=sc.nextInt();
				sc.nextLine();
				switch(choice) {
				case 1:
					System.out.println("enetr the name");
					String name = sc.nextLine();
					System.out.println("enter enrollment ID");
					String eid=sc.nextLine();
					System.out.println("enter course name");
					String csname=sc.nextLine();
					System.out.println("enter credits");
					int crd=sc.nextInt();
					enr.addenrollment(new Data(name,eid,csname,crd));
					enr.display();
					break;
				case 2:
					System.out.println("enter enrollment id");
					String enid=sc.nextLine();
					enr.removeenrollment(enid);
					enr.display();
					break;
				case 3:
					System.out.println("enter the enrollment id");
					String erid = sc.nextLine();
					System.out.println("enter the credits");
					int c = sc.nextInt();
					enr.updatecredit(erid, c);
					enr.display();
					break;
				case 4:
					enr.display();
				case 5:
					System.out.println("exiting");
					System.exit(0);
					default:
						System.out.println("invalid choice");
				}
			}
			
		}
		catch(InputMismatchException e) {
			System.out.println("exception handled");
		}
		catch(IllegalArgumentException ei) {
			System.out.println("exception handled");
		}
		catch(IndexOutOfBoundsException eo) {
			System.out.println("exception handled");
		}
	}
	

}
