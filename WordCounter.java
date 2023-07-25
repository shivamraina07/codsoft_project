import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        int wordCount = countWords(input);
        System.out.println("Number of words: " + wordCount);

        scanner.close();
    }

    public static int countWords(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        // Split the input by whitespace (space, tab, newline, etc.) to get individual
        // words
        String[] words = input.split("\\s+");

        // Count the number of non-empty words
        int count = 0;
        for (String word : words) {
            if (!word.trim().isEmpty()) {
                count++;
            }
        }

        return count;
    }
}