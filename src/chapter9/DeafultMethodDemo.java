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
        
interface IWithDefaultMethod
{
    void method();
    default void defaultMethod()
    {
        System.out.println("Default Implementation");
    }
}
class Concrete implements IWithDefaultMethod, IOne
{

    @Override
    public void method() {
        System.out.println("Method");
    }

    @Override
    public void method1() {
        System.out.println("Method1");
    }
}
public class DeafultMethodDemo {
    public static void main(String[] args) {
        IWithDefaultMethod demo = new Concrete();
        demo.defaultMethod();
        demo.method();
    }
}
