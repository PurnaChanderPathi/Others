package polymorphism;

public class Wizard extends GameCharacter {
    @Override
    public void attack() {
        System.out.println("The wizard casts a spell");
    }

    @Override
    public void defend() {
        System.out.println("The wizard creates a magical barrier to deflect attacks");
    }
}

