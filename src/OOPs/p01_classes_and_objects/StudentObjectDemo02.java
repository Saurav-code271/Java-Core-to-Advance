package OOPs.p01_classes_and_objects;
// 1. Learn how to create an object and access its fields and methods.

class Student02 {
    String name = "Saurav";
    int age = 22;
    String course = "B.Tech CSE";

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

public class StudentObjectDemo02 {
    public static void main(String[] args) {
        Student02 student = new Student02();
        student.displayDetails();
    }
}

// Output:

//Name: Saurav
//Age: 22
//Course: B.Tech CSE

// 2. Concept: student is a reference variable that refers to the created object.
