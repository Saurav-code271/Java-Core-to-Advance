
// Encapsulation.

// 1. Create a BankAccount class.
//Requirements
//accountNumber → private
//balance → private
//Create getters and setters
//Create a method deposit(double amount)
//Try to prevent negative deposits.

//public class BankAccount {
//    private final long accountNumber;
//    private double balance;
//
//    public BankAccount(long accountNumber) {
//        this.accountNumber = accountNumber;
//    }
//    public long getAccountNumber() {
//        return accountNumber;
//    }
//    public double getBalance() {
//        return balance;
//    }
//    public void deposit(double amount) {
//        if (amount <= 0) {
//            System.out.println("Invalid action");
//        } else {
//            balance += amount;
//            System.out.println("New balance is = "+ balance);
//        }
//    }
//    public void withdraw(double amount) {
//        if (amount <= 0) {
//            System.out.println("Invalid Transection");
//        } else if (amount > balance) {
//            System.out.println("Insufficient balance");
//        } else{
//            balance -= amount;
//            System.out.println("withdrawn " + amount);
//        }
//    }
//
//    public static void main(String[] args) {
//        BankAccount ac = new BankAccount(6316411);
//        ac.deposit(80000.00);
//        System.out.println("Account number is = " + ac.getAccountNumber());
//        System.out.println("Balance is " + ac.getBalance());
//
//        ac.withdraw(75000.00);
//        System.out.println("updated balance is " + ac.getBalance());
//    }
//}

// 2. create a fully encapsulated employee class with ->
//  Rules:
//        id cannot be changed after object creation.
//        name cannot be null or empty.
//        salary cannot be negative.
//        Salary should be accessible through a getter.
//        Salary should be changed through a method called increaseSalary(double percentage).
//        Do not create setSalary().

import java.util.Objects;

//public class Employee{
//   private final int id;
//   private String name;
//   private double salary;
//
//    private Employee(int id, String name, double salary) {
//       this.id = id;
//       if (name != null && !name.trim().isEmpty()) {
//           this.name = name;
//       }
//       if (salary >= 0) {
//           this.salary = salary;
//       } else{
//           System.out.println("Invalid salary");
//       }
//    }
//    public void increaseSalary(double percentage) {
//        if (percentage > 0) {
//      salary = salary+(salary*percentage/100);
//       } else {
//            System.out.println("Invalid percentage " + percentage);
//        }
//    }
//    public int getId() {
//        return id;
//    }
//    public double getSalary() {
//        return salary;
//    }
//    public String getName() {
//        return name;
//    }
//
//    public static void main(String[] args) {
//        Employee em = new Employee(101, "Saurav Kumar", 60000.00);
//        System.out.println("The id is = " + em.getId());
//        System.out.println("Name is = " + em.getName());
//        System.out.println("salary is = " + em.getSalary());
//        em.increaseSalary(40);
//        System.out.println("updated salary is = " + em.getSalary());
//    }
//}