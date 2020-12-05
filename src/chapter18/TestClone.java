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
public class TestClone implements Cloneable {
    int a;
    double b;
    
    TestClone cloneTest()
    {
        try
        {
            return (TestClone)super.clone();
        }
        catch(Exception e)
        {
            return this;
        }
    }
    public static void main(String[] args) {
        TestClone t1 = new TestClone();
        t1.a =100;
        t1.b = 200;
        
        TestClone t2 = t1.cloneTest();
        System.out.println("T2.a "+ t2.a);
        System.out.println("T2.b "+ t2.b);
    }
}
