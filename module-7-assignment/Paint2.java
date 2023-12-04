import java.util.Scanner;

/**
 * A program that calculates the area of a wall, how many gallons
 * of paint are required to paint the wall, and the number of cans
 * of paint needed to paint the wall.
 */
public class Paint2 {

    public static void main(String[] args) {

        // Initialize a Scanner object to obtain input and variables
        // to store the dimensions of the wall.
        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        double cansNeeded;

        // Constants representing the surface area a gallon of paint can 
        // cover and the amount of gallons a can of pain can hold.
        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;

        // Prompt user to input wall's height.
        System.out.println("Enter wall height (feet): ");
        wallHeight = scnr.nextDouble();

        // Prompt user to input wall's width.
        System.out.println("Enter wall width (feet): ");
        wallWidth = scnr.nextDouble();

        // Calculate and output wall area.
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + wallArea + " square feet");

        // Calculate and output the amount of paint in gallons needed to paint the wall.
        gallonsPaintNeeded = wallArea / squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");

        // Calculate and output the number of paint cans needed 
        // to paint the wall, rounded up to nearest integer.
        cansNeeded = Math.ceil(gallonsPaintNeeded / gallonsPerCan);
        System.out.printf("Cans needed: %.2f can(s)\n", cansNeeded);

        // Close the Scanner object.
        scnr.close();
    }
}
