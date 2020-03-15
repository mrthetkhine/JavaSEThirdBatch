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
        System.out.println("Integer vesion ");
        int result = a +b ;
       
        return result;
    }
    float add(float a, float b)
    {
        System.out.println("Float vesion ");
        return a+b;
    }
    double add(double a, double b)
    {
        System.out.println("Double vesion ");
        return a+b;
    }
    public static void main(String[] args)
    {
        Arithmetic ath = new Arithmetic();
        int a = 20, b = 15;
        int sum = ath.add( a,b);
        
        ath.add(1.2,2.0f);
    }
}
