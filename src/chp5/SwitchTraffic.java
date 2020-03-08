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
public class SwitchTraffic
{
    public static void main(String[] args)
    {
        String sign = "red";
        
        sign = sign.toLowerCase();
        
        switch(sign)
        {
            case "red":
                System.out.println("Stop");
                break;
            case "green":
                System.out.println("Go");
                break;
            case "yellow":
                System.out.println("Wait");
                break;
        }
        
    }
}
