package OOPs.p05_inheritance;

class Employee10 {
    String name;
    Employee10(String name) {
        this.name = name;
        System.out.println("Employee constructor");
    }
    void work() {
        System.out.println(name + " is working");
    }
}
class Developer10 extends Employee10 {
    Developer10(String name) {
        super(name);
        System.out.println("Developer constructor");
    }
    @Override
    void work() {
        System.out.println(name + " writes Java code");
    }
    void showDetails() {
        super.work();
        this.work();
    }
}
public class InheritanceInterviewDemo10 {
    public static void main(String[] args) {
        Developer10 d = new Developer10("Saurav");
        d.showDetails();
    }
}

//Output:

//Employee constructor
//Developer constructor
//Saurav is working
//Saurav writes Java code

// 1. Key point: This example combines inheritance, constructor chaining, method overriding, super, and this.
