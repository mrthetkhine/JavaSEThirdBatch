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
public class BooleanDemo {
    public static void main(String[] args) {
        boolean b = Boolean.parseBoolean("True");
        System.out.println("Boolean "+b);
        System.out.println("Boolean And "+ Boolean.logicalAnd(true, false));
    }
}
