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
public class BitwiseOperator
{
    public static void main(String[] args)
    {
        int i = 1;
        System.out.println(" I "+ Integer.toBinaryString(i));
        System.out.println("!i "+Integer.toBinaryString(~i));
        System.out.println("~i "+ (~i));
    }
}
