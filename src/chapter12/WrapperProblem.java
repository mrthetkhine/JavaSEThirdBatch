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
public class WrapperProblem {
    public static void main(String[] args) {
        Integer a = new Integer(127);
        Integer b = new Integer(127);
        
        Integer c = 128;//int-> Wrapper =>Autoboxing
        Integer d = 128;
        
        System.out.println("A==b "+ (a.intValue() == b.intValue()));
        System.out.println("c==d "+ (c.intValue() == d.intValue()));
        
        int e = d + 1;//Wrapper => int = Unboxing;
        System.out.println("E "+e);
    }
}
