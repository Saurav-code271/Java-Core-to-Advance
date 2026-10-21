package OOPs.p06_polymorphism;

class Animal08 {}
class Dog08 extends Animal08 {}
class Parent08 {
    Animal08 getAnimal() {
        return new Animal08();
    }
}
class Child08 extends Parent08 {
    @Override
    Dog08 getAnimal() {
        return new Dog08();
    }
}
public class CovariantReturnType08 {
    public static void main(String[] args) {
        Child08 c = new Child08();
        System.out.println(c.getAnimal() instanceof Dog08);
    }
}

//Output:

//true

// 1. Key point: An overriding method may return a subtype of the original method's reference return type.
// This is called a covariant return type.