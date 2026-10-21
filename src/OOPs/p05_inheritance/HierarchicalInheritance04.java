package OOPs.p05_inheritance;

class Vehicle04 {
    void start() {
        System.out.println("Vehicle starts");
    }
}
class Car04 extends Vehicle04 {
    void drive() {
        System.out.println("Car drives");
    }
}
class Bike04 extends Vehicle04 {
    void ride() {
        System.out.println("Bike rides");
    }
}
public class HierarchicalInheritance04 {
    public static void main(String[] args) {
        Car04 c = new Car04();
        c.start();
        c.drive();

        Bike04 b = new Bike04();
        b.start();
        b.ride();
    }
}

//Output:

//Vehicle starts
//Car drives
//Vehicle starts
//Bike rides