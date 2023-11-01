package interfaceAandInheritance;

import java.util.Scanner;

	public class DrawableMain {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter number of shapes to draw: ");
	        int numShapes = scanner.nextInt();

	        Drawable[] shapes = new Drawable[numShapes];

	        for (int i = 0; i < numShapes; i++) {
	            System.out.print("Enter shape type (circle, rectangle, or triangle): ");
	            String shapeType = scanner.next();

	            switch (shapeType) {
	                case "circle":
	                    shapes[i] = new Circle();
	                    break;
	                case "rectangle":
	                    shapes[i] = new Rectangle();
	                    break;
	                case "triangle":
	                    shapes[i] = new Triangle();
	                    break;
	                default:
	                    System.out.println("Invalid shape type");
	                    i--;
	                    break;
	            }
	        }

	        for (Drawable shape : shapes) {
	            shape.draw();
	        }
	    }
	}
