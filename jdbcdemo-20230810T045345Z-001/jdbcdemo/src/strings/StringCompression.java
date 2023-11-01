package strings;

import java.util.Scanner;

public class StringCompression {

    public static String compressString(String input) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 0; i < input.length(); i++) {
            if (i + 1 < input.length() && input.charAt(i) == input.charAt(i + 1)) {
                count++;
            } else {
                compressed.append(input.charAt(i));
                compressed.append(count);
                count = 1;
            }
        }

        return compressed.length() < input.length() ? compressed.toString() : input;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");//aabcccccaaa
        String input = scanner.nextLine();
        scanner.close();

        String compressed = compressString(input);
        System.out.println("Compressed string: " + compressed);//a2b1c5a3
    }
}

