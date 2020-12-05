/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter18;

/**
 *
 * @author thetkhine
 */
public class MathDemo {
    public static void main(String[] args) {
        System.out.println("Math.sin(180 deg) "+ Math.sin(180* Math.PI/180.f));
        System.out.println("Floor "+ Math.floor(0.135));
        System.out.println("Ceil "+ Math.ceil(0.135));
        System.out.println("Math.min "+ Math.min(1,4));
    }
}
