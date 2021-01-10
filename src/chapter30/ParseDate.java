/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter30;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author thetkhine
 */
public class ParseDate {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.parse("June 21, 2018 12:01 AM", 
                DateTimeFormatter.ofPattern("MMMM d',' yyyy hh':'mm a"));
        
        System.out.println("DateTime "+dateTime);
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("MMMM d',' yyyy hh':'mm a")));
    }
    
}
