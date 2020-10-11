/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter7;

/**
 *
 * @author thetkhine
 */
public class StringImmutable {
    public static void main(String[] args) {
        String str = "Hello";
        String str2 = str.toLowerCase();
        
        System.out.println("Str "+ str);
        System.out.println("Str2 "+ str2);
    }
}
