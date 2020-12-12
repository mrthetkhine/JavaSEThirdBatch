/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter20;

import java.util.BitSet;

/**
 *
 * @author thetkhine
 */
public class BitSetDemo {
    public static void main(String[] args) {
        BitSet bit = new BitSet(16);
        BitSet publicBit = new BitSet(16);
        
        bit.set(0); //public
        bit.set(1); //static
        //bit.set(2); //protected
        
        publicBit.set(0);
        
        publicBit.and(bit);
        System.out.println("isPublic "+ publicBit);
        
        
        
    }
}
