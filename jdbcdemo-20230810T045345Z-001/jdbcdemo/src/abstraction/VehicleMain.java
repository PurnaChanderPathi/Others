package abstraction;

import java.util.Scanner;

public class VehicleMain {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter car make: ");
	        String carMake = scanner.nextLine();
	        System.out.print("Enter car model: ");
	        String carModel = scanner.nextLine();

	        System.out.print("Enter motorcycle make: ");
	        String motorcycleMake = scanner.nextLine();
	        System.out.print("Enter motorcycle model: ");
	        String motorcycleModel = scanner.nextLine();

	        Car car = new Car(carMake, carModel);
	        Motorcycle motorcycle = new Motorcycle(motorcycleMake, motorcycleModel);

	        car.start();
	        car.stop();

	        motorcycle.start();
	        motorcycle.stop();
	    }
	}
