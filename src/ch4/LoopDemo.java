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
public class LoopDemo
{
    public static void main(String[] args)
    {
        int i = 12;
        while( i  <= 10)
        {
            System.out.println("Hello World "+i);
            i+=2;
        }
        System.out.println("Exit from loop "+i);
        
    }
}
