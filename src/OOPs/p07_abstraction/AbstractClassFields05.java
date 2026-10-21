package OOPs.p07_abstraction;
// 1. Fields in abstract classes

abstract class Employee05 {
    String name;
    Employee05(String name) {
        this.name = name;
    }
    abstract void work();
}
class Developer05 extends Employee05 {
    Developer05(String name) {
        super(name);
    }
    @Override
    void work() {
        System.out.println(name + " writes Java code");
    }
}
public class AbstractClassFields05 {
    public static void main(String[] args) {
        new Developer05("Saurav").work();
    }
}

//Output:

//Saurav writes Java code
