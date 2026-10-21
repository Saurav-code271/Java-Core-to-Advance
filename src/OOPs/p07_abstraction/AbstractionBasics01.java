package OOPs.p07_abstraction;
// 1. Abstract class and method

abstract class Animal01 {
    abstract void sound();
}
class Dog01 extends Animal01 {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
public class AbstractionBasics01 {
    public static void main(String[] args) {
        Animal01 a = new Dog01();
        a.sound();
    }
}

//Output:

//Dog barks
