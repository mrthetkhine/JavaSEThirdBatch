/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter28;

import java.util.concurrent.CyclicBarrier;

/**
 *
 * @author thetkhine
 */

class BarAction extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Barrier reached");
    }
}
class BarrierThread extends Thread
{
    CyclicBarrier cBar;
    String name;
    
    BarrierThread(CyclicBarrier cBar, String name)
    {
        this.cBar = cBar;
        this.name = name;
    }
    
    @Override
    public void run()
    {
        
        
        try
        {
            System.out.println("Thread "+name + " await " );
            cBar.await();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
}
public class CyclicBarrierDemo {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(3,new BarAction());
        
        System.out.println("Starting");
        BarrierThread t1 = new BarrierThread(barrier,"One");
        BarrierThread t2 = new BarrierThread(barrier,"Two");
        BarrierThread t3 = new BarrierThread(barrier,"Three");
        BarrierThread t4 = new BarrierThread(barrier,"Four");
        BarrierThread t5 = new BarrierThread(barrier,"Five");
          
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        System.out.println("Done");
    }
}
