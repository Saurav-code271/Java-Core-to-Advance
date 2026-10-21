package OOPs.p03_this_and_super;

class Employee02 {
    String name;
    int salary;
    Employee02(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    void display() {
        System.out.println(name + " earns " + salary);
    }
}
public class ThisForInstanceVariables02 {
    public static void main(String[] args) {
        new Employee02("Rahul", 30000).display();
    }
}

// Output:
//Rahul earns 30000
