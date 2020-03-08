/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chp5;

/**
 *
 * @author thetkhine
 */
public class Traffic
{
    public static void main(String[] args)
    {
        String sign = null;
        
        if( "red".equalsIgnoreCase(sign))
        {
            System.out.println("Stop");
        }
        else if("green".equalsIgnoreCase(sign))
        {
            System.out.println("Go");
        }
        else if("yellow".equalsIgnoreCase(sign))
        {
            System.out.println("Wait");
        }
    }
}
