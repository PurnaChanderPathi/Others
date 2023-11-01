package abstraction;

import java.util.Scanner;

public class ShapeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Circle
        System.out.print("Enter the radius of the circle: ");
        double circleRadius = scanner.nextDouble();
        Circle circle = new Circle(circleRadius);

        // Rectangle
        System.out.print("Enter the width of the rectangle: ");
        double rectangleWidth = scanner.nextDouble();
        System.out.print("Enter the height of the rectangle: ");
        double rectangleHeight = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(rectangleWidth, rectangleHeight);

        // Triangle
        System.out.print("Enter the sides of the triangle (side1 side2 side3): ");
        double triangleSide1 = scanner.nextDouble();
        double triangleSide2 = scanner.nextDouble();
        double triangleSide3 = scanner.nextDouble();
        Triangle triangle = new Triangle(triangleSide1, triangleSide2, triangleSide3);

        System.out.println("\nCircle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

        System.out.println("\nRectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());

        System.out.println("\nTriangle Area: " + triangle.calculateArea());
        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());

        scanner.close();
    }
}
