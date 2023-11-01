package strings;

import java.util.Scanner;

public class CustomStringSort {

    public static String customSort(String input) {
        StringBuilder uppercase = new StringBuilder();
        StringBuilder lowercase = new StringBuilder();
        StringBuilder specialChars = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                uppercase.append(c);
            } else if (Character.isLowerCase(c)) {
                lowercase.append(c);
            } else {
                specialChars.append(c);
            }
        }

        return uppercase.toString() + lowercase.toString() + specialChars.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        String sortedString = customSort(input);
        System.out.println("Sorted string: " + sortedString);
    }
}
