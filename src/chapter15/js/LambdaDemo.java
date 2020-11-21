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
interface MyInterface
{
    boolean method(int num);
}
public class LambdaDemo {
    
    static boolean isEven(int number)
    {
        return number %2==0;
    }
    public static void main(String[] args) {
       
        System.out.println("isEven "+ isEven(3));
        
        MyInterface func = (n)->(n%2)==0;//Even
        System.out.println("iSEven " + func.method(20));
        
        func = (n)-> n > 0;//isPositive
        System.out.println("is Positive " + func.method(10));
        System.out.println("is Positive " + func.method(-10));
        
        
    }
    
}
