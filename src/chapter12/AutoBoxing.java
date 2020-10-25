/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter12;

/**
 *
 * @author thetkhine
 */
public class AutoBoxing {
    public static int method(Integer i)
    {
        return i+1;
    }
    public static void main(String[] args) {
        Integer result = method(3);
        
        System.out.println("Result "+result);
    }
}
