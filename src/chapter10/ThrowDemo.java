/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter10;

/**
 *
 * @author thetkhine
 */
public class ThrowDemo {
    static double div(double num, double divisor) throws Exception
    {
        if( num == 0)
        {
            throw new Exception("Number is zero");
        }
        double result = num / divisor;
        return result;
    }
    public static void main(String[] args) {
        try
        {
            double res = div(9,2);
            res = div(0,1);
            System.out.println("Res "+res);
        }
        catch(Exception e)
        {
            System.out.println("Message "+e.getMessage());
        }
    }
}
