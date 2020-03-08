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
public class DoWhileDemo
{
    public static void main(String[] args)
    {
        int i = 12;
        
        do{
            System.out.println("Hello World "+i);
            i+=2;
        }while( i  <= 10);
        System.out.println("Exit from loop "+i);
    }
}
