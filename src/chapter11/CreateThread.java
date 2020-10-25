/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter11;

/**
 *
 * @author thetkhine
 */
class OurThread extends Thread
{
    String name;
    OurThread(String name)
    {
        this.name = name;
        
    }
    @Override
    public void run()
    {
        for (int i = 0; i < 50; i++) 
        {
            System.out.println("Running "+this.name + " "+i);
                
        }
    }
}
class OurThread2 implements Runnable
{
    Thread t;
    String name;
    OurThread2(String name)
    {
        this.name = name;
        t = new Thread(this,name);
        
        
    }
    @Override
    public void run()
    {
        for (int i = 0; i < 50; i++) 
        {
            System.out.println("Running "+this.name + " "+i);
                
        }
    }
}
public class CreateThread {
    public static void main(String[] args) {
        OurThread2 th = new OurThread2("TOne");
        OurThread2 th2 = new OurThread2("TTwo");
        
        th.t.setPriority(Thread.MIN_PRIORITY);
        th2.t.setPriority(Thread.MAX_PRIORITY);
        
        th.t.start();
        th2.t.start();
        
        System.out.println("iS alive "+th.t.isAlive());
        System.out.println("iS alive "+th2.t.isAlive());
        try
        {
            System.out.println("Thread State t1 "+th.t.getState());
            System.out.println("Thread State t2 "+th2.t.getState());
            th.t.join();
            th2.t.join();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Main thread");
        System.out.println("iS alive "+th.t.isAlive());
        System.out.println("iS alive "+th2.t.isAlive());
    }
}
