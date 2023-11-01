package abstraction;

public class Car extends Vehicle {
    public Car(String make, String model) {
        super(make, model);
    }

    @Override
    public void start() {
        System.out.println("Starting the car...");
    }

    @Override
    public void stop() {
    	// TODO Auto-generated method stub
    	
    }
}

