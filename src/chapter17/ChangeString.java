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
public class ChangeString {
    public static void main(String[] args) {
        String str = "hello";
        
        System.out.println(str.toUpperCase());
        System.out.println("Str "+str);
        
        str = str.toLowerCase();
        System.out.println("Str "+str);
        
        /*
        String all ="";
        double start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            all+=i;
        }
        double end = System.currentTimeMillis();
        
        double time = (end-start)/1000;
        */
        StringBuffer all =new StringBuffer("");
        double start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            all.append(i);
        }
        double end = System.currentTimeMillis();
        
        double time = (end-start)/1000;
        System.out.println("Time "+time);
    }
}
