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
public class StaticDemo {
    
    int data;
    static int staticData;
    
    static void hello()
    {
        System.out.println("Hello "+staticData);
    }
    void instanceMethod()
    {
        System.out.println("Non Static, Instance method"+staticData + " "+data);
    }
    public static void main(String[] args) {
        StaticDemo obj = new StaticDemo();
        hello();
        
        obj.instanceMethod();
        
        StaticDemo.hello();
        obj.hello();
    }
}
