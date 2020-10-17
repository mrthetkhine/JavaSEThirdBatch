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
public class OverloadResolution {
    static void method(int a)//1 setp
    {
        System.out.println("Integer version");
    }
    static void method(float a)//char to integer,integer float //2step
    {
        System.out.println("Float version");
    }
    public static void main(String[] args) {
        method('C');
        //var a = "hello";
    }
}
