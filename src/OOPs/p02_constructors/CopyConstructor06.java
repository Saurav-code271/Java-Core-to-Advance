package OOPs.p02_constructors;
// 1. Java does not provide a special built-in copy constructor, but you can define one that accepts another object of the same class.

class Student06 {
    String name;
    int age;

    Student06(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Student06(Student06 other) {
        this.name = other.name;
        this.age = other.age;
    }

    void display() {
        System.out.println(name + " - " + age);
    }
}

public class CopyConstructor06 {
    public static void main(String[] args) {
        Student06 s1 = new Student06("Saurav", 22);
        Student06 s2 = new Student06(s1);

        s1.display();
        s2.display();
    }
}

//Output:

//Saurav - 22
//Saurav - 22

// 2. This copies the field values into a separate object. For reference-type fields,
// a simple copy like this copies the reference, not the referenced object's contents.

