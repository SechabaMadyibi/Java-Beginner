/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson5;

/**
 *
 * @author dmtshoeni
 */
public class Lesson5 {
    public static void main(String[] args) {
//        String [] names = {"George", "Jii", "Xinyi", "Ravi"};
//        
//        for (String name: names)
//        {
//            System.out.println("Name is " + name);
//        }
int passmark = 12;
boolean passed = false;
int [] score = {4,6,2,8,12,35,9};
    for (int unitScore: score)    
    {
        if(unitScore >= 12)
        {
            passed = true;
            break;
        }
    }
        System.out.println("Atleast one passed " +passed);
    }
}
