import java.util.Scanner;

public class ParseStrings {
    public static void main(String[] args) {

        // Initialize a Scanner object to obtain input and a String to hold user input.
        Scanner in = new Scanner(System.in);
        String userInput = "";

        // Loop until the user enters the character "q".
        while (true) {

            // Get input from user.
            System.out.println("Enter input string: ");
            userInput = in.nextLine();

            // Loop until user enters a valid String.
            while (!userInput.contains(",") && !userInput.equals("q")) {
                System.out.println("Error: No comma in string");
                System.out.println("Enter input string: ");
                userInput = in.nextLine();
            }
            
            // Break out of the loop if user enters "q".
            if (userInput.equals("q")) break;

            // Remove spaces from the input String.
            userInput = userInput.replaceAll(" ", "");

            // Extract the two words from the input String.
            String[] firstAndSecondWord = userInput.split(",");
            String firstWord = firstAndSecondWord[0];
            String secondWord = firstAndSecondWord[1];
            
            // Print the words obtained from the input String.
            System.out.printf("First word: %s\nSecond word: %s\n\n\n", firstWord, secondWord);
        }

        // Close the Scanner object.
        in.close();
    }
}
