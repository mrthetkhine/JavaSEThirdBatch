/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter21;

import java.io.Console;

/**
 *
 * @author thetkhine
 */
public class ConsoleDemo {
    public static void main(String[] args) {
        String str;
        Console con;
        
        con = System.console();
        if(con == null)return;
        
        str = con.readLine("Enter a string");
        con.printf("Here is your string %s \n", str);
    }
}
