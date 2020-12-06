/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter18;

/**
 *
 * @author thetkhine
 */
public class StackTraceDemo {
    
    static void methodA()
    {
        System.out.println("Method A Called");
        methodB();
    }
    static void methodB()
    {
        System.out.println("Method B called");
        try
        {
            throw new Exception();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        //methodB();
        methodA();
    }
    
}
