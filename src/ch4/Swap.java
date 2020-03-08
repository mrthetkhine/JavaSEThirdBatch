/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4;

/**
 *
 * @author thetkhine
 */
public class Swap
{
    public static void main(String[] args)
    {
        int a = 78;
        int b = 5;
        a += b;
        b = a - b;
        a = a - b;
        
        System.out.println("A is "+a);
        System.out.println("B is "+b);
    }
}
