package interfaceAandInheritance;

public class PayPalPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunding PayPal payment of $" + amount);
    }
}
