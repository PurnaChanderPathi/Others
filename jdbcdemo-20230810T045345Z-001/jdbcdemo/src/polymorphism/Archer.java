package polymorphism;

public class Archer extends GameCharacter {
    @Override
    public void attack() {
        System.out.println("The archer fires an arrow");
    }

    @Override
    public void defend() {
        System.out.println("The archer dodges incoming attacks with their agility");
    }
}
