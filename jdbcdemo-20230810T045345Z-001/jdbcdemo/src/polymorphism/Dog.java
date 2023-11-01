package polymorphism;

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }

    @Override
    public void move() {
        System.out.println("The dog runs");
    }
}
