package OOPs.p07_abstraction;
// 1. Constructor in an abstract class

abstract class Person03 {
    Person03() {
        System.out.println("Person constructor");
    }
}
class Student03 extends Person03 {
    Student03() {
        System.out.println("Student constructor");
    }
}
public class AbstractClassConstructor03 {
    public static void main(String[] args) {
        new Student03();
    }
}

//Output:

//Person constructor
//Student constructor

