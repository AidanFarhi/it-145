import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class CountingWords {
    public static void main(String[] args) throws IOException {
        
        Scanner scanner = new Scanner(System.in);
        FileInputStream fileInputStream = null;
        Scanner inFS = null;
        String userWord;
        int wordFreq = 0;
        String currWord;

        System.out.println("Opening: word_file.txt");
        fileInputStream = new FileInputStream("word_file.txt");
        inFS = new Scanner(fileInputStream);

        System.out.print("Enter the word you want to count: ");
        userWord = scanner.next();

        while (inFS.hasNext()) {
            currWord = inFS.next();
            if (currWord.equals(userWord)) {
                wordFreq++;
            }
        }

        System.out.printf("%s appears %d times.\n", userWord, wordFreq);
        
        fileInputStream.close();
        inFS.close();
        scanner.close();
    }
}
