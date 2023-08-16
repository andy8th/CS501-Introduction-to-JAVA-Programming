import java.util.Scanner;

// Define a class named ShoppingCartManager
public class ShoppingCartManager {
    // Method that prints the menu
    public static void printMenu() {
        // Output the menu
        System.out.println("\nMENU\na - Add item to cart\nd - Remove item from cart");
        System.out.println("c - Change item quantity\ni - Output items' descriptions");
        System.out.println("o - Output shopping cart\nq - Quit");
    }

    // Main method
    public static void main(String[] args) {
        // Declare required variables
        String customerName, todayDate;
        char choice;

        // Instantiate Scanner
        Scanner sc = new Scanner(System.in);

        // Prompt the user for a customer's name
        System.out.println("Enter Customer's Name:");
        customerName = sc.nextLine();
        // Prompt the user for today's date
        System.out.println("Enter Today's Date:");
        todayDate = sc.nextLine();

        // Output the name and date
        System.out.println("\nCustomer Name: " + customerName);
        System.out.println("Today's Date: " + todayDate);

        // Create an object of type ShoppingCart
        ShoppingCart cart = new ShoppingCart(customerName, todayDate);

        do {
            // Invoke the printMenu() method
            printMenu();
            // Input the user's choice
            System.out.println("\nChoose an option:");
            choice = Character.toLowerCase(sc.nextLine().charAt(0));
            // Validate the user's choice
            while(choice != 'a' && choice != 'd' && choice != 'c' && choice != 'i' && choice != 'o' && choice != 'q') {
                // Output an error message & re-prompt the user for a valid choice
                System.out.println("Choose an option:");
                choice = Character.toLowerCase(sc.nextLine().charAt(0));;
            } 

            // If the user chooses to add an item in the cart
            if(choice == 'a') {
                System.out.println("\nADD ITEM TO CART");
                // Input the item's name
                System.out.println("Enter the item name:");
                String name = sc.nextLine();
                // Input the item's description
                System.out.println("Enter the item description:");
                String description = sc.nextLine();
                // Input the item's price
                System.out.println("Enter the item price:");
                int price = Integer.parseInt(sc.nextLine());
                // Input the item's quantity
                System.out.println("Enter the item quantity:");
                int quantity = Integer.parseInt(sc.nextLine());

                // create an ItemToPurchase object with the inputted details
                ItemToPurchase item = new ItemToPurchase(name, description, price, quantity);
                // Add the item to the cart
                cart.addItem(item);
            }

            // If the user chooses to remove an item from the cart
            else if(choice == 'd') {
                System.out.println("\nREMOVE ITEM FROM CART");
                // Input the name of the item to be removed
                System.out.println("Enter name of item to remove:");
                String name = sc.nextLine();

                // Remove the item from the cart
                cart.removeItem(name);
            }

            // If the user chooses to change an item's quantity
            else if(choice == 'c') {
                System.out.println("\nCHANGE ITEM QUANTITY");
                // Input the name of the item
                System.out.println("Enter the item name:");
                String name = sc.nextLine();
                // Input the new Quantity
                System.out.print("Enter the new quantity:");
                int qty = Integer.parseInt(sc.nextLine());

                // Create a new ItemToPurchase object using the default constructor
                ItemToPurchase item = new ItemToPurchase();
                // Set the new item's name & quantity to the inputted name and quantity
                item.setName(name);
                item.setQuantity(qty);

                // Invoke the modifyItem() function
                cart.modifyItem(item);
            }

            // If the user chooses to output item's descriptions
            else if(choice == 'i') {
                System.out.println("\nOUTPUT ITEMS' DESCRIPTIONS");
                // Output the customer's name and today's date
                System.out.println(cart.getCustomerName() + "'s Shopping Cart - " + cart.getDate());
                // Invoke the printDescriptions() method
                cart.printDescriptions();
            }

            // If the user chooses to output the shopping cart
            else if(choice == 'o') {
                System.out.println("OUTPUT SHOPPING CART");
                // Output the customer's name and today's date
                System.out.println(cart.getCustomerName() + "'s Shopping Cart - " + cart.getDate());

                // Invoke the printTotal() method
                cart.printTotal();
            }

            // Otherwise the user selects to exit
            else 
                System.out.print("");
        }while(choice != 'q');
    }
}