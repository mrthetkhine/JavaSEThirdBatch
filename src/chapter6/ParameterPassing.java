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
public class ParameterPassing
{
    void inc(int a)
    {
        a++;
    }
    void inc(Number num)
    {
        num.value ++;
    }
    public static void main(String[] args)
    {
        ParameterPassing p = new ParameterPassing();
        int a= 20;
        
        p.inc(a);
        System.out.println("A is "+a);
        
        Number n = new Number(10);
        p.inc(n);
        
        System.out.println("Num "+n.value);
    }
}
