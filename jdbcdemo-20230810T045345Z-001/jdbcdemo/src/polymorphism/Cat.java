package polymorphism;

public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows");
    }

    @Override
    public void move() {
        System.out.println("The cat walks");
    }
}