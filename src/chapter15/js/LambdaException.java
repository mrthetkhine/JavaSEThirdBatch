/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter15.js;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thetkhine
 */

class CustomArithmeticException extends Exception
{
    CustomArithmeticException(String message)
    {
        super(message);
    }
}
interface MyArith 
{
    double operation(double a, double b)throws CustomArithmeticException;
}
public class LambdaException {
    
    public static void main(String[] args) {
        
        MyArith division  = (a,b)->{
            if(b == 0)
            {
                throw new CustomArithmeticException("B is zero");
            }
            else
            {
                return a /b;
            }
        };
        try {
            System.out.println("Div "+ division.operation(10, 2));
            System.out.println("Div "+ division.operation(10, 0));
            
        } catch (CustomArithmeticException ex) {
            ex.printStackTrace();
        }
    }
    
}
