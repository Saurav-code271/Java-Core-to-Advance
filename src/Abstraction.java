// Abstraction.
// 1. Create animal abstract class.

//abstract class Animal {
//    abstract void sound();
//}
// class Dog extends Animal {
//    @Override
//    void sound() {
//        System.out.println("Dog barks");
//    }
//}
// class Cat extends Animal{
//    void sound() {
//        System.out.println("Cat meows");
//    }
//}
//public class Abstraction {
//    public static void main(String[] args) {
//        Animal d = new Dog();
//        d.sound();
//
//        Animal c = new Cat();
//        c.sound();
//    }
//}

// 2. abstract + concrete method.

//abstract class Employee {
//    abstract void work();
//
//    void company() {
//        System.out.println("Employee work in a company");
//    }
//}
//class Developer extends Employee {
//    void work() {
//        System.out.println("Employees are working");
//    }
//}
//public class Abstraction {
//    public static void main(String[] args) {
//        Employee e = new Developer();
//        e.company();
//        e.work();
//    }
//}

// 4. Constructor + abstraction.

import com.sun.security.jgss.GSSUtil;

//abstract class Bank {
//    abstract void interestRate();
//
//    Bank() {
//        System.out.println("Bank Constructor called");
//    }
//}
//class SBI extends Bank {
//    void interestRate(){
//        System.out.println("SBI Interest rate is 11% ");
//    }
//}
//class HDFC extends Bank{
//    void interestRate() {
//        System.out.println("HDFC rate is 12%");
//    }
//}
//public class Abstraction {
//    public static void main(String[] args) {
//        Bank b1 = new SBI();
//        b1.interestRate();
//
//        Bank b2 = new HDFC();
//        b2.interestRate();
//    }
//}

// 5. build a food delivery application.

abstract class Delivery {
    abstract void delivery();

    void tracker() {
        System.out.println("Order tracking");
    }
}
class BikeDelivery extends Delivery {
    @Override
    void delivery() {
        System.out.println("delivery is using bike");
    }
}
class CarDelivery extends Delivery {
    @Override
    void delivery() {
        System.out.println("delivery is using by car");
    }
}
class DroneDelivery extends Delivery {
    @Override
    void delivery() {
        System.out.println("delivery is using by drone");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Delivery b = new BikeDelivery();
        b.tracker();
        b.delivery();

        Delivery c = new CarDelivery();
        c.tracker();
        c.delivery();

        Delivery d = new DroneDelivery();
        d.tracker();
        d.delivery();
    }
}