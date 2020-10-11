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
public class Factorial {
    static int factorial(int n)
    {
        System.out.println("Fact input "+ n);
        if( n == 1)
        {
            System.out.println("Base case "+ 1);
            return 1;
        }
        else
        {
            System.out.println("Call fact "+( n-1));
            return n * factorial(n-1);
        }
    }
    public static void main(String[] args) {
        int fac = factorial(15000);
        System.out.println("5! "+ fac);
    }
}
