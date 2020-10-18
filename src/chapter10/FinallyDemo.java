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
public class FinallyDemo {
    public static void main(String[] args) {
        
        try
        {
            String s = "Hello";
            s.toLowerCase();
        }
        catch(Exception e)
        {
            System.out.println("Exception occur");
        }
        finally
        {
            System.out.println("Finally executed");
        }
        System.out.println("After finally");
    }
}
