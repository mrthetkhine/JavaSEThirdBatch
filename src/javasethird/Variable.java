/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasethird;

/**
 *
 * @author thetkhine
 */
public class Variable
{
    public static void main(String[] args)
    {
        int quantity = 3;
        double price = 1.5;
        double total = quantity * price;
        
        char ch = 'A';
        byte b = 15, b2 = 15;
        b2 = b;
        System.out.println("Toal "+ total);
        
        String str = "Hello\n\tWorld"
                     +"How are you";
        System.out.println(str);
        
        {
            int x = 10;
        }
        String x = "Hello";
        System.out.println("MyVariable "+x);
        
        
        
        
    }
}
 