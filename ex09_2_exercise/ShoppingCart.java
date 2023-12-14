//In the Customer class:
//1. Add a custom constructor that initializes the fields.
//
//In the ShoppingCart class:
//2. Declare, instantiate, and initialize a new Customer object
//    by calling the custom constructor.  
//3. Test it by printing the customer object name 
//    (call getName method).

package ex09_2_exercise;


public class ShoppingCart {

    public static void main(String args[]) {
        // Declare, instantiate, and initialize a Customer object

Customer cust = new Customer("Sechaba", "12");
        System.out.println(cust.getName());


	// Print the customer object name

        
    }
}
