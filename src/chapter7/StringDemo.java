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
public class StringDemo {
    public static void main(String[] args) {
        String str = "Hello";
        String str2 = new String("Hello");
        
        System.out.println(str.toLowerCase());
        System.out.println(str2.toUpperCase());
        System.out.println("ChatAt(0) "+ str.charAt(0));
        
        String s3 = str +" "+ str2;
        System.out.println("S3  "+ s3);
    }
}
