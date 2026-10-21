package OOPs.p11_static_and_final;
// 1. Topics covered:

// 1. static variables and methods
// 2. Static blocks and initialization order
// 3. Static methods vs instance methods
// 4. final variables, methods and classes
// 5. static final constants
// 6. Common interview questions


// 1. Static variable: shared by all objects
class Student01 {
    int rollNo;
    String name;
    static String college = "Sharda University";

    Student01(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }
}

// 2. Static method
class Calculator01 {
    static int add(int a, int b) {
        return a + b;
    }
}

// 3. Static block and initialization order
class Initialization01 {
    static int value;

    static {
        value = 100;
        System.out.println("Static block executed");
    }

    Initialization01() {
        System.out.println("Constructor executed");
    }
}

// 4. Static vs instance members
class Counter01 {
    static int totalObjects = 0;
    int objectNumber;

    Counter01() {
        totalObjects++;
        objectNumber = totalObjects;
    }
}

public class StaticFinalPartOne01 {
    public static void main(String[] args) {
        Student01 s1 = new Student01(1, "Saurav");
        Student01 s2 = new Student01(2, "Rahul");
        s1.display();
        s2.display();

        System.out.println(Calculator01.add(10, 20));

        Initialization01 obj = new Initialization01();
        System.out.println(Initialization01.value);

        Counter01 c1 = new Counter01();
        Counter01 c2 = new Counter01();
        System.out.println(c1.objectNumber);
        System.out.println(c2.objectNumber);
        System.out.println(Counter01.totalObjects);
    }
}

// Output:

//1 Saurav Sharda University
//2 Rahul Sharda University
//30
//Static block executed
//Constructor executed
//100
//1
//2
//2