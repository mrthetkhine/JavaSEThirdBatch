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
public class ComplexExample {
    static int method()
    {
       
        if(true)
        {
            return 40;
        }
        try
        {
            throw new Exception("Here") ;
        }
        catch(Exception e)
        {
            //throw new Exception("Garr");
            return 10;
        }
        finally
        {
            //return 20;
            System.out.println("Woo");
        }
       
    }
    public static void main(String[] args) {
        int data = method();
        System.out.println("Data "+data);
    }
}
