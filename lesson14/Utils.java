/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson14;

/**
 *
 * @author dmtshoeni
 */
public class Utils {
    public void doThis() {
        System.out.println("Arrived in doThis() ");
        doThat();
        System.out.println("back in doThis() ");
        
    }
    public void doThat() 
    {
        System.out.println("on doThat()");
        try{
        throw new Exception();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
    public static void main(String[] args) {
            Utils u =new Utils();
            u.doThis();   
    }
}
