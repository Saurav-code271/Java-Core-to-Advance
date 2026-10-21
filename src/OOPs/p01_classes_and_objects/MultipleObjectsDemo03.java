package OOPs.p01_classes_and_objects;
// 1. Each object has its own instance variables.

class Employee03 {
    String name;
    int id;

    void display() {
        System.out.println(id + " - " + name);
    }
}

public class MultipleObjectsDemo03 {
    public static void main(String[] args) {
        Employee03 e1 = new Employee03();
        e1.name = "Aman";
        e1.id = 101;

        Employee03 e2 = new Employee03();
        e2.name = "Rahul";
        e2.id = 102;

        e1.display();
        e2.display();
    }
}

// Output:

// 101 - Aman
//102 - Rahul

// 2. Concept: Changing e1.name doesn't change e2.name, because these are separate objects.

