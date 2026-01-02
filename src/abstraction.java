
abstract class Shape {

    // Abstract method
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

public class abstraction {
    public static void main(String[] args) {

        Shape s1 = new Circle();      // Parent reference
        Shape s2 = new Rectangle();

        s1.draw();
        s2.draw();
    }
}
