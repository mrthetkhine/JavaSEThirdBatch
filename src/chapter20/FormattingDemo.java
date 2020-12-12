/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter20;

import java.util.Calendar;
import java.util.Formatter;

/**
 *
 * @author thetkhine
 */
public class FormattingDemo {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();
        String str = fmt.format("Formatting %s is easy %05d %.2f", "with Java", 10, 98.6).toString();
        System.out.println(str);
        
        Calendar cal = Calendar.getInstance();
        Formatter tFmt = new Formatter();
        tFmt.format("%tr", cal);
        
        System.out.println("Time "+tFmt);
        
        tFmt = new Formatter();
        tFmt.format("%tc %n %tb", cal,cal);
        System.out.println("TC "+tFmt);
        
        fmt.close();
    }
}
