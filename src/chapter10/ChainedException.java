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
public class ChainedException {
    static void method()
    {
        NullPointerException e = new NullPointerException("Top layer exception");
        e.initCause(new ArithmeticException("Cause"));
        throw e;
    }
    public static void main(String[] args) {
        try
        {
            method();
        }
        catch(NullPointerException e)
        {
            System.out.println("Cause "+e);
            System.out.println("Oringinal Cause "+e.getCause());
        }
        
    }
}
