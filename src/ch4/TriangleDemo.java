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
public class TriangleDemo
{
    public static void main(String[] args)
    {
        int outer = 6;
        for (int i = 0; i < outer; i++)
        {
            for (int j = 0; j <=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
