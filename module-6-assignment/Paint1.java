import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This program takes in the dimensions of a wall and outputs the required
 * amount of paint in gallons to paint the wall.
 */
public class Paint1 {

    public static void main(String[] args) {

        // Initialize a Scanner object to obtain input and variables to hold
        // height, width, area, and gallons of paint needed.
        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        
        // A constant for use in calculating the amount of paint needed.
        final double squareFeetPerGallons = 350.0;
        
        // Loop until a valid height is entered.
        do {
            try {
                System.out.println("Enter wall height (feet): ");
                wallHeight = scnr.nextDouble();
            } catch (InputMismatchException e) {
                scnr.nextLine();
            };
        } while (wallHeight <= 0.0);

        // Loop until a valid width is entered.
        do {
            try {
                System.out.println("Enter wall width (feet): ");
                wallWidth = scnr.nextDouble();
            } catch (InputMismatchException e) {
                scnr.nextLine();
            };
        } while (wallWidth <= 0.0);
        
        // Calculate and output wall area.
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + wallArea + " square feet");

        // Calculate and output the amount of paint (in gallons) needed to paint the wall.
        gallonsPaintNeeded = wallArea / squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");

        // Close the Scanner object.
        scnr.close();
    }
}
