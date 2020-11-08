/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter14;

/**
 *
 * @author thetkhine
 */
public class GenConstructor {
    
    private double val;

    public <T extends Number>GenConstructor(T a) {
        this.val = a.doubleValue();
    }
    
    void showVal()
    {
        System.out.println("Value "+this.val);
    }
    
    public static void main(String[] args) {
        Integer i = 29;
        
        GenConstructor gen = new GenConstructor(i);
        gen.showVal();
        
        //GenConstructor gen2 = new GenConstructor("Hello");
    }
    
}
