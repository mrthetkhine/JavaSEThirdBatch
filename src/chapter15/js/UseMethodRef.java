/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter15.js;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author thetkhine
 */
class MyClass
{
    private int val;
    MyClass(int va)
    {
        this.val = va;
    }
    int getVal()
    {
        return this.val;
    }
}
public class UseMethodRef {
    static int compare(MyClass a, MyClass b)
    {
        return a.getVal() - b.getVal();
    }
    public static void main(String[] args) {
        
        ArrayList<MyClass> a1 = new ArrayList<MyClass>();
        a1.add(new MyClass(1));
        a1.add(new MyClass(100));
        a1.add(new MyClass(10));
        a1.add(new MyClass(20));
        
        MyClass max = Collections.max(a1, UseMethodRef::compare);
        System.out.println("Max "+max.getVal());
        
    }
}
