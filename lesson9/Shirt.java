/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson9;

/**
 *
 * @author dmtshoeni
 */
public class Shirt {
    public Shirt ()
    {
        setColourCode ('U');
    }
    
      public Shirt (char colorCode)
    {
        setColourCode (colorCode);
    }
      
         public Shirt (char colorCode, double price)
    {
        this(colorCode);
        setPrice(price);
    }
         
         public Shirt (String descr, char colorCode,double price)
         {
         this(colorCode,price);
                 setDescription(descr);
         }
    
    private int shirtID= 0;
    private String description= " description required";
    private char colourCode = 'U';
    private double price = 0.0;
    
    
    
    public char getColourCode()
    {
        return colourCode;
    }
    
    public void setColourCode (char newCode)
    {
        if (newCode == 'U')
        {
            colourCode = newCode;
            return;
        }
        if (newCode == 'G')
        {
            colourCode = newCode;
            return;
        }
        
        if (newCode == 'R')
        {
            colourCode = newCode;
            return;
        }
        System.out.println("Invalid colour code us U, G, or R");
    }
    
    public static void main(String[] args) {
        Shirt shirt1 = new Shirt ();
        System.out.println(shirt1.getColourCode());
        shirt1.setColourCode('Z');
        System.out.println(shirt1.getColourCode());
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
