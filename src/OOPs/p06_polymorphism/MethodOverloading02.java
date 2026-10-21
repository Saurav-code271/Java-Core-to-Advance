package OOPs.p06_polymorphism;
// 1. Compile-time polymorphism

class Calculator02 {
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
    double add(double a, double b) {
        return a + b;
    }
}
public class MethodOverloading02 {
    public static void main(String[] args) {
        Calculator02 c = new Calculator02();
        System.out.println(c.add(10, 20));
        System.out.println(c.add(10, 20, 30));
        System.out.println(c.add(2.5, 3.5));
    }
}

//Output:

//30
//60
//6.0
