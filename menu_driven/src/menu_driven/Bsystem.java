package menu_driven;
import java.util.ArrayList;
import java.util.Scanner;
class Data{
	private String aname;
	private String anum;
	private double ibalance;
	
	public Data(String aname,String anum,double ibalance) {
		this.aname=aname;
		this.anum=anum;
		this.ibalance=ibalance;
	}

	public String getAname() {
		return aname;
	}

	public void setAnmae(String aname) {
		this.aname = aname;
	}

	public String getAnum() {
		return anum;
	}

	public void setAnum(String anum) {
		this.anum = anum;
	}

	public double getIbalance() {
		return ibalance;
	}

	public void setIbalance(double ibalance) {
		this.ibalance = ibalance;
	}
	public void details() {
		System.out.println(aname+" "+anum+" "+ibalance);
	}
}
class Bankop{
	private ArrayList<Data> accounts=new ArrayList<>();
	public void createAccount(String name, String num, double ibal) {
        accounts.add(new Data(name, num, ibal));
        System.out.println("Account created.");
    }
	public void deposit(String accNum, double amount) {
        for (Data a : accounts) {
            if (a.getAnum().equals(accNum) && amount > 0) {
                a.setIbalance(a.getIbalance() + amount);
                a.details();
                return;
            }
        }
        System.out.println("Account not found or invalid amount.");
    }

    public void withdraw(String accNum, double amount) {
        for (Data a : accounts) {
            if (a.getAnum().equals(accNum) && amount > 0) {
                if (a.getIbalance() >= amount) {
                    a.setIbalance(a.getIbalance() - amount);
                    a.details();
                } else {
                    System.out.println("Insufficient balance.");
                }
                return;
            }
        }
	}
		public void display() {
	        if (accounts.isEmpty()) {
	            System.out.println("No accounts to display.");
	            return;
	        }
	        for (Data a : accounts) a.details();
	    }
		
}
public class Bsystem{
	public static void main(String args[]) {
		Bankop b=new Bankop();
		Scanner sc = new Scanner(System.in);
		int choice;
		while (true) {
			System.out.println("\n BANK SYSTEM");
			System.out.println("1: Create account");
			System.out.println("2: dposit");
			System.out.println("3: withdraw");
			System.out.println("4: Display");
			System.out.println("5: exit");
			
			System.out.println("enter the choice");
			choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				System.out.println("enter the name");
				String name = sc.nextLine();
				System.out.println("enter the acc number");
				String num=sc.nextLine();
				System.out.println("enter the initial balance");
				double ibal=sc.nextDouble();
				b.createAccount(name, num, ibal);
				b.display();
				break;
				
			case 2:
				System.out.println("enter the acc num");
				String dnum=sc.nextLine();
				System.out.println("enetr the ammount");
				double dam = sc.nextDouble();
				b.deposit(dnum, dam);
				b.display();
				break;
				
			case 3:
				System.out.println("enter the acc num");
				String wnum=sc.nextLine();
				System.out.println("enetr the ammount");
				double wam = sc.nextDouble();
				b.withdraw(wnum, wam);
				b.display();
				break;
				
			case 4:
				b.display();
				break;
				
			case 5:
				System.out.println("exiting");
				System.exit(0);
				
				default:
					System.out.println("invalid choice");
				
			}
		}
	}
}
