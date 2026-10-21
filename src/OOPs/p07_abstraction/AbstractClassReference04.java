package OOPs.p07_abstraction;
// 1. Abstract reference

abstract class Shape04 {
    abstract void draw();
}
class Circle04 extends Shape04 {
    @Override
    void draw() {
        System.out.println("Drawing circle");
    }
}
class Rectangle04 extends Shape04 {
    @Override
    void draw() {
        System.out.println("Drawing rectangle");
    }
}
public class AbstractClassReference04 {
    public static void main(String[] args) {
        Shape04 s = new Circle04();
        s.draw();
        s = new Rectangle04();
        s.draw();
    }
}

// Output:

//Drawing circle
//Drawing rectangle
