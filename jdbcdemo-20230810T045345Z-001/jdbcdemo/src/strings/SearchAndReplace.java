package strings;

import java.util.Scanner;

public class SearchAndReplace {

    public static String replaceWord(String sentence, String targetWord, String replacement) {
        String lowerSentence = sentence.toLowerCase();
        String lowerTargetWord = targetWord.toLowerCase();

        if (!lowerSentence.contains(lowerTargetWord)) {
            return sentence;
        }

        StringBuilder result = new StringBuilder();
        int lastIndex = 0;
        int index = lowerSentence.indexOf(lowerTargetWord);

        while (index != -1) {
            result.append(sentence.substring(lastIndex, index));
            result.append(replacement);
            lastIndex = index + targetWord.length();
            index = lowerSentence.indexOf(lowerTargetWord, lastIndex);
        }

        result.append(sentence.substring(lastIndex));

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: "); 
        String sentence = scanner.nextLine();
        
        System.out.print("Enter the word to replace: ");
        String targetWord = scanner.nextLine();
        
        System.out.print("Enter the replacement word: ");
        String replacement = scanner.nextLine();
        
        scanner.close();

        String replacedSentence = replaceWord(sentence, targetWord, replacement);
        System.out.println("Replaced sentence: " + replacedSentence);
    }
}
