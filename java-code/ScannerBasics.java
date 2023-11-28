import java.util.Scanner;

public class ScannerBasics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int wage = in.nextInt();
        System.out.println("Salary is: " + (wage * 40 * 50));
        in.close();
    }
}
