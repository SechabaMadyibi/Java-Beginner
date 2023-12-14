/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson9;

/**
 *
 * @author dmtshoeni
 */
public class Customer {
    private int ID;
    private boolean loyaltyDiscount;
    
    public Customer (int ID)
    {
        this.ID = ID;
        
    }
    
    public void setLoyaltyPoints (boolean loyaltyPoints)
    {
        this.loyaltyDiscount = loyaltyPoints;
    }
    
    public boolean hasloyaltyDiscount()
    {
        return loyaltyDiscount;
    }
}
