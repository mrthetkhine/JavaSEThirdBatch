/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter28;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author thetkhine
 */
class ShareAtomic
{
    static AtomicInteger ai = new AtomicInteger(0);
}
class AtomThread extends Thread
{
    String name;
    
    AtomThread(String name)
    {
        this.name = name;
    }
    
    @Override
    public void run()
    {
        System.out.println("Starting  "+name);
        for (int i = 0; i < 10000; i++) {
            System.out.println(name +" got "+ShareAtomic.ai.getAndIncrement());
        }
    }
}
public class AtomicDemo {
    public static void main(String[] args) {
        AtomThread a = new AtomThread("A");
        AtomThread b = new AtomThread("B");
        AtomThread c = new AtomThread("C");
        
        a.start();
        b.start();
        c.start();
        try
        {
            a.join();
            b.join();
            c.join();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Count "+ShareAtomic.ai.get());
    }
}
