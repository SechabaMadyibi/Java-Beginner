/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson13;

import lesson12.*;

/**
 *
 * @author dmtshoeni
 */
public class Trousers extends Clothing implements Returnable {
     private char fit;
    private char gender;
    public Trousers(int ItemID, String desc, char colorCode,double price,char fit, char gender)
    {
    super(ItemID, desc, colorCode, price);
    this.fit =fit;
    this.gender = gender;
    }
   
public Trousers ()
        {
        super (1, "Trousers", 'U',0.00);
        }
    /**
     * @return the fit
     */
    public char getFit() {
        return fit;
    }

    /**
     * @param fit the fit to set
     */
    public void setFit(char fit) {
        this.fit = fit;
    }

    /**
     * @return the gender
     */
    public char getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(char gender) {
        this.gender = gender;
    }
    public void display()
    {
        System.out.println("item id "+ super.getItemID());
        System.out.println("item description "+ super.getDesc());
        System.out.println("item price "+ super.getPrice());
        System.out.println("color code "+ super.getColourCode());
        System.out.println("Fit "+fit);
        System.out.println("Gender "+gender);
        
    }
    
    @Override
    public String toString ()
    {
        return ("fit "+ fit +" gender " +gender );
}
    @Override
    public String doReturn()
    {
    return "Trousers the were returned three weeks later";
    }
    
}
