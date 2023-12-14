//1.  Examine the Item class.  Pay close attention to the 
//      overloaded constructor and also the display method.
//2.  Create a new class called Shirt that inherits from Item.
//3.  Declare two private char fields: size and colorCode
//4.  Create a constructor method that takes 3 args(price, size, colorCode).  
//5.  The constructor should:
//	- Call the 2-arg constructor in the superclass, sending a String 
//            literal for the desc arg ("Shirt") and pass the price argument 
//            from this constructor. 
//	-  Assign the size and colorCode fields.
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex12_1_exercise;

/**
 *
 * @author dmtshoeni
 */
public class Shirt extends Item {
    private char size;
    private char colourCode;
    
    public Shirt (double price, char size, char colorCode)
    {
    super ("Shirt", price);
    this.size =size;
    this.colourCode =colorCode;
    }
}
