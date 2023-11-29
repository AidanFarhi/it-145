import java.util.Scanner;

public class FlyDrive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a distance in miles: ");
        double miles = in.nextDouble();
        
        double hoursToFly = miles / 500.0;
        double hoursToDrive = miles / 60.0;

        System.out.printf("%.2f miles would take:\n", miles);
        System.out.printf("%.2f hours to fly\n", hoursToFly);
        System.out.printf("%.2f hours to drive\n", hoursToDrive);

        in.close();
    }
}
