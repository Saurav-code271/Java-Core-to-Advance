package OOPs.p06_polymorphism;

class Animal01 {
    void sound() {
        System.out.println("Animal makes sound");
    }
}
class Dog01 extends Animal01 {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
public class PolymorphismBasics01 {
    public static void main(String[] args) {
        Animal01 a = new Animal01();
        Dog01 d = new Dog01();
        a.sound();
        d.sound();
    }
}

//Output:

//Animal makes sound
//Dog barks