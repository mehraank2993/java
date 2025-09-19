package assignment2;
class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

public class Qu11 {
    public static void main(String[] args) {
        MathOperations mo = new MathOperations();

        int sum2 = mo.add(5, 10);
        int sum3 = mo.add(1, 2, 3);
        double sumDouble = mo.add(2.5, 3.7);

        System.out.println("Sum of two integers: " + sum2);
        System.out.println("Sum of three integers: " + sum3);
        System.out.println("Sum of two doubles: " + sumDouble);
    }
}
