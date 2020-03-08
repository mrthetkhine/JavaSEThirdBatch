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
public class BooleanOperator
{
    static boolean getTrue()
    {
        System.out.println("Get True");
        return true;
    }
    static boolean getFalse()
    {
        System.out.println("Get False");
        return false;
    }
    public static void main(String[] args)
    {
        System.out.println(" true & true =>"+ (getFalse() & getTrue()));
        System.out.println("After =======");
        System.out.println(" false && true =>"+ (getFalse() && getTrue()));
         System.out.println("After =======");
        System.out.println(" false && true =>"+ (getTrue() || getTrue()));
        /*
        System.out.println(" true & false =>"+ (true & false));
        System.out.println(" true | false =>"+ (true | false));
        System.out.println(" false | false =>"+ (false | false));
    */
    }
}
