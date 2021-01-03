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
class Shared
{
    static int count = 0;
}
class IncThread implements Runnable
{

    String name;
    Semaphore sem;
    
    IncThread(Semaphore sem, String name)
    {
        this.sem = sem;
        this.name = name;
    }
    
    @Override
    public void run() {
        
        System.out.println("Name "+name);
        try
        {
            System.out.println(name + " is waiting for a permit ");
            this.sem.acquire();
            
            for (int i = 0; i < 5; i++) {
                Shared.count ++;
                System.out.println(name +" share count "+Shared.count);
                Thread.sleep(10);
            }
            System.out.println(name+" Release permit");
            this.sem.release();
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
class DecThread implements Runnable
{

    String name;
    Semaphore sem;
    
    DecThread(Semaphore sem, String name)
    {
        this.sem = sem;
        this.name = name;
    }
    
    @Override
    public void run() {
        
        System.out.println("Name "+name);
        try
        {
            System.out.println(name + " is waiting for a permit ");
            this.sem.acquire();
            
            for (int i = 0; i < 5; i++) {
                Shared.count --;
                System.out.println(name +" share count "+Shared.count);
                Thread.sleep(10);
            }
            System.out.println(name+" Release permit");
            this.sem.release();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
public class SemDemo {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(1);
        
        Thread inc = new Thread(new IncThread(sem,"Inc A "));
        Thread dec = new Thread(new DecThread(sem, "Dec B"));
        
        inc.start();
        dec.start();
        
        try
        {
            inc.join();
        dec.join();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Share count "+Shared.count);
        
    }
}
