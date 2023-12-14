/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson9;

/**
 *
 * @author dmtshoeni
 */
public class Items {
    private double price = 15.50;
    
    public void setPrice(Customer cust)
    {
        if (cust.hasloyaltyDiscount())
        price = price*.85;
        System.out.println(price);
    }
}
