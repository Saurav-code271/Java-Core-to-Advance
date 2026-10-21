package OOPs.p06_polymorphism;
// 1. Runtime method selection

class Shape05 {
    void draw() {
        System.out.println("Drawing shape");
    }
}
class Circle05 extends Shape05 {
    @Override
    void draw() {
        System.out.println("Drawing circle");
    }
}
class Rectangle05 extends Shape05 {
    @Override
    void draw() {
        System.out.println("Drawing rectangle");
    }
}
public class DynamicMethodDispatch05 {
    public static void main(String[] args) {
        Shape05 s;
        s = new Circle05();
        s.draw();
        s = new Rectangle05();
        s.draw();
    }
}

//Output:

//Drawing circle
//Drawing rectangle

// 2. Key point: The overridden instance method is selected according to the actual object at runtime.
