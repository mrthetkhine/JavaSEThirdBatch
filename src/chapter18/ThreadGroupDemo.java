/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter18;

/**
 *
 * @author thetkhine
 */
class ThreadDemo extends Thread
{
    boolean suspendFlag;
    ThreadDemo(String threadName, ThreadGroup group)
    {
        super(group,threadName);
        System.out.println("New thread "+this);
        suspendFlag = false;
    }
    public void run()
    {
        try
        {
            for (int i = 5; i >0; i--) 
            {
                System.out.println(this.getName()+" : "+i);
                Thread.sleep(1000);
                synchronized(this)
                {
                    while(suspendFlag)
                    {
                        wait();
                    }
                }
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
    synchronized void mysuspend()
    {
        suspendFlag = true;
    }
    synchronized void myresume()
    {
        suspendFlag = false;
    }
}
public class ThreadGroupDemo {
    public static void main(String[] args) {
        ThreadGroup groupA = new ThreadGroup("Group A");
        ThreadGroup groupB = new ThreadGroup("Group B");
        
        ThreadDemo t1 = new ThreadDemo("One",groupA);
        ThreadDemo t2 = new ThreadDemo("Two",groupA);
        
        ThreadDemo t3 = new ThreadDemo("Thre",groupB);
        ThreadDemo t4 = new ThreadDemo("Four",groupB);
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
        System.out.println("List");
        groupA.list();
        groupB.list();
        
        Thread tga[] = new Thread[groupA.activeCount()];
        groupA.enumerate(tga);
        
        for (int i = 0; i < tga.length; i++) {
            ((ThreadDemo)tga[i]).mysuspend();
        }
        try
        {
            Thread.sleep(1000);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        for (int i = 0; i < tga.length; i++) {
            ((ThreadDemo)tga[i]).myresume();
        }
        try
        {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Main thread exiting");
    }
}
