/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter20;

import java.util.Calendar;

/**
 *
 * @author thetkhine
 */
public class CalendarDemo {
    public static void main(String[] args) {
        
        String months []= {
            "Jan","Feb","March","April",
            "May","June","July","August",
            "September","October","November","December"};
        Calendar calendar = Calendar.getInstance();
        
        System.out.println("Month "+months[calendar.get(Calendar.MONTH)]);
        System.out.println("Year "+calendar.get(Calendar.YEAR));
        System.out.println("Date "+ calendar.get(Calendar.DATE));
        
        System.out.println("Time");
        System.out.println("Hour "+ calendar.get(Calendar.HOUR));
        System.out.println("Min "+ calendar.get(Calendar.MINUTE));
        System.out.println("Sec "+ calendar.get(Calendar.SECOND));
        
        System.out.println("Update");
        calendar.set(Calendar.HOUR, 10);
        calendar.set(Calendar.MINUTE, 10);
        calendar.set(Calendar.SECOND, 10);
        
        System.out.println("Hour "+ calendar.get(Calendar.HOUR));
        System.out.println("Min "+ calendar.get(Calendar.MINUTE));
        System.out.println("Sec "+ calendar.get(Calendar.SECOND));
    }
}
