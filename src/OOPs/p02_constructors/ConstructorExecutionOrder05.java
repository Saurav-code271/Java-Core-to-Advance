package OOPs.p02_constructors;
// 1. When an object is created, Java initializes its fields and runs its constructor.
// This example demonstrates constructor chaining and the order in which constructors run.

class Demo05 {
    Demo05() {
        this(10);
        System.out.println("No-argument constructor");
    }

    Demo05(int value) {
        System.out.println("Parameterized constructor: " + value);
    }
}

public class ConstructorExecutionOrder05 {
    public static void main(String[] args) {
        new Demo05();
    }
}

// Output:

//Parameterized constructor: 10
//No-argument constructor

// 2.  The parameterized constructor runs first because the no-argument constructor calls it using this(10).