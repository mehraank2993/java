package assignment2;
abstract class Appliance {
    abstract void turnOn();
    abstract void turnOff();
}

class WashingMachine extends Appliance {
    @Override
    void turnOn() {
        System.out.println("Washing machine turned on.");
    }

    @Override
    void turnOff() {
        System.out.println("Washing machine turned off.");
    }
}

class Refrigerator extends Appliance {
    @Override
    void turnOn() {
        System.out.println("Refrigerator turned on.");
    }

    @Override
    void turnOff() {
        System.out.println("Refrigerator turned off.");
    }
}

public class Ap {
    public static void main(String[] args) {
        Appliance wm = new WashingMachine();
        Appliance fridge = new Refrigerator();

        wm.turnOn();
        fridge.turnOn();

        wm.turnOff();
        fridge.turnOff();
    }
}
