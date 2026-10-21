package OOPs.p12_inner_classes;

// 1. Local inner class
class Greeting02 {
    void sayHello() {
        class LocalGreeting {
            void display() {
                System.out.println("Hello from local inner class");
            }
        }

        LocalGreeting greeting = new LocalGreeting();
        greeting.display();
    }
}

// 2. Anonymous inner class
interface Animal02 {
    void sound();
}

class AnonymousDemo02 {
    void demonstrate() {
        Animal02 animal = new Animal02() {
            @Override
            public void sound() {
                System.out.println("Dog barks");
            }
        };

        animal.sound();
    }
}

// 3. Anonymous class extending a class
class Vehicle02 {
    void start() {
        System.out.println("Vehicle starts");
    }
}

// 4. Inner class with its own state
class University02 {
    private String name = "Sharda University";

    class Department {
        void display() {
            System.out.println("Department belongs to " + name);
        }
    }
}

public class InnerClassesPartTwo02 {
    public static void main(String[] args) {
        // Local inner class
        new Greeting02().sayHello();

        // Anonymous implementation of an interface
        new AnonymousDemo02().demonstrate();

        // Anonymous subclass
        Vehicle02 vehicle = new Vehicle02() {
            @Override
            void start() {
                System.out.println("Anonymous vehicle starts");
            }
        };
        vehicle.start();

        // Inner class accessing private outer field
        University02 university = new University02();
        University02.Department department = university.new Department();
        department.display();
    }
}

//Output:

//Hello from local inner class
//Dog barks
//Anonymous vehicle starts
//Department belongs to Sharda University

// 1. Remember: A member inner-class object is associated with an outer-class object.
// A static nested class does not require an outer-class instance.
