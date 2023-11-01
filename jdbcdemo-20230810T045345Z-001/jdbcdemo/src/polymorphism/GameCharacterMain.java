package polymorphism;

import java.util.Scanner;

public class GameCharacterMain {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter character type (knight, wizard, or archer): ");
	        String characterType = scanner.nextLine();

	        GameCharacter character;

	        switch (characterType) {
	            case "knight":
	                character = new Knight();
	                break;
	            case "wizard":
	                character = new Wizard();
	                break;
	            case "archer":
	                character = new Archer();
	                break;
	            default:
	                System.out.println("Invalid character type");
	                return;
	        }

	        character.attack();
	        character.defend();
	    }
	}
