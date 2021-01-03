/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter28;

import java.util.concurrent.Semaphore;

/**
 *
 * @author thetkhine
 */
class Q
{
    int n;
    
    static Semaphore semCon = new Semaphore(0);
    static Semaphore semProd = new Semaphore(1);
    
    void get()
    {
        try
        {
            semCon.acquire();
            System.out.println("Got n "+ n);
            semProd.release();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    void put(int n)
    {
        try
        {
            semProd.acquire();
            this.n = n;
            System.out.println("Put n "+n);
            semCon.release();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
class Producer extends Thread
{
    Q q;
    
    Producer(Q q)
    {
        this.q = q;
    }
    @Override
    public void run()
    {
        for (int i = 0; i < 20; i++) {
            q.put(i);
        }
    }
}
class Consumer extends Thread
{
    Q q;
    
    Consumer(Q q)
    {
        this.q = q;
    }
    @Override
    public void run()
    {
        for (int i = 0; i < 20; i++) {
            q.get();
        }
    }
}
public class ProducerConsumerProblem {
    public static void main(String[] args) {
        Q q = new Q();
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);
        
        p.start();
        c.start();
        
    }
}
