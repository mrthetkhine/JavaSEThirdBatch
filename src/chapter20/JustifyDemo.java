/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter20;

import java.util.Formatter;

/**
 *
 * @author thetkhine
 */
public class JustifyDemo {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();
        
        fmt.format("|%10.2f|",123.123);
        System.out.println(fmt);
        
        fmt.close();
        
        fmt = new Formatter();
        fmt.format("|%-10.2f|",123.123);
        System.out.println(fmt);
    }
}
