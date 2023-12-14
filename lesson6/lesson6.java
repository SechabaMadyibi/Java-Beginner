/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson6;

/**
 *
 * @author dmtshoeni
 */
public class lesson6 {

    public static void main(String[] args) {
        Customer customer01 = new Customer();
        Customer customer02 = new Customer();

        customer01.age = 40;
        customer02.name = "Duke";
        customer02.age = 30;
        customer01.name = "Dutchess";

        customer01.displayCustomer();
        customer02.displayCustomer();
        customer01.cart.cancelCart();
        customer01 =customer02;
        customer01.displayCustomer();
        customer02.displayCustomer();
    }
}

class Customer {

    public Cart cart = new Cart();
    public String name;
    public int age;

    public void displayCustomer() {
        System.out.println("Custom name is: " + name + " and age is: " + age);
    }
}

class Cart {

    public String item[];

    public void cancelCart() {
        System.out.println("Cancel cart");
    }
}
