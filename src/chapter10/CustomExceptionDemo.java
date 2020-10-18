/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter10;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thetkhine
 */
class CustomException extends Exception
{
    String reason ;

    public CustomException(String message) {
        this.reason = message;
    }

    public String getReason() {
        return reason;
    }
    
    
}
public class CustomExceptionDemo {
    static double div(double num, double divisor) throws CustomException
    {
        if( num == 0)
        {
            throw new CustomException("Number is zero");
        }
        double result = num / divisor;
        return result;
    }
    public static void main(String[] args) {
        try {
            double res = div(0,2);
        } catch (CustomException ex) {
            System.out.println("Get message "+ex.getReason());
        }
    }
}
