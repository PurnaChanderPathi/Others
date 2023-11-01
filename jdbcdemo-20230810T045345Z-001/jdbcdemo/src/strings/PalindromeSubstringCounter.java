package strings;

import java.util.Scanner;

public class PalindromeSubstringCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int count = countPalindromeSubstrings(input);
        System.out.println("Number of palindrome substrings: " + count);
    }

    public static int countPalindromeSubstrings(String input) {
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                String substring = input.substring(i, j);

                if (isPalindrome(substring)) {
                    count++;
                }
            }
        }

        return count;
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
