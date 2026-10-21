package OOPs.p10_association_aggregation_composition;
// 1. Topics covered:

// 1. Association
// 2. One-to-one and one-to-many relationships
// 3. Aggregation — weak ownership
// 4. Composition — strong ownership
// 5. Real-world examples and interview differences


import java.util.ArrayList;
import java.util.List;

// 1. Association: Teacher and Student can exist independently
class Teacher01 {
    String name;

    Teacher01(String name) {
        this.name = name;
    }

    void teach(Student01 student) {
        System.out.println(name + " teaches " + student.name);
    }
}

class Student01 {
    String name;

    Student01(String name) {
        this.name = name;
    }
}

// 2. One-to-one association: Person and Passport
class Passport01 {
    String number;

    Passport01(String number) {
        this.number = number;
    }
}

class Person01 {
    String name;
    Passport01 passport;

    Person01(String name, Passport01 passport) {
        this.name = name;
        this.passport = passport;
    }
}

// 3. One-to-many association: Department and Employees
class Employee01 {
    String name;

    Employee01(String name) {
        this.name = name;
    }
}

class Department01 {
    String name;
    List<Employee01> employees = new ArrayList<>();

    Department01(String name) {
        this.name = name;
    }

    void addEmployee(Employee01 employee) {
        employees.add(employee);
    }

    void showEmployees() {
        System.out.println("Department: " + name);
        for (Employee01 e : employees) {
            System.out.println(e.name);
        }
    }
}

public class RelationshipPartOne01 {
    public static void main(String[] args) {
        Teacher01 teacher = new Teacher01("Amit");
        Student01 student = new Student01("Saurav");
        teacher.teach(student);

        Person01 person =
                new Person01("Rahul", new Passport01("P12345"));
        System.out.println(person.name + " - " + person.passport.number);

        Department01 department = new Department01("IT");
        department.addEmployee(new Employee01("Neha"));
        department.addEmployee(new Employee01("Karan"));
        department.showEmployees();
    }
}

//Output:

//Amit teaches Saurav
//Rahul - P12345
//Department: IT
//Neha
//Karan