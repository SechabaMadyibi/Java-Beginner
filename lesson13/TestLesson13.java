/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lesson13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lesson12.*;

/**
 *
 * @author dmtshoeni
 */
public class TestLesson13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        // TODO code application logic here
//       Shirt shirt02 = new Shirt (1, "Long Sleeve", 'B', 100.99, 'S');
//         shirt02.display();
//         System.out.println(shirt02);

//Shirt shirt02 = new Shirt (1, "Long sleeve", 'B', 100.99, 'S' );
//
//Clothing c1 = new Trousers(1,"Trousers", 'B', 100.99,'S', 'F');
//
//
//  
//        System.out.println(shirt02);
//        System.out.println(c1);
//        
//        System.out.println(shirt02.doReturn()); 

//Trousers t1 = new Trousers();
//Clothing c1 = new Trousers();
//Returnable r1 = new Trousers();
//
//t1.display();
//t1.getItemID();
//t1.doReturn();
//t1.getFit();
//
//c1.display();
//c1.getItemID();
//
//r1.doReturn();
//
//if (c1 instanceof Trousers)
//{
//    System.out.println(((Trousers) c1).getFit());
//}
//
//if (r1 instanceof Trousers)
//{
//    System.out.println( ((Trousers) r1).getFit());
//}

//String [] nums = {"one", "two", "three"};
//
//
//ArrayList <String> myArrayList = new ArrayList (Arrays.asList (nums));
String[] days = {"monday", "saturday", "tuesday", "sunday", "friday"};

 ArrayList <String> daysArrayList = new ArrayList(
                Arrays.asList(days));

        for (String day: daysArrayList )
        {
            if (day.equalsIgnoreCase("Sunday"))
            {
                System.out.println(day.toUpperCase());
            }
            else{
                System.out.println(day.toLowerCase());
                
            }   
            
        }
        System.out.println(daysArrayList);
        daysArrayList.replaceAll(day -> day.toUpperCase());
        
         daysArrayList.removeIf(day -> day.equalsIgnoreCase("Saturday"));
        System.out.println(daysArrayList);

    }  
    
    
}
