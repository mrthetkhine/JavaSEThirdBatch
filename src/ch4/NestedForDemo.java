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
public class NestedForDemo
{
    public static void main(String[] args)
    {
        for (int i = 0; i < 4; i++)
        {
            System.out.println("Outer i "+i);
            for (int j = 0; j < 3; j++)
            {
                System.out.println("Inner i "+i +" j "+ j);
            }
        }
    }
}
