package assignment2;
class Ssape {
    public void draw() {
        System.out.println("Drawing a shape");
    }

    public void draw(String SsapeType) {
        System.out.println("Drawing a " + SsapeType);
    }

    public void draw(int sides) {
        System.out.println("Drawing a Ssape with " + sides + " sides");
    }

    public void draw(int sides, String color) {
        System.out.println("Drawing a " + color + " Ssape with " + sides + " sides");
    }
}

public class Qu14 {
    public static void main(String[] args) {
        Ssape Ssape = new Ssape();

        Ssape.draw();
        Ssape.draw("Circle");
        Ssape.draw(4);
        Ssape.draw(6, "red");
    }
}
