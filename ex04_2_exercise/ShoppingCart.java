//1. Declare and initialize numeric fields. Include price and tax (double), 
//     quantity (int). Also declare a double called total, but do not initialize it.
//2. Change the message variable to include quantity 
//      (example: "Mary Smith wants to purchase 1 Shirt.")
//3. Calculate total by multiplying price * quantity * tax.
//4. Print a message showing the total cost. 
//      (example:  "Total cost with tax is: 25.78.") 
package ex04_2_exercise;

public class ShoppingCart {
    
    public static void main(String[] args) {
         double price  = 190.89 , tax = 0.15, total;
        int quantity = 10;
        total = price*tax;
        String custName = "Mary Smith";
        String itemDesc = " Shirt";
        String message = custName+" wants to purchase " +quantity + itemDesc+ "s";
        System.out.println(message);
        System.out.println("Total cost with tax is: " + total);
      

        
   
    }    
}
