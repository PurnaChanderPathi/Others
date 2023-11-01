package strings;

import java.util.Scanner;

public class ShortestSubstring {

    public static String findShortestSubstring(String s, String pattern) {
        int[] patternFreq = new int[128];
        int[] windowFreq = new int[128];
        
        for (char c : pattern.toCharArray()) {
            patternFreq[c]++;
        }
        
        int left = 0;
        int right = 0;
        int minLength = Integer.MAX_VALUE;
        int start = 0;
        int count = pattern.length();
        
        while (right < s.length()) {
            if (patternFreq[s.charAt(right)] > 0) {
                windowFreq[s.charAt(right)]++;
                if (windowFreq[s.charAt(right)] <= patternFreq[s.charAt(right)]) {
                    count--;
                }
            }
            
            while (count == 0) {
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    start = left;
                }
                
                if (patternFreq[s.charAt(left)] > 0) {
                    windowFreq[s.charAt(left)]--;
                    if (windowFreq[s.charAt(left)] < patternFreq[s.charAt(left)]) {
                        count++;
                    }
                }
                
                left++;
            }
            
            right++;
        }
        
        return minLength == Integer.MAX_VALUE ? "" : s.substring(start, start + minLength);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the input string: ");
        String input = scanner.nextLine();
        
        System.out.print("Enter the pattern: ");
        String pattern = scanner.nextLine();
        
        scanner.close();

        String shortestSubstring = findShortestSubstring(input, pattern);
        System.out.println("Shortest substring: " + shortestSubstring);
    }
}
