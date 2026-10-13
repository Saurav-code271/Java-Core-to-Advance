// Inheritance.
// 1. create a simple inheritance relationship.

//class Animal {
//    void eat() {
//        System.out.println("Animal eat");
//    }
//}
//class Dog extends Animal{
//    void bark() {
//        System.out.println("Dog barks");
//    }
//}
//public class Inheritance {
//    public static void main(String[] args) {
//        Dog d = new Dog();
//        d.eat();
//        d.bark();
//    }
//}

// 2. create a employee and manager inheritance.

//class Employee{
//    String name;
//    double salary;
//    Employee(String name, double salary) {
//        this.name = name;
//        this.salary = salary;
//    }
//    void work() {
//        System.out.println("Employee works");
//    }
//}
//class Manager extends Employee{
//    Manager(String name, double salary) {
//        super(name, salary);
//    }
//    void conductMeeting() {
//        System.out.println("meeting happens");
//    }
//}
//public class Inheritance {
//    public static void main(String[] args) {
//        Manager m = new Manager("Saurav", 120000.00);
//        m.work();
//        System.out.println(m.name);
//        System.out.println(m.salary);
//        m.conductMeeting();
//    }
//}

// 3. Challenge — Build a Real Example
//Create this hierarchy:
// Employee
// /      \
//Developer  Manager

//Employee -> id, name, salary, work()

//Developer -> programmingLanguage, writeCode()
//Manager -> teamSize, conductMeeting()

//Then create: ->
//Developer d = new Developer(...);
//Manager m = new Manager(...);
//and demonstrate that both can use the inherited work() method while also having their own specialized methods.
