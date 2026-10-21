package OOPs.p06_polymorphism;

class Animal06 {
    void sound() {
        System.out.println("Animal sound");
    }
}
class Dog06 extends Animal06 {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
class Cat06 extends Animal06 {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}
public class PolymorphicArray06 {
    public static void main(String[] args) {
        Animal06[] animals = {new Dog06(), new Cat06(), new Animal06()};
        for (Animal06 a : animals) {
            a.sound();
        }
    }
}

//Output:

//Dog barks
//Cat meows
//Animal sound

// 1. Key point: A parent-type array can store objects of different child classes.
// Each overridden method executes according to the actual object.
