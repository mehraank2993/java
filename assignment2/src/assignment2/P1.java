package assignment2;
abstract class Payment {
    abstract void payAmount(double amount);
}

class CreditCardPayment extends Payment {
    @Override
    void payAmount(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}

class UPIPayment extends Payment {
    @Override
    void payAmount(double amount) {
        System.out.println("Paid " + amount + " using UPI.");
    }
}

public class P1 {
    public static void main(String[] args) {
        Payment payment1 = new CreditCardPayment();
        Payment payment2 = new UPIPayment();

        payment1.payAmount(1500.75);
        payment2.payAmount(800);
    }
}
