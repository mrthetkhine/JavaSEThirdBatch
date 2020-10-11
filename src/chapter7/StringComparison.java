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
public class StringComparison {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        
        System.out.println("s1==s2 "+ (s1==s2));
        System.out.println("s1==s3 "+ (s1==s3));
        
        System.out.println("s1.equals(s2) "+ (s1.equals(s2)));
    }
}
