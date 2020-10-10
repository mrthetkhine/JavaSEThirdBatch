/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter7;

/**
 *
 * @author thetkhine
 */
public class ArithmeticOverload {
    
    static float add(int a, float b)
    {
        return a+b;
    }
    static float add(float b, int a)
    {
         return a+b;
    }
    
           //=================== prototype=  
               //================ singature 
    static int add(int a, int b)
    {
        System.out.println("Integer version");
        return a+b;
    }
    static double add(double a, double b)
    {
        System.out.println("Double version");
        return a+b;
    }
    static double add(float a, float b)
    {
        System.out.println("Float version");
        return a+b;
    }
    public static void main(String[] args) {
        
        System.out.println("Add "+ add(1,2));
        System.out.println("Add "+ add(1,2.1));
        System.out.println("Add "+ add(1.2f,2.1f));
    }
}
