import java.util.Scanner;

public class HeightConverter {

    public static final double CM_PER_INCH = 2.54;
    public static final int IN_PER_FT = 12;

    public static double heightFtInToCm(int heightFt, int heightIn) {
        int totIn;
        double cmVal;
        totIn = (heightFt * IN_PER_FT) + heightIn;
        cmVal = totIn * CM_PER_INCH;
        return cmVal;
    }
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int feet;
        int inches;

        System.out.print("Enter feet: ");
        feet = in.nextInt();

        System.out.print("Enter inches: ");
        inches = in.nextInt();

        System.out.print("Centimeters: ");
        System.out.println(heightFtInToCm(feet, inches));

        in.close();
    }
}
