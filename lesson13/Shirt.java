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
public class Shirt extends Clothing implements Returnable {

    private char fit = 'U';

    public Shirt(int itemID, String description, char colorCode, double price,
            char fit) {
        super(itemID, description, colorCode, price);
        this.fit = fit;
    }

    public void display() {

        System.out.println("item id " + super.getItemID());
        System.out.println("item description " + super.getDesc());
        System.out.println("item price " + super.getPrice());
        System.out.println("color code " + super.getColourCode());
        System.out.println("Fit " + fit);
    }

    @Override
    public String toString() {
        return " this shirt is a fit " + fit;
    }
     @Override
    public String doReturn() {
        return "Shirt returns must be returned in two weeks ";
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
}
