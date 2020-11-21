/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter15.js;

/**
 *
 * @author thetkhine
 */
interface Arithmetic
{
    double invoke(double a, double b);
}
public class FunctionInterfaceTwo {
    public static void main(String[] args) {
        
        Arithmetic func = (a,b)->a+b;
        
        System.out.println("Add "+ func.invoke(10, 20));
        
        func = (a,b)-> a -b;
        System.out.println("Sub "+ func.invoke(10, 20));
        
        
        func = (a,b)-> a *b;
        System.out.println("Mult "+ func.invoke(10, 20));
        
    }
    
    
}
