import java.util.Scanner;

/**
 * Program that takes in two items along with their prices and quantities
 * from input and prints out their total combined cost.
 */
public class ShoppingCartPrinter {
    public static void main(String[] args) {

        // Initialize a Scanner to obtain input and two empty ItemToPurchase objects.
        Scanner scnr = new Scanner(System.in);
        ItemToPurchase item1 = new ItemToPurchase();
        ItemToPurchase item2 = new ItemToPurchase();

        // Get item 1 details from input and set values for item 1.
        System.out.println("Item 1");
        System.out.println("Enter the item name: ");
        item1.setName(scnr.nextLine());
        System.out.println("Enter the item price: ");
        item1.setPrice(scnr.nextInt());
        System.out.println("Enter the item quantity: ");
        item1.setQuantity(scnr.nextInt());

        // Add a space between input prompts and advance Scanner to prepare for item 2 inputs.
        scnr.nextLine();
        System.out.println();

        // Get item 2 details from input and set values for item 2.
        System.out.println("Item 2");
        System.out.println("Enter the item name: ");
        item2.setName(scnr.nextLine());
        System.out.println("Enter the item price: ");
        item2.setPrice(scnr.nextInt());
        System.out.println("Enter the item quantity: ");
        item2.setQuantity(scnr.nextInt());

        // Add a space between last input and total cost display.
        System.out.println();

        // Add the costs of two items and print the total.
        Integer cartTotal = item1.getCost() + item2.getCost();
        System.out.println("TOTAL COST");
        item1.printItemPurchase();
        item2.printItemPurchase();
        System.out.println();
        System.out.println("Total: $" + cartTotal);

        // Close the Scanner object.
        scnr.close();
    }
}