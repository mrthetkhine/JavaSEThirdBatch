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
public class FinalDemo {
    public static void main(String[] args) {
        final double PI ;
        PI= 3.14;
        
        final int constantFlag;
        if(true)
        {
            constantFlag = 1;
        }
        else 
        {
            constantFlag = 2;
        }
        System.out.println("Hello");
        
        int arr [] = new int[10];
        System.out.println("Length "+ arr.length);
    }
}
