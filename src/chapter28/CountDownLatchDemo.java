/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter28;

import java.util.concurrent.CountDownLatch;

/**
 *
 * @author thetkhine
 */
class MyThread extends Thread
{
    CountDownLatch latch;
    
    MyThread(CountDownLatch latch)
    {
        this.latch = latch;
    }
    public void run()
    {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            latch.countDown();
            
            try
            {
                Thread.sleep(100);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
public class CountDownLatchDemo {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(5);
        
        System.out.println("Starting");
        MyThread th = new MyThread(latch);
        
        th.start();
        
        try
        {
            System.out.println("Waiting ");
            latch.await();
            System.out.println("Wait Ok");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Done");    
        
    }
}
