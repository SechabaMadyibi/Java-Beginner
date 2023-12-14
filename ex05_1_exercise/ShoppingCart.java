//1. Declare a boolean, outOfStock, and initialize it to true.
//2. Use an if statement to test the value of quantity.  
//    If it is > 1, concatenate an 's' to message so that it indicates multiple items.
//3. Use an if | else statement that tests the value of outOfStock.
//    If true, let the user know the item is unavailable.
//    If false, print the message variable, then print the total cost with tax.
//4. Run with outOfStock = true and then again with outOfStock = false.
package ex05_1_exercise;

public class ShoppingCart {

    public static void main(String[] args) {
        String custName = "Mary Smith";
        String itemDesc = "Shirt";

        // numeric fields
        double price = 21.99;
        int quantity = 2;
        double tax = 1.04;
        double total;
        String message = custName + " wants to purchase " + quantity + " " + itemDesc;

        // Calculating total cost
        total = (price * quantity) * tax;

        boolean outOfStock = false;

        if (quantity > 1) {
            message = message + "s";
        }

        // Test outOfStock and notify user in either case.
        if (outOfStock) {
            System.out.println(itemDesc + " is out of stock.");
        } else {
            System.out.println(message);
            System.out.println("Total cost with tax: " + total);
        }

    }

}
