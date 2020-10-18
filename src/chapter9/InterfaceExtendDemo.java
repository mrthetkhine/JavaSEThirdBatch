/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter9;

/**
 *
 * @author thetkhine
 */
interface Another
{
    void anotherMethod();
}
interface IOne
{
    void method1();
}
interface ITwo extends IOne, Another
{
    void method2();
}
class Concre implements ITwo
{

    @Override
    public void method2() {
        System.out.println("Method 2");
    }

    @Override
    public void method1() {
        System.out.println("Method 1");
    }

    @Override
    public void anotherMethod() {
        System.out.println("Another Method");
    }
    
}
public class InterfaceExtendDemo {
    public static void main(String[] args) {
        IOne one = new Concre();
        one.method1();
    }
}
