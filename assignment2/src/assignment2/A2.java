package assignment2;
class Vehicle {
    public void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle {
    @Override
    public void run() {
        System.out.println("Bike is running safely");
    }
}

class CaR extends Vehicle {
    @Override
    public void run() {
        System.out.println("Car is running smoothly");
    }
}

public class A2 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Bike bike = new Bike();
        CaR car = new CaR();

        vehicle.run();
        bike.run();
        car.run();
    }
}
