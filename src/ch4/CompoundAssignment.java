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
public class CompoundAssignment
{
    public static void main(String[] args)
    {
        int a = 10;
        ++ a;
        float b = a ++ + ++a;
        System.out.println("A is "+a );
        System.out.println("B is "+b);
        
        a += b;
        
        System.out.println("A "+a);
    }
}
