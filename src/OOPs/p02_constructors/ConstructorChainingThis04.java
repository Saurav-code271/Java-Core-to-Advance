package OOPs.p02_constructors;
// 1. Use this() to call another constructor in the same class.

class Employee04 {
    String name;
    int id;

    Employee04() {
        this("Not Assigned", 0);
    }

    Employee04(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void display() {
        System.out.println(id + " - " + name);
    }
}

public class ConstructorChainingThis04 {
    public static void main(String[] args) {
        Employee04 e1 = new Employee04();
        Employee04 e2 = new Employee04("Aman", 101);

        e1.display();
        e2.display();
    }
}

// Output:

//0 - Not Assigned
//101 - Aman

// 2. Important: A this() constructor call must be the first statement in the constructor.
// It cannot be used together with super() in the same constructor.
