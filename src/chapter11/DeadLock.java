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
class A
{
    synchronized void foo(B b)
    {
        String name = Thread.currentThread().getName();
        System.out.println("Name  "+name +" entered A.foo");
        
        try
        {
            Thread.sleep(1000);
        }
        catch(Exception e)
        {
            System.out.println("A interrupted");
            e.printStackTrace();
        }
        System.out.println(name +" trying to call B.last ()");
        b.last();
    }
    synchronized void last()
    {
        System.out.println("Inside A.last");
    }
}
class B
{
    synchronized void bar(A a)
    {
        String name = Thread.currentThread().getName();
        System.out.println("Name  "+name +" entered b.bar");
        try
        {
            Thread.sleep(1000);
        }
        catch(Exception e)
        {
            System.out.println("B interrupted");
            e.printStackTrace();
        }
        System.out.println(name +" trying to call a.last ()");
        a.last();
    }
    synchronized void last()
    {
        System.out.println("Inside B.last");
    }
}

public class DeadLock implements Runnable{
    A a = new A();
    B b = new B();
    Thread t = new Thread();

    DeadLock()
    {
        Thread.currentThread().setName("Main Thread");
        t = new Thread(this,"Racing Thread");
    }
    void deadLockStart()
    {
        t.start();
        a.foo(b);
        System.out.println("Back in the main thread");
    }
    @Override
    public void run() {
        b.bar(a);
        System.out.println("Back in main thread");
    }
    
    public static void main(String[] args) {
        DeadLock dl = new DeadLock();
        dl.deadLockStart();
    }
}
