package OOPs.p01_classes_and_objects;
// 1. Instance methods operate on an object's data.

class Calculator06 {
    int add(int a, int b) {
        return a + b;
    }

    int multiply(int a, int b) {
        return a * b;
    }
}

public class InstanceMethodsDemo06 {
    public static void main(String[] args) {
        Calculator06 calculator = new Calculator06();

        System.out.println(calculator.add(10, 20));
        System.out.println(calculator.multiply(5, 4));
    }
}

// OutPut:

//30
//20

// 2. Concept: You call these instance methods through an object reference, such as calculator.add(10, 20).
