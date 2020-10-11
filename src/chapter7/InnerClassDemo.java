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
class Outer
{
    int outer_x = 100;
    
    void test()
    {
        Inner inner = new Inner();
        inner.display();
        
        System.out.println("Acceess inner.y "+ inner.y);
        //System.out.println("Acceess y "+ y);
    }
    
    //Inner class coz it is non -static
    private class Inner
    {
        int y=100;
        void display()//non static
        {
            System.out.println("Display outer_x "+outer_x);
        }
    }
}
class Outer2
{
    static int outer_x = 100;
    
    void test()
    {
        Inner inner = new Inner();
        inner.display();
        
        System.out.println("Acceess inner.y "+ inner.y);
        //System.out.println("Acceess y "+ y);
    }
    
    //Nested class coz it is static
    static private class Inner
    {
        int y=100;
        void display()//non static
        {
            System.out.println("Display outer_x "+outer_x);
        }
    }
}
public class InnerClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}
