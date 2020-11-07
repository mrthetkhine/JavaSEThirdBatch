/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter13;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thetkhine
 */
class MyParent
{
    
}
class MyChildOne extends MyParent
{
}
class MyChildTwo extends MyParent
{
}
public class InstanceOfDemo {
    public static void main(String[] args) {
        MyParent p = new MyChildOne();
        
        if( p instanceof MyParent)
        {
            System.out.println("Yes p instanceof MyParent");
        }
        if( p instanceof MyChildOne)
        {
            System.out.println("Yes p instanceof MyChildOne");
        }
        if( p instanceof MyChildTwo)
        {
            System.out.println("Yes p instanceof MyChildTwo");
        }
        List arr = new ArrayList();
        arr.add("Hello");
        arr.add(3);
        
        Object value = arr.get(0);
        if( value instanceof String)
        {
            System.out.println("yes value is string");
        }
        System.out.println("null instanceof Object "+(null instanceof Object));
    }
}
