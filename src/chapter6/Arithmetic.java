/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter6;

/**
 *
 * @author thetkhine
 */
public class Arithmetic
{
    int a,  b;
    
    int add(int a , int b)
    {
        int result = a +b ;
        System.out.println(a +" + " + b + " is "+ result);
        a = 100;
        return result;
    }
    public static void main(String[] args)
    {
        Arithmetic ath = new Arithmetic();
        int a = 20, b = 15;
        int sum = ath.add( a,b);
        System.out.println("Sum is "+sum);
        System.out.println("A is "+ a);
        //ath.add(10,35);
    }
}
