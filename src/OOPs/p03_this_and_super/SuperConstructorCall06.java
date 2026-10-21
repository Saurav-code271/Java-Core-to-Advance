package OOPs.p03_this_and_super;

class Person06 {
    Person06(String name) {
        System.out.println("Parent: " + name);
    }
}
class Student06 extends Person06 {
    Student06(String name) {
        super(name);
        System.out.println("Child: " + name);
    }
}
public class SuperConstructorCall06 {
    public static void main(String[] args) {
        new Student06("Saurav");
    }
}

// Output:

//Parent: Saurav
//Child: Saurav

// 1. Key point: super(name) calls the parent constructor and must be the first statement in the child constructor.
