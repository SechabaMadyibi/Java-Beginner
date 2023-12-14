/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lesson8;

/**
 *
 * @author dmtshoeni
 */
public class shoppingCart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Shirt myShirt = new Shirt();
//        Shirt yourShirt = new Shirt("long sleeve", 'U', 60.00);
//        yourShirt.display();
//        myShirt.display();

//        Shirt shirt1 = new Shirt("Sailor", "Brown", 19.99);
//        Shirt shirt2 = new Shirt("Java shirt", "Red", 50.99);
//        Shirt shirt3 = new Shirt("Tropical", "Purple", 17.99);
//        Shirt shirt4 = new Shirt("Skull tree", "Yellow", 10.99);
//
//        Item item1 = new Item();
//        item1.setSizes(itemSizes.mMed);
//
//        Shirt myShirt = new Shirt();
//        System.out.println("Shirt colour: " + myShirt.colourCode);
//        changeShirtColour(myShirt, 'B');
//            System.out.println("Shirt colour: "+ myShirt.colourCode);  
        int total1 = Calculator.sum(5, 11);
        System.out.println(total1);
        float total2 = Calculator.sum(20.80F, 30.0F);
        System.out.println(total2);
        float total3 = Calculator.sum(15, 10.0F);
        System.out.println(total3);

    }

    public static void changeShirtColour(Shirt theShirt, char colour) {
        theShirt = new Shirt();
        theShirt.colourCode = colour;
    }
}

class Shirt {

    public String description;
    public char colourCode;
    public double price;

    public Shirt() {
        description = "description required";
        colourCode = 'U';
        price = 0.00;

    }

    public Shirt(String desc, String colour, double price) {
        setFields(desc, price);
        setColour(colour);
    }

//    public Shirt(String description, char colourCode, double price) {
//        this.description = description;
//        this.colourCode = colourCode;
//        this.price = price;
//    }
    public void setColour(String theColour) {
        if (theColour.length() > 0) {
            colourCode = theColour.charAt(0);
        }
    }

    public void setFields(String desc, double price) {
        this.description = desc;
        this.price = price;
    }

//    public void display() {
//        System.out.println("Item description: " + description);
//        System.out.println("Colour code: " + colourCode);
//        System.out.println("Item price: " + price);
//    }
}

class itemSizes {

    static final String mSmall = "Men's Small";
    static final String mMed = "Men's Medium";

}
//calculator test

class Calculator {

    public static int sum(int num1, int num2) {
        System.out.println("Method one");
        return num1 + num2;
    }

    public static float sum(float num1, float num2) {
        System.out.println("Method two");
        return num1 + num2;
    }

    public static float sum(int num1, float num2) {
        System.out.println("Method three");
        return num1 + num2;
    }
}
