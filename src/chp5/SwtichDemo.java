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
public class SwtichDemo
{
    public static void main(String[] args)
    {
        int month = 12;
        
        switch (month)
        {
            case 2:    
                System.out.println("28 days");
                break;    
            case 9:
            case 4:
            case 6:
            case 11:
                System.out.println("30 days");
                break;
            default:
                System.out.println("31 days");
                break;
        }
    }
}
