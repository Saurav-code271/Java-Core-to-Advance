package OOPs.p07_abstraction;
// 1. Polymorphism with abstract classes

abstract class Animal06 {
    abstract void sound();
}
class Dog06 extends Animal06 {
    void sound() {
        System.out.println("Dog barks");
    }
}
class Cat06 extends Animal06 {
    void sound() {
        System.out.println("Cat meows");
    }
}
public class AbstractClassPolymorphism06 {
    public static void main(String[] args) {
        Animal06[] animals = {new Dog06(), new Cat06()};
        for (Animal06 a : animals) a.sound();
    }
}

//Output:

//Dog barks
//Cat meows