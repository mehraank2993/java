package assignment2;
class Calculator {
    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double multiply(int a, double b) {
        return a * b;
    }

    public double multiply(double a, int b) {
        return a * b;
    }
}

public class Qu13 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Multiply two integers: " + calc.multiply(3, 4));
        System.out.println("Multiply two doubles: " + calc.multiply(2.5, 4.5));
        System.out.println("Multiply int and double: " + calc.multiply(5, 3.5));
        System.out.println("Multiply double and int: " + calc.multiply(3.5, 5));
    }
}
