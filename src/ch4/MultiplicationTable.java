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
public class MultiplicationTable
{
    public static void main(String[] args)
    {
        for (int i = 3; i < 5; i++)
        {
            for (int j = 1; j < 4; j++)
            {
                System.out.println(i+ " * "+ j + " = "+ (i*j));
            }
            System.out.println("===============");
        }
    }
}
