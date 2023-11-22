/**
 * The ItemToPurchase class represents an item that can be purchased.
 * It stores information such as the item name, price, and quantity.
 */
public class ItemToPurchase {

    private String itemName;
    private Integer itemPrice;
    private Integer itemQuantity;

    /**
     * Default constructor that initializes the item with default values.
     */
    public ItemToPurchase() {
        this.itemName = "none";
        this.itemPrice = 0;
        this.itemQuantity = 0;
    }

    /**
     * Gets the name of the item.
     *
     * @return The name of the item.
     */
    public String getName() {
        return itemName;
    }

    /**
     * Sets the name of the item.
     *
     * @param itemName The new name of the item.
     */
    public void setName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * Gets the price of the item.
     *
     * @return The price of the item.
     */
    public Integer getPrice() {
        return itemPrice;
    }

    /**
     * Sets the price of the item.
     *
     * @param itemPrice The new price of the item.
     */
    public void setPrice(Integer itemPrice) {
        this.itemPrice = itemPrice;
    }

    /**
     * Gets the quantity of the item.
     *
     * @return The quantity of the item.
     */
    public Integer getQuantity() {
        return itemQuantity;
    }

    /**
     * Sets the quantity of the item.
     *
     * @param itemQuantity The new quantity of the item.
     */
    public void setQuantity(Integer itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    /**
     * Prints information about the item purchase, including quantity, name, price,
     * and total cost.
     */
    public void printItemPurchase() {
        String output = itemName + " " + itemQuantity + " @ $" + itemPrice + " = $" + getCost();
        System.out.println(output);
    }

    /**
     * Returns the total cost by multiplying the itemPrice and the itemQuantity.
     * 
     * @return the total cost
     */
    public Integer getCost() {
        return itemPrice * itemQuantity;
    }
}
