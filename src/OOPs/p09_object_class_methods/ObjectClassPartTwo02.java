package OOPs.p09_object_class_methods;

import java.util.Objects;

class Employee02 {
    int id;
    String name;

    Employee02(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // 1. Override equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Employee02)) return false;

        Employee02 other = (Employee02) obj;
        return id == other.id && Objects.equals(name, other.name);
    }

    // 2. Override hashCode() consistently with equals()
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    // 3. Override toString()
    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "'}";
    }
}

public class ObjectClassPartTwo02 {
    public static void main(String[] args) {
        Employee02 e1 = new Employee02(101, "Saurav");
        Employee02 e2 = new Employee02(101, "Saurav");
        Employee02 e3 = new Employee02(102, "Rahul");

        // 4. equals() compares logical content
        System.out.println(e1.equals(e2));
        System.out.println(e1.equals(e3));

        // 5. hashCode()
        System.out.println(e1.hashCode() == e2.hashCode());

        // 6. toString()
        System.out.println(e1);
    }
}

//Output:

//true
//false
//true
//Employee{id=101, name='Saurav'}

// 1. Key points for interviews:

// 1. toString() returns a string representation of an object.
// 2. getClass() returns the runtime class of an object.
// 3. == compares object references; equals() can compare logical content when overridden.
// 4. If two objects are equal according to equals(), they must have the same hashCode().
// 5. Two objects with the same hash code are not necessarily equal.
// 6. Object is the parent class of all Java classes.