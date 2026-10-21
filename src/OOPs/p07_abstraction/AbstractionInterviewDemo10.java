package OOPs.p07_abstraction;

abstract class Employee10 {
    String name;
    Employee10(String name) {
        this.name = name;
    }
    abstract void work();
    void showName() {
        System.out.println("Employee: " + name);
    }
}
class Developer10 extends Employee10 {
    Developer10(String name) {
        super(name);
    }
    @Override
    void work() {
        System.out.println(name + " develops software");
    }
}
class Tester10 extends Employee10 {
    Tester10(String name) {
        super(name);
    }
    @Override
    void work() {
        System.out.println(name + " tests software");
    }
}
public class AbstractionInterviewDemo10 {
    public static void main(String[] args) {
        Employee10[] team = {
                new Developer10("Saurav"),
                new Tester10("Rahul")
        };
        for (Employee10 e : team) {
            e.showName();
            e.work();
        }
    }
}

//Output:

//Employee: Saurav
//Saurav develops software
//Employee: Rahul
//Rahul tests software
