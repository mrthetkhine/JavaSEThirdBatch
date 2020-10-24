/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter11;

class Counter
{
    int count;
    
    public void incCount()
    {
        //count = count + 1;
        synchronized(this)
        {
             this.count++;
        }
       
    }
}
class IncThread extends Thread
{
    String name;
    Counter counter;
    IncThread(String name, Counter counter)
    {
        this.name =name;
        this.counter = counter;
    }
    public void run()
    {
        for (int i = 0; i < 10000; i++) {
            counter.incCount();
        }
    }
}
/**
 *
 * @author thetkhine
 */
public class SynchronizationProblem {
    public static void main(String[] args) {
        double time = System.currentTimeMillis();
        Counter c = new Counter();
        IncThread t1 = new IncThread("TOne", c);
        IncThread t2 = new IncThread("Two", c);
        IncThread t3 = new IncThread("TThree", c);
        
        t1.start();
        t2.start();
        t3.start();
        
        try
        {
            t1.join();
            t2.join();
            t3.join();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Counter "+c.count);
        double end = System.currentTimeMillis();
        double elapsed = end - time;
        System.out.println("Mil "+elapsed);
    }
}
