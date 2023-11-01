package polymorphism;

public class Bird extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The bird chirps");
    }

    @Override
    public void move() {
        System.out.println("The bird flies");
    }
}