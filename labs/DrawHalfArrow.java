import java.util.Scanner; 

public class DrawHalfArrow {

    /**
     * Gets dimensions for a half arrow from input.
     * 
     * @param scnr a Scanner object
     * @return     an array of ints that contains the dimensions
     */
    public static int[] getArrowDimensions(Scanner scnr) {
        int[] dimensions = new int[3];
        System.out.println("Enter arrow base height:");
        dimensions[0] = scnr.nextInt();
        System.out.println("Enter arrow base width:");
        dimensions[1] = scnr.nextInt();
        // Keep prompting for input until the arrowHeadWidth
        // is wider than arrowBaseWidth.
        while (dimensions[2] <= dimensions[1]) {
            System.out.println("Enter arrow head width:");
            dimensions[2] = scnr.nextInt();
        }
        System.out.println("");
        return dimensions;
    }

    /**
     * Prints out the base of a half arrow to output based on the given dimensions.
     * 
     * @param baseHeight the height of the half arrow base
     * @param baseWidth  the width of the half arrow base
     */
    public static void drawArrowBase(int baseHeight, int baseWidth) {
        for (int i = 0; i < baseHeight; i++) {
            for (int j = 0; j < baseWidth; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * Prints out the head of a half arrow to output based on a given dimension.
     * 
     * @param arrowHeadWidth the width of the half arrow head
     */
    public static void drawArrowHead(int arrowHeadWidth) {
        for (int i = 0; i < arrowHeadWidth; i++) {
            for (int j = 0; j < arrowHeadWidth - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Initialize a Scanner to obtain dimensions from input.
        Scanner scnr = new Scanner(System.in);
        // Call a method to get dimetions from input.
        int[] dimensions = getArrowDimensions(scnr);
        // Store the dimensions from the array into individual variables.
        int arrowBaseHeight = dimensions[0];
        int arrowBaseWidth = dimensions[1];
        int arrowHeadWidth = dimensions[2];
        // Call methods to draw the base and head of the half arrow.
        drawArrowBase(arrowBaseHeight, arrowBaseWidth);
        drawArrowHead(arrowHeadWidth);
    }
}