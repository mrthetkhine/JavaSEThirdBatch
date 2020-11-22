/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter17;

/**
 *
 * @author thetkhine
 */
public class StartWith {
    public static void main(String[] args) {
        String str  = "Java Programming";
        
        System.out.println(str.startsWith("Java"));
        System.out.println(str.endsWith("Programming"));
        
        String str1 = "Apple";
        String str2 = "Banana";
                
        System.out.println("Str1.compare to " + str2.compareTo(str1));
    }
}
