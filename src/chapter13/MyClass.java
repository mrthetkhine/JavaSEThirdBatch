/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter13;

/**
 *
 * @author thetkhine
 */
public class MyClass {
    int a, b;
    
    MyClass(int a,int b)
    {
        this.a = a;
        this.b = b;
        System.out.println("Two argument constructor");
    }
    MyClass(int a)
    {
        this(a,a);
        System.out.println("One Arugment constructor");
    }
    public static void main(String[] args) {
        MyClass c = new MyClass(10,2);
        c = new MyClass(200);
    }
}
