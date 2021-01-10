/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter30;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author thetkhine
 */
public class SimpleDateFormatDemo {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat df ;
        
        df = new SimpleDateFormat("hh:mm:ss");
        System.out.println("hh:mm:ss "+ df.format(date));
        
        df = new SimpleDateFormat("dd MMM yyyy hh:mm:ss zzz");
        System.out.println("dd MMM yyyy hh:mm:ss zzz "+df.format(date));
        
        df = new SimpleDateFormat("E MMM dd yyyy");
        System.out.println("E MMM dd yyyy "+df.format(date));
        
        df = new SimpleDateFormat("dd/MM/yyy");
        System.out.println("dd/MM/yyy "+df.format(date));
    }
}
