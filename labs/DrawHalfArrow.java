import java.util.Scanner; 

public class DrawHalfArrow {

    /**
     * Prints out the base of a half-arrow to output based on given dimensions.
     * 
     * @param baseHeight the height of the base
     * @param baseWidth  the width of the base
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
     * 
     * 
     * @param arrowHeadWidth
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
        
        // initialize a Scanner and variables to store half-arrow dimensions
        Scanner scnr = new Scanner(System.in);
        int arrowBaseHeight = 0;
        int arrowBaseWidth = 0;
        int arrowHeadWidth = 0;
        
        // get arrow base dimensions from input
        System.out.println("Enter arrow base height:");
        arrowBaseHeight = scnr.nextInt();
        System.out.println("Enter arrow base width:");
        arrowBaseWidth = scnr.nextInt();

        while (arrowHeadWidth <= arrowBaseWidth) {
            System.out.println("Enter arrow head width:");
            arrowHeadWidth = scnr.nextInt();
        }
        System.out.println("");
        
        drawArrowBase(arrowBaseHeight, arrowBaseWidth);
        drawArrowHead(arrowHeadWidth);
    }
}