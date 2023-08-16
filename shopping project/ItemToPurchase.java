import java.util.ArrayList;
import java.util.Scanner;


public class ItemToPurchase {
    // Private fields
    private String itemName, itemDescription;
    private int itemPrice;
    private int itemQuantity;

    // Default constructor
    public ItemToPurchase() {
        // Set the private fields to default values
        itemName = "none";
        itemDescription = "none";
        itemPrice = 0;
        itemQuantity = 0;
    }

    // Parameterized constructor
    public ItemToPurchase(String name, String description, int price, int quantity) {
        // Set the private fields to the appropriate parameters
        itemName = name;
        itemDescription = description;
        itemPrice = price;
        itemQuantity = quantity;
    }

    // Mutator for itemName
    public void setName(String name) { itemName = name; }

    // Accessor for itemName
    public String getName() { return itemName; }

    // Mutator for itemDescription
    public void setDescription(String description) { itemDescription = description; }

    // Accessor for itemDescription
    public String getDescription() { return itemDescription; }

    // Mutator for itemPrice
    public void setPrice(int price) { this.itemPrice = price; }

    // Accessor for itemPrice
    public int getPrice() { return itemPrice; }

    // Mutator for itemQuantity
    public void setQuantity(int quantity) { this.itemQuantity = quantity; }

    // Accessor for itemQuantity
    public int getQuantity() { return itemQuantity; }

    // Method that outputs the item's name, quantity, price and subtotal
    public void printItemCost() {
        System.out.println(itemName + " " + itemQuantity + " @ $" + itemPrice + " = $" + itemQuantity * itemPrice);
    }

    // Method that outputs the item's name & description
    public void printItemDescription() {
        System.out.println(itemName + ": " + itemDescription);
    }
}