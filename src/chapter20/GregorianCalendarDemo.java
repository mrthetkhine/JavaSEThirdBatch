/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter20;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author thetkhine
 */
public class GregorianCalendarDemo {
    public static void main(String[] args) {
        String months []= {
            "Jan","Feb","March","April",
            "May","June","July","August",
            "September","October","November","December"};
        
        GregorianCalendar gCalendar = new GregorianCalendar(2020,10,1);
        
        System.out.println("Is lead year "+ gCalendar.isLeapYear(2020));
        System.out.println("Month "+months[gCalendar.get(Calendar.MONTH)]);
        System.out.println("Year "+gCalendar.get(Calendar.YEAR));
        System.out.println("Date "+ gCalendar.get(Calendar.DATE));
    }
}
