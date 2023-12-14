//1. Declare a String array and initialize it with 4 elements.
//     Each element represents a different item description ("Shirt", for instance).
//2. Change message to show how many items the customer wants to purchase 
//     (Use the length property of the items array).
//3. Print just one element of the items array.  
//     What happens if you use index number 4?
package ex05_2_exercise;

public class ShoppingCart {

    public static void main(String[] args) {
        String [] items = {"chocolate", "cooldrink", "apple", "chips"};
        // local variables
        String custName = "Mary Smith";
        String message = custName + " wants to purchase " + items.length+ " items.";
        

        System.out.println(message);
        System.out.println(items[0]);
        System.out.println(items[4]);
        
    }

}
