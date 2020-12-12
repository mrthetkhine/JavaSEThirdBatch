/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter20;

import java.util.Date;

/**
 *
 * @author thetkhine
 */
public class DateDemo {
    public static void main(String[] args) {
        Date now = new Date();
        long time = now.getTime();
        Date then =  new Date(time);
        try
        {
            Thread.sleep(100);
        }
        catch(Exception e)
        {
        }
        then = new Date();
        
        System.out.println("Date "+now);
        System.out.println("Time "+ time);
        System.out.println("Before "+ now.before(then));
        System.out.println("After "+ now.after(then));
        System.out.println("Compare "+ now.compareTo(then));
    }
}
