/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lesson8;

/**
 *
 * @author dmtshoeni
 */
public class lesson8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //        Calculator calc = new Calculator();
        //        double denominator = 2.0;
        //        calc.calculate(3, denominator);
        //        System.out.println(calc.returnString());
        //        System.out.println(calc.sum(10, 7));
        //        System.out.println(calc.isGreatert(19, 10));
        
    }
    public static void calculate(int x, double y) {
        System.out.println(x / y);
    }

    public static void printString() {
        System.out.println("Hello");

    }

    public static String returnString() {
        return "Hello";
    }

    public static int sum(int x, int y) {
        return x + y;
    }

    public static boolean isGreatert(int x, int y) {
        return x > y;
    }

}




//class Calculator {
//
//    public void calculate(int x, double y) {
//        System.out.println(x / y);
//    }
//
//    public void printString() {
//        System.out.println("Hello");
//
//    }
//
//    public String returnString() {
//        return "Hello";
//    }
//
//    public int num(int x, int y) {
//        return x + y;
//    }
//    
//     public boolean isGreatert (int x, int y) {
//        return x > y;
//    }
//}
