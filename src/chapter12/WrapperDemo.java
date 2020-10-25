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
public class WrapperDemo {
    public static void main(String[] args) {
        int i = 10;
        
        Integer iWrap = 10;
        iWrap = Integer.valueOf(10);
        
        iWrap = new Integer(10);
        System.out.println("IWrap "+ (iWrap.intValue() == i));
    }
}
