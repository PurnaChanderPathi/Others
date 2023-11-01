package inheritanceAndPolymorphism;

import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter book title: ");
        String bookTitle = scanner.nextLine();
        System.out.print("Enter book author: ");
        String bookAuthor = scanner.nextLine();
        System.out.print("Enter book identifier: ");
        int bookIdentifier = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter DVD title: ");
        String dvdTitle = scanner.nextLine();
        System.out.print("Enter DVD director: ");
        String dvdDirector = scanner.nextLine();
        System.out.print("Enter DVD identifier: ");
        int dvdIdentifier = scanner.nextInt();

        Book book = new Book(bookTitle, bookAuthor, bookIdentifier);
        DVD dvd = new DVD(dvdTitle, dvdDirector, dvdIdentifier);

        System.out.println("\nBook Information:");
        book.displayInfo();

        System.out.println("\nDVD Information:");
        dvd.displayInfo();

        scanner.close();
    }
}
