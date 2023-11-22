public class ItemToPurchase {

    private String itemName;
    private Double itemPrice;
    private Integer itemQuantity;

    public ItemToPurchase() {
        itemName = "none";
        itemPrice = 0.0;
        itemQuantity = 0;
    }
    
    public String getName() {
        return itemName;
    }

    public void setName(String itemName) {
        this.itemName = itemName;
    }

    public Double getPrice() {
        return itemPrice;
    }

    public void setPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public Integer getQuantity() {
        return itemQuantity;
    }

    public void setQuantity(Integer itemQuantity) {
        this.itemQuantity = itemQuantity;
    }
      
    public void printItemPurchase() {
        System.out.println(itemQuantity + " " + itemName + " $" + itemPrice +  
                            " = $" + (itemPrice * itemQuantity));
    }
}