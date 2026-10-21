package OOPs.p02_constructors;
// 1. A constructor initializes an object when it is created.

class Student01 {
    String name;
    int age;

    // No-argument constructor
    Student01() {
        name = "Saurav";
        age = 22;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
public class ConstructorBasics01 {
    public static void main(String[] args) {
        Student01 s1 = new Student01();
        s1.display();
    }
}

// Output:

//Name: Saurav
//Age: 22

// 2. Understand this code

// 1. Student01() is a constructor: it has the same name as its class and no return type.
// 2. new Student01() creates the object and invokes the constructor.
// 3. The constructor initializes name and age.
// 4. display() is an ordinary method, not a constructor.

// 3. Interview point: If you don't declare any constructor, Java provides a default constructor.
// But if you declare a constructor yourself, Java does not automatically provide that default constructor.

