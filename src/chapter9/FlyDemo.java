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
interface Fly
{
    void fly();
}
class Aeroplance implements Fly
{
    @Override
    public void fly()
    {
        System.out.println("Aeroplane is flying");
    }
}
class Bird implements Fly
{
    @Override
    public void fly()
    {
        System.out.println("Bird is flying");
    }
}
public class FlyDemo {
    public static void main(String[] args) {
        Fly f = new Aeroplance();
        f.fly();
        
        f = new Bird();
        f.fly();
    }
    
}
