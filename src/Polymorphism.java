// Polymorphism.
// Compile-time polymorphism....(Method Overloading).

// 1. Example of polymorphism.

//class Calculator {
//    int add(int a, int b) {
//        return a+b;
//    }
//    int add(int a, int b, int c) {
//        return a+b+c;
//    }
//}
//public class Polymorphism {
//    public static void main(String[] args) {
//        Calculator c= new Calculator();
//        System.out.println(c.add(10, 12));
//        System.out.println( c.add(12,12, 10));
//    }
//}

// 2. create a class with three constructor (constructor overloading).

import javax.xml.parsers.SAXParser;
import java.sql.Struct;

//class Employee {
//    String name;
//    double salary;
//
//    Employee() {
//    }
//    Employee(String name) {
//        this.name = name;
//    }
//    Employee(String name, double salary) {
//        this.name = name;
//        this.salary = salary;
//    }
//}
//public class Polymorphism {
//    public static void main(String[] args) {
//        Employee e = new Employee();
//        System.out.println(e.name);
//        System.out.println(e.salary);
//
//        Employee e1 = new Employee("Saurav K");
//        System.out.println(e1.name);
//        System.out.println(e1.salary);
//
//        Employee e2 = new Employee("Saurav KR", 120000);
//        System.out.println(e2.name);
//        System.out.println(e2.salary);
//    }
//}

// 3. real world polymorphism.

//class Payment{
//    void pay() {
//        System.out.println("Payment done by payment");
//    }
//}
//class CreditCard extends Payment{
//    void pay() {
//        System.out.println("Payment done by creditCard");
//    }
//}
//class UPI extends CreditCard{
//    void pay() {
//        System.out.println("Payment done by UPI");
//    }
//}
//class PayPal extends UPI {
//    void pay() {
//        System.out.println("Payment done by Paypal");
//    }
//}
//public class Polymorphism {
//    public static void main(String[] args) {
//        Payment p1 = new Payment();
//        Payment p2 = new CreditCard();
//        Payment p3= new UPI();
//        Payment p4 = new PayPal();
//
//        p1.pay();
//        p2.pay();
//        p3.pay();
//        p4.pay();
//    }
//}