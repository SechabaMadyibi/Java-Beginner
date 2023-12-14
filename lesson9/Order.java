/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson9;

/**
 *
 * @author dmtshoeni
 */
public class Order {
    public static void main(String[] args) {
        Customer cust =  new Customer (1);
        Items item = new Items();
//        item.price = 10.00;
        item.setPrice(cust);
        
        
    }
}
