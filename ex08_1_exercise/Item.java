//Exercise 8-1
//
//In the Item class:
//1. Declare a setColor method that takes a char as an argument (a color code)
//     and returns a boolean.
//     Return false if the colorCode is ' '.
//     Otherwise, assign the colorCode to the color field and return true.
//
//In the ShoppingCart class:
//2. Call the setColor method on item1.  If it returns true,
//     print out item1.color.  If it returns false, print an
//     invalid color message.
//3. Test the method with both a valid color and an invalid one.
package ex08_1_exercise;

public class Item {
    char color;
    
    // declare and code the setColor method
    
    public boolean setColour (char colourCode)
    {
        if (colourCode == ' ')
        {
          return false;  
        }
        else
        
        {color = colourCode;
       
            return true;}
    }
    
    
}
