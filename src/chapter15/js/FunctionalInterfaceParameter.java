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
interface Arith
{
    double operation(double a, double b);
}
public class FunctionalInterfaceParameter {
    
    static void method(Arith fp,double a , double b)
    {
        double result = fp.operation(a, b);
        System.out.println("Result "+ result);
    }
    public static void main(String[] args) {
        
        Arith add = (a,b)-> a+b;
        method(add, 1,3);
        
        Arith sub = (a,b)-> a-b;
        method(sub, 10,5);
        
    }
}
