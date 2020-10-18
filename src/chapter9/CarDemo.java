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
interface Engine
{
    void start();
}
class DiselEngine implements Engine
{

    @Override
    public void start() {
        System.out.println("DiselEngine start");
    }
}
class ElectricEngine implements Engine
{
    

    @Override
    public void start() {
        System.out.println("ElectricEngine start");
    }
}
class Car
{
    Engine engine;
    
    void move()
    {
        System.out.println("Car start");
        this.engine.start();
    }
}
public class CarDemo {
    public static void main(String[] args) {
        Car c = new Car();
        
        c.engine = new DiselEngine();        
        c.move();
        
        c.engine = new ElectricEngine();
        c.move();
    }
}
