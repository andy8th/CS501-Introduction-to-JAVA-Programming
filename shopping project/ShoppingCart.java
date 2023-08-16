import java.util.ArrayList;
import java.util.Scanner;


// Define a class named ShoppingCart
public class ShoppingCart {
    // Private fields
    private String customerName, currentDate;
    private ArrayList<ItemToPurchase> cartItems;

    // Default constructor
    public ShoppingCart() {
        // Set the private fields to default values
        customerName = "none";
        currentDate = "January 1, 2016";
        cartItems = new ArrayList<>();
    }

    // Parameterized constructor
    public ShoppingCart(String name, String date) {
        // Set the instance fields to appropriate parameters
        customerName = name;
        currentDate = date;
        cartItems = new ArrayList<>();
    }

    // Accessor for customerName
    public String getCustomerName() { 
        return customerName; 
    }

    // Accessor for currentDate
    public String getDate() { 
        return currentDate; 
    }

    // Method that adds an item to cartItems array
    public void addItem(ItemToPurchase item) {
        cartItems.add(item);
    }

    // Mrthod that removes an item from cartItems array
    public void removeItem(String name) {
        // Iterate through the cartItems array
        for (int i = 0; i < cartItems.size(); i++) {
            // If a matching item name is found in the cartItems array
            if (name.equalsIgnoreCase(cartItems.get(i).getName())) {
                // Remove the matched item from the cartItems array
                cartItems.remove(i);
                return;
            }
        }
        System.out.print("Item not found in cart. Nothing removed.\n");
    }

    // Method that modifies an item in the cart
    public void modifyItem(ItemToPurchase item) {
        // Iterate through the cartItems array
        for (int i = 0; i < cartItems.size(); i++) {
            // If a matching item name is found in the cartItems array
            if (item.getName().equalsIgnoreCase(cartItems.get(i).getName())) {
                // Check if parameter has default values for descrition, price & quantity
                if(!item.getDescription().equalsIgnoreCase("none") || item.getPrice() != 0 || item.getQuantity() != 0) {
                    // Modify the item in the cart
                    cartItems.get(i).setDescription(item.getDescription());
                    cartItems.get(i).setQuantity(item.getQuantity());
                    return;
                }
            }
        }
        System.out.println("\nItem not found in cart. Nothing modified.");
    }

    // Method that returns the quantity of all items in cart
    public int getNumItemsInCart() {
        // Create a qty variable initialized to 0
        int qty = 0;
        // Iterate through the cartItems array
        for (int i = 0; i < cartItems.size(); i++) {
            // Total the quantity of all items in the cart
            qty += cartItems.get(i).getQuantity();
        }
        return qty;
    }

    // Method that returns the total cost of items in cart
    public int getCostOfCart() {
        // Create a cost variable initialized to 0
        int cost = 0;
        // Iterate through the cartItems array
        for (int i = 0; i < cartItems.size(); i++) {
            // Total the prices of all items in the cart
            cost += (cartItems.get(i).getPrice() * cartItems.get(i).getQuantity());
        }
        return cost;
    }

    // Method that outputs total of objects in cart
    public void printTotal() {
        // If cart is empty
        if (cartItems.size() == 0) {
            // Output a message & return
            System.out.println("Number of Items: 0");
            System.out.println("\nSHOPPING CART IS EMPTY");
            System.out.println("\nTotal: $0");
            return;
        }

        // Output the number of items in cart
        System.out.println("Number of Items: " + getNumItemsInCart() +"\n");
        // Iterate through the cartItems array
        for (int i = 0; i < cartItems.size(); i++) {
            // Output each item's details
            System.out.println(cartItems.get(i).getName() + " " + cartItems.get(i).getQuantity() + " @ $" +
                cartItems.get(i).getPrice() + " = $" + (cartItems.get(i).getQuantity() * cartItems.get(i).getPrice()));
        }

        // Output the total price of the cart
        System.out.println("\nTotal: $" + getCostOfCart());
    }

    // Method that prints cart's description
    public void printDescriptions() {
        System.out.println("\nItem Descriptions");
        // Iterate through the cartItems array
        for (int i = 0; i < cartItems.size(); i++)
            // print each cart item's name and description
            System.out.println(cartItems.get(i).getName() + ": " + cartItems.get(i).getDescription());
    }
}