package interfaceAandInheritance;

import java.util.Scanner;

public class PaymentMain {
    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter payment type (credit card, PayPal, or cash): ");
	        String paymentType = scanner.nextLine();

	        Payment payment;

	        switch (paymentType) {
	            case "credit card":
	                payment = new CreditCardPayment();
	                break;
	            case "PayPal":
	                payment = new PayPalPayment();
	                break;
	            case "cash":
	                payment = new CashPayment();
	                break;
	            default:
	                System.out.println("Invalid payment type");
	                return;
	        }

	        System.out.print("Enter payment amount: ");
	        double amount = scanner.nextDouble();

	        payment.processPayment(amount);

	        System.out.print("Enter refund amount: ");
	        double refundAmount = scanner.nextDouble();

	        payment.refund(refundAmount);
	    }
	}

