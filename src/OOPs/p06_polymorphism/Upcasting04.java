package OOPs.p06_polymorphism;
// 1. Parent reference, child object

class Vehicle04 {
    void start() {
        System.out.println("Vehicle starts");
    }
}
class Car04 extends Vehicle04 {
    @Override
    void start() {
        System.out.println("Car starts");
    }
    void drive() {
        System.out.println("Car drives");
    }
}
public class Upcasting04 {
    public static void main(String[] args) {
        Vehicle04 v = new Car04();
        v.start();
        // v.drive(); // Compile-time error
    }
}

//Output:

//Car starts

// 2. Key point: Upcasting allows a parent reference to refer to a child object.
// Only members accessible through the reference's declared type can be called directly.