package OOPs.p08_interfaces;
// 1. Topics: Interface basics, multiple interfaces, interface inheritance, default methods, and static methods.

// 1. Interface Basics
interface Animal01 {
    void sound();
}
class Dog01 implements Animal01 {
    public void sound() {
        System.out.println("Dog barks");
    }
}

// 2. Multiple Interfaces
interface Camera01 {
    void takePhoto();
}
interface Music01 {
    void playMusic();
}
class Phone01 implements Camera01, Music01 {
    public void takePhoto() {
        System.out.println("Photo captured");
    }
    public void playMusic() {
        System.out.println("Music playing");
    }
}

// 3. Interface Inheritance
interface Living01 {
    void eat();
}
interface Pet01 extends Living01 {
    void play();
}
class PetDog01 implements Pet01 {
    public void eat() {
        System.out.println("Dog eats");
    }
    public void play() {
        System.out.println("Dog plays");
    }
}

// 4. Default Method
interface Vehicle01 {
    void start();
    default void stop() {
        System.out.println("Vehicle stopped");
    }
}
class Car01 implements Vehicle01 {
    public void start() {
        System.out.println("Car started");
    }
}

// 5. Static Method
interface Calculator01 {
    static int square(int n) {
        return n * n;
    }
}

public class InterfacePartOne01 {
    public static void main(String[] args) {
        new Dog01().sound();

        Phone01 p = new Phone01();
        p.takePhoto();
        p.playMusic();

        PetDog01 d = new PetDog01();
        d.eat();
        d.play();

        Car01 c = new Car01();
        c.start();
        c.stop();

        System.out.println(Calculator01.square(5));
    }
}

//Output:

//Dog barks
//Photo captured
//Music playing
//Dog eats
//Dog plays
//Car started
//Vehicle stopped
//25