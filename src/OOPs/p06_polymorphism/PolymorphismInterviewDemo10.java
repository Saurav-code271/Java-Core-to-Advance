package OOPs.p06_polymorphism;

class Employee10 {
    void work() {
        System.out.println("Employee works");
    }
}
class Developer10 extends Employee10 {
    @Override
    void work() {
        System.out.println("Developer writes code");
    }
    void code() {
        System.out.println("Java development");
    }
}
class Tester10 extends Employee10 {
    @Override
    void work() {
        System.out.println("Tester tests software");
    }
}
public class PolymorphismInterviewDemo10 {
    public static void main(String[] args) {
        Employee10[] team = {new Developer10(), new Tester10()};
        for (Employee10 e : team) {
            e.work();
        }
        Employee10 e = new Developer10();
        if (e instanceof Developer10 d) {
            d.code();
        }
    }
}

//Output:

//Developer writes code
//Tester tests software
//Java development

// 1. Key point: This combines method overriding, runtime polymorphism, a polymorphic array, and instanceof.
