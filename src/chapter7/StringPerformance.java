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
public class StringPerformance {
    public static void main(String[] args) {
        
        double start = System.currentTimeMillis();
        
        /*
        String str = "";
        for(int i=0;i < 100000;i++)
        { 
            str += i;
        }
        */
        StringBuffer str = new StringBuffer("");
        for(int i=0;i < 100000;i++)
        { 
            str.append( i);
        }
        double end = System.currentTimeMillis();
        double time = end - start;
        System.out.println("Time "+ time);
    }
}
