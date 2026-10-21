package OOPs.p08_interfaces;
// 1. Topics: Functional interfaces, private interface methods, interface polymorphism, interface vs abstract class,
// and a combined interview example.

// 6. Functional Interface
@FunctionalInterface
interface Greeting02 {
    void greet(String name);
}

// 7. Private Interface Method
interface Message02 {
    private void print() {
        System.out.println("Private helper method");
    }
    default void show() {
        print();
        System.out.println("Default method");
    }
}
class Notification02 implements Message02 {}

// 8. Interface Polymorphism
interface Shape02 {
    void draw();
}
class Circle02 implements Shape02 {
    public void draw() {
        System.out.println("Drawing circle");
    }
}
class Rectangle02 implements Shape02 {
    public void draw() {
        System.out.println("Drawing rectangle");
    }
}

// 9. Interface vs Abstract Class
abstract class Employee02 {
    abstract void work();
}
interface Payable02 {
    void pay();
}
class Developer02 extends Employee02 implements Payable02 {
    void work() {
        System.out.println("Developer writes code");
    }
    public void pay() {
        System.out.println("Salary paid");
    }
}

// 10. Combined Interview Example
interface Printable02 {
    void print();
}
interface Scannable02 {
    void scan();
}
class Machine02 implements Printable02, Scannable02 {
    public void print() {
        System.out.println("Printing document");
    }
    public void scan() {
        System.out.println("Scanning document");
    }
}

public class InterfacePartTwo02 {
    public static void main(String[] args) {
        Greeting02 g = name ->
                System.out.println("Hello, " + name);
        g.greet("Saurav");

        new Notification02().show();

        Shape02[] shapes = {
                new Circle02(), new Rectangle02()
        };
        for (Shape02 s : shapes) {
            s.draw();
        }

        Developer02 d = new Developer02();
        d.work();
        d.pay();

        Machine02 m = new Machine02();
        m.print();
        m.scan();
    }
}


// Output:

//Hello, Saurav
//Private helper method
//Default method
//Drawing circle
//Drawing rectangle
//Developer writes code
//Salary paid
//Printing document
//Scanning document

// 2. Important notes:

// 1. Functional interface: Has exactly one abstract method; it can be implemented using a lambda expression.
// 2. Private interface method: Used by other methods inside the same interface; it is not directly accessible from implementing classes.
// 3. Interface polymorphism: An interface reference can hold objects of different implementing classes.
// 4. Interface vs abstract class: A class can implement multiple interfaces but extend only one class.