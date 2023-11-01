package interfaceAandInheritance;

public class CashPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Accepting cash payment of $" + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunding cash payment of $" + amount);
    }
}