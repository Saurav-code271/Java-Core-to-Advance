package OOPs.p07_abstraction;
// 1. Abstract and concrete methods

abstract class Vehicle02 {
    abstract void start();
    void stop() {
        System.out.println("Vehicle stopped");
    }
}
class Car02 extends Vehicle02 {
    @Override
    void start() {
        System.out.println("Car started");
    }
}
public class AbstractClassWithConcreteMethod02 {
    public static void main(String[] args) {
        Car02 c = new Car02();
        c.start();
        c.stop();
    }
}

// Output:

// Car started
//Vehicle stopped

