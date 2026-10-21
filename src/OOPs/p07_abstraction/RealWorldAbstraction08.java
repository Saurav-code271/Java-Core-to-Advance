package OOPs.p07_abstraction;
// 1. Payment system

abstract class Payment08 {
    abstract void pay(double amount);
    void receipt(double amount) {
        System.out.println("Paid: " + amount);
    }
}
class UpiPayment08 extends Payment08 {
    @Override
    void pay(double amount) {
        System.out.println("Payment through UPI");
        receipt(amount);
    }
}
class CardPayment08 extends Payment08 {
    @Override
    void pay(double amount) {
        System.out.println("Payment through Card");
        receipt(amount);
    }
}
public class RealWorldAbstraction08 {
    public static void main(String[] args) {
        Payment08 p = new UpiPayment08();
        p.pay(500);
        p = new CardPayment08();
        p.pay(1000);
    }
}

// Output:

//Payment through UPI
//Paid: 500.0
//Payment through Card
//Paid: 1000.0
