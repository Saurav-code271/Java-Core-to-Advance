package OOPs.p03_this_and_super;


class Employee10 {
    String role = "Employee";
    Employee10(String name) {
        System.out.println("Name: " + name);
    }
    void display() {
        System.out.println("Parent display");
    }
}
class Developer10 extends Employee10 {
    String role = "Developer";
    Developer10(String name) {
        super(name);
    }
    void show() {
        System.out.println("Current role: " + this.role);
        System.out.println("Parent role: " + super.role);
        super.display();
    }
}
public class ThisSuperInterviewDemo10 {
    public static void main(String[] args) {
        Developer10 d = new Developer10("Saurav");
        d.show();
    }
}

// Output:

// Name: Saurav
//Current role: Developer
//Parent role: Employee
//Parent display

// 2. Key point: This example combines parent constructor calls, this, super, and parent-method access.