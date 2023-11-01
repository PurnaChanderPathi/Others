package abstraction;

public class Motorcycle extends Vehicle {
    public Motorcycle(String make, String model) {
        super(make, model);
    }

    @Override
    public void start() {
        System.out.println("Starting the motorcycle...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the motorcycle...");
    }
}

