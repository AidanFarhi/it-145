import java.util.Scanner;

public class PhoneNumberDecoder {
   public static void main(String[] args) {
        try (Scanner scnr = new Scanner(System.in)) {
            
            String phoneStr;     // User input: Phone number string
            int i;               // Current index in phone number string
            char currChar;       // Current char in phone number string
        
            System.out.println("Enter phone number: ");
            phoneStr = scnr.next().toLowerCase();

            for (i = 0; i < phoneStr.length(); ++i) { // For each element
                currChar = phoneStr.charAt(i);
                if (((currChar >= '0') && (currChar <= '9')) || (currChar == '-')) {
                    System.out.print(currChar); // Print character as is
                } else if ((currChar >= 'a') && (currChar <= 'c')) {
                    System.out.print('2');
                } else if ((currChar >= 'd') && (currChar <= 'f')) {
                    System.out.print('3');
                } else if ((currChar >= 'g') && (currChar <= 'i')) {
                    System.out.print('4');
                } else if ((currChar >= 'j') && (currChar <= 'l')) {
                    System.out.print('5');
                } else if ((currChar >= 'm') && (currChar <= 'o')) {
                    System.out.print('6');
                } else if ((currChar >= 'p') && (currChar <= 's')) {
                    System.out.print('7');
                } else if ((currChar >= 't') && (currChar <= 'v')) {
                    System.out.print('8');
                } else if ((currChar >= 'w') && (currChar <= 'z')) {
                    System.out.print('9');
                } else {
                    System.out.print('?');
                }      
            }
            System.out.println();
        }
   }
}
