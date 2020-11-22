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
public class StringDemo {
    public static void main(String[] args) {
        String obj = "Hello";
        String str1 = "Hello";
        String str2 = new String("Hello");
        
        System.out.println("obj == str1 "+ (obj == str1)); //Object equality
        System.out.println("str1 == str2 "+ (str1 == str2));//Object equality
        
        
        System.out.println("str1.equals(str2) "+ (str1.equals(str2)));
        
        System.out.println("Instance of String "+ (obj instanceof String));
        System.out.println("Instance of Object "+ (obj instanceof Object));
    }
}
