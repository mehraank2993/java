package assignment2;
class BankAccount{
	private String accNumber;
	private int balance;
	public BankAccount(String accNumber,int balance) {
		this.accNumber=accNumber;
		this.balance=balance;
	}
	public String getaccNumber() {
		return accNumber;
	}
	public String settaccNumber(String accNumber) {
		return this.accNumber=accNumber;
	}
	public int getbalance() {
		return balance;
	}
	public int setbalance(int balance) {
		return this.balance=balance;
	}	
}

public class Q6 {
	public  static void main(String[] args) {
		BankAccount b = new BankAccount("MK786452JK",3500000);
		System.out.println("Detaisl: " + b.getaccNumber()+" "+b.getbalance());
		b.setbalance(4500000);
		System.out.println("Detaisl updated : " + b.getaccNumber()+" "+b.getbalance());

	}

}
