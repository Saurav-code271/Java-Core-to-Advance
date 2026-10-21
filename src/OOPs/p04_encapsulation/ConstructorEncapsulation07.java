package OOPs.p04_encapsulation;

class Employee07 {
    private String name;
    private double salary;
    Employee07(String name, double salary) {
        this.name = name;
        if (salary >= 0) this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
}
public class ConstructorEncapsulation07 {
    public static void main(String[] args) {
        Employee07 e = new Employee07("Saurav", 30000);
        System.out.println(e.getName());
        System.out.println(e.getSalary());
    }
}

// Output:

//Saurav
//30000.0

// 1. Key point: A constructor can initialize private fields and enforce basic validation.
