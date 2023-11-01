package polymorphism;


public class Knight extends GameCharacter {
    @Override
    public void attack() {
        System.out.println("The knight slashes with their sword");
    }

    @Override
    public void defend() {
        System.out.println("The knight raises their shield to block attacks");
    }
}


