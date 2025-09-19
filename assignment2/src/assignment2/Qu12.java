package assignment2;
class Printer {
    public void print(String value) {
        System.out.println(value);
    }

    public void print(int value) {
        System.out.println(value);
    }

    public void print(double value) {
        System.out.println(value);
    }
}

public class Qu12 {
    public static void main(String[] args) {
        Printer printer = new Printer();
        
        printer.print("Hello, mk");
        printer.print(123);
        printer.print(45.67);
    }
}
