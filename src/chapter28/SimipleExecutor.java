/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter28;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author thetkhine
 */
class MyExThread extends Thread
{
    CountDownLatch lath;
    String name;
    
    MyExThread(CountDownLatch lath, String name)
    {
        this.lath = lath;
        this.name = name;
    }
    
    @Override
    public void run()
    {
        for (int i = 0; i < 5; i++) {
            System.out.println("Name "+name + " i "+i);
            this.lath.countDown();
        }
    }
}
public class SimipleExecutor {
    public static void main(String[] args) {
        
        CountDownLatch cd1 = new CountDownLatch(5);
        CountDownLatch cd2 = new CountDownLatch(5);
        CountDownLatch cd3 = new CountDownLatch(5);
        CountDownLatch cd4 = new CountDownLatch(5);
        
        ExecutorService es = Executors.newFixedThreadPool(3);
        
        es.execute(new MyExThread(cd1,"A"));
        es.execute(new MyExThread(cd2,"B"));
        es.execute(new MyExThread(cd3,"C"));
        es.execute(new MyExThread(cd4,"D"));
        
        try
        {
            cd1.await();
            cd2.await();
            cd3.await();
            cd4.await();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        es.shutdown();
        System.out.println("Done");
        
    }
}
