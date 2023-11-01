package polymorphism;

import java.util.Scanner;
public class AnimalMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter animal type (dog, cat, or bird): ");
        String animalType = scanner.nextLine();

        Animal animal;

        switch (animalType) {
            case "dog":
                animal = new Dog();
                break;
            case "cat":
                animal = new Cat();
                break;
            case "bird":
                animal = new Bird();
                break;
            default:
                System.out.println("Invalid animal type");
                return;
        }

        animal.makeSound();
        animal.move();
    }
}
