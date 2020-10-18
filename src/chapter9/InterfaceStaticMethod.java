/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter9;

/**
 *
 * @author thetkhine
 */
interface IStatic
{
    static void staticMethod()
    {
        System.out.println("Static method demo");
    }
}
public class InterfaceStaticMethod {
    public static void main(String[] args) {
        IStatic.staticMethod();
    }
    
}
