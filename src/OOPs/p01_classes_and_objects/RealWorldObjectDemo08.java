package OOPs.p01_classes_and_objects;
// 1. Represent a real-world object using a Java class.

class Car08 {
    String brand;
    int speed;

    void accelerate(int amount) {
        speed += amount;
    }
    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}
public class RealWorldObjectDemo08 {
    public static void main(String[] args) {
        Car08 car = new Car08();
        car.brand = "Toyota";
        car.speed = 0;

        car.accelerate(40);
        car.display();
    }
}

// Output:

//Brand: Toyota
//Speed: 40 km/h

// 2. Concept: A class models properties and behavior. Here, brand and speed are properties, while accelerate() is behavior.

