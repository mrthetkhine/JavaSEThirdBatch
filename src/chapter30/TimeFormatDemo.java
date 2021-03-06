/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter30;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author thetkhine
 */
public class TimeFormatDemo {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat df;
        
        df = DateFormat.getTimeInstance(DateFormat.SHORT, Locale.JAPAN);
        System.out.println("Japan : "+df.format(date));
        
        df = DateFormat.getTimeInstance(DateFormat.MEDIUM, Locale.KOREA);
        System.out.println("Korea : "+df.format(date));
        
        df = DateFormat.getTimeInstance(DateFormat.LONG, Locale.UK);
        System.out.println("UK : "+df.format(date));
        
        df = DateFormat.getTimeInstance(DateFormat.FULL, Locale.US);
        System.out.println("US : "+df.format(date));
    }
}
