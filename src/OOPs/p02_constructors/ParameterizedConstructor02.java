package OOPs.p02_constructors;
// 1. A parameterized constructor lets you provide values when creating an object.

class Student02 {
    String name;
    int age;

    Student02(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void display() {
        System.out.println(name + " - " + age);
    }
}
public class ParameterizedConstructor02 {
    public static void main(String[] args) {
        Student02 s1 = new Student02("Aman", 21);
        Student02 s2 = new Student02("Rahul", 22);

        s1.display();
        s2.display();
    }
}

//Output:

//Aman - 21
//Rahul - 22

// 2. Key concept: this.name refers to the object's field, while name refers to the constructor parameter.

