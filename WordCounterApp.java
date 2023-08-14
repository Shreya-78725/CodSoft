import java.io.*;
import java.util.*;

public class WordCounterApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Word Counter App");
        System.out.println("1. Enter text");
        System.out.println("2. Provide a file");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        String inputText = "";

        switch (choice) {
            case 1:
                System.out.print("Enter text: ");
                inputText = scanner.nextLine();
                break;
            case 2:
                System.out.print("Enter file path: ");
                String filePath = scanner.nextLine();
                inputText = readFromFile(filePath);
                if (inputText == null) {
                    System.out.println("Error reading file.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        String[] words = inputText.split("[\\s\\p{Punct}]+");
        int totalWords = words.length;
        int uniqueWords = countUniqueWords(words);

        System.out.println("Total words: " + totalWords);
        System.out.println("Unique words: " + uniqueWords);
    }

    private static String readFromFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            return content.toString();
        } catch (IOException e) {
            return null;
        }
    }

    private static int countUniqueWords(String[] words) {
        Set<String> uniqueWords = new HashSet<>();
        for (String word : words) {
            uniqueWords.add(word.toLowerCase()); // Case-insensitive comparison
        }
        return uniqueWords.size();
    }
}
