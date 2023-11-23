import java.util.Scanner;

/**
 * MenuApp
 */
public class MenuApp {

    public static void printMenu() {
        System.out.println("Today's Menu:");
        System.out.println("\t1) Gumbo");
        System.out.println("\t2) Pasta");
        System.out.println("\t3) Quit\n");
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean quit = false;
        int choice;

        while (!quit) {
            printMenu();
            System.out.print("Choice: ");
            choice = in.nextInt();
            if (choice == 3) {
                System.out.println("Goodbye");
                quit = true;
            } else if (choice == 1) {
                System.out.println("You ordered Gumbo");
            } else if (choice == 2) {
                System.out.println("You ordered Pasta");
            } else {
                System.out.println("Not on the menu");
            }
        }
        
        in.close();
    }
}