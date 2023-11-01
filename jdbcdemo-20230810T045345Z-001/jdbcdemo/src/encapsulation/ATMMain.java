package encapsulation;

import java.util.Scanner;

	public class ATMMain {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter initial balance: ");
	        double initialBalance = scanner.nextDouble();

	        ATM atm = new ATM(initialBalance);

	        while (true) {
	            System.out.println("\nATM Menu:");
	            System.out.println("1. Deposit");
	            System.out.println("2. Withdraw");
	            System.out.println("3. Check Balance");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            
	            int choice = scanner.nextInt();
	            
	            switch (choice) {
	                case 1:
	                    System.out.print("Enter deposit amount: ");
	                    double depositAmount = scanner.nextDouble();
	                    atm.deposit(depositAmount);
	                    break;
	                case 2:
	                    System.out.print("Enter withdrawal amount: ");
	                    double withdrawalAmount = scanner.nextDouble();
	                    atm.withdraw(withdrawalAmount);
	                    break;
	                case 3:
	                    System.out.println("Balance: $" + atm.checkBalance());
	                    break;
	                case 4:
	                    System.out.println("Thank you for using the ATM!");
	                    scanner.close();
	                    return;
	                default:
	                    System.out.println("Invalid choice. Please select a valid option.");
	            }
	        }
	    }
	}
