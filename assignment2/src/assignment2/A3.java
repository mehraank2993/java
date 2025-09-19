package assignment2;
class Bank {
    public double getInterestRate() {
        return 0;
    }
}

class SBI extends Bank {
    @Override
    public double getInterestRate() {
        return 7.5;
    }
}

class HDFC extends Bank {
    @Override
    public double getInterestRate() {
        return 8.0;
    }
}

public class A3 {
    public static void main(String[] args) {
        Bank sbi = new SBI();
        Bank hdfc = new HDFC();

        System.out.println("SBI Interest Rate: " + sbi.getInterestRate() + "%");
        System.out.println("HDFC Interest Rate: " + hdfc.getInterestRate() + "%");
    }
}
