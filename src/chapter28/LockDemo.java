/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter28;

import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author thetkhine
 */
class SharedData
{
    static int count = 0;
}
class LockThread extends Thread
{
    String name;
    ReentrantLock lock;
    
    LockThread(ReentrantLock lock, String name)
    {
        this.lock = lock;
        this.name = name;
    }
    public void run()
    {
        System.out.println("Starting "+name);
        
        try
        {
            System.out.println(name +" is waiting to lock count");
            lock.lock();
            System.out.println(name +" is locking count");
            for (int i = 0; i < 10000; i++) {
                 SharedData.count ++;
            }
            System.out.println(name +" count "+ SharedData.count);
            System.out.println(name +" sleeping");
            Thread.sleep(1000);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            lock.unlock();
        }
    }
}
public class LockDemo {
    
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        
        LockThread t1 = new LockThread(lock, "A");
        LockThread t2 = new LockThread(lock, "B");
        LockThread t3 = new LockThread(lock, "C");
        
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
        System.out.println("Count "+SharedData.count);
    }
}
