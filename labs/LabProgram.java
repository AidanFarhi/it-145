import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
        try (Scanner scnr = new Scanner(System.in)) {
            // Initalize variables.
            String charsToExclude = ",!. ";
            int charCount = 0;
            // Get the input (this gets the entire line, including spaces).
            String userText = scnr.nextLine();
            // Iterate through the input String and count number of characters that
            // are not in the charsToExclude string.
            for (char ch : userText.toCharArray())
                if (charsToExclude.indexOf(ch) == -1) charCount++;
            // Print result.
            System.out.println(charCount);
        }
    }
}