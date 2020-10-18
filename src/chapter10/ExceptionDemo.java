/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter10;

/**
 *
 * @author thetkhine
 */
public class ExceptionDemo {
    
    public static void main(String[] args) {
        String s = "Hello";
        
        try
        {
             s.toLowerCase();
             double d = 3/0;
             System.out.println("Not execute");
        }
        catch(NullPointerException e)
        {
            System.out.println("Null Exception occur,Please ");
            
        }
        catch(ArithmeticException ae)
        {
            
            System.out.println("ArithmeticException Exception occur "+ae.getMessage());
            ae.printStackTrace();
        }
        catch(Exception e)
        {
            System.out.println("Exception occur,Please ");
        }
        System.out.println("Program terminate");
       
    }
    
}
