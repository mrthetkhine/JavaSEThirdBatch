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
public class ArithmeticOperator
{
    public static void main(String[] args)
    {
        int a = -3;
        float b = 0;
        char ch = 'A';
        double f = (2.0/0) - (1.0/0);
        System.out.println("F "+(f<=f));
        //System.out.println(" 2.0/0 "+ (2/0));
        System.out.println("A+ch "+( a + ch));
        System.out.println("A+B "+( a + b));
        System.out.println("A-B "+( a - b));
        System.out.println("A*B "+( a * b ));
        System.out.println("A/B "+( a / b));
        System.out.println("A%B "+( a % b));
        
        float nan = a %b;
        float sum = nan + 2;
        
        System.out.println("Sum "+sum);
        System.out.println("Nan==Nan "+ (nan == nan));
        System.out.println("Nan!=Nan "+ (nan != nan));
    }
}
