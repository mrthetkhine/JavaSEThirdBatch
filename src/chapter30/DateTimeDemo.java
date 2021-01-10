/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter30;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 *
 * @author thetkhine
 */
public class DateTimeDemo {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Date "+date);
        
        LocalTime time = LocalTime.now();
        System.out.println("Time "+time);
        
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("LocalDate Time "+dateTime);
    }
}
