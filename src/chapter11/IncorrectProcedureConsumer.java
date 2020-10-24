/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter11;

class Q
{
    int n;
    synchronized int getN()
    {
        System.out.println("Got N "+n);
        return n;
    }
    synchronized void put(int n)
    {
        this.n = n;
        System.out.println("Put N "+n);
       
        
    }
}
class Producer implements Runnable
{
    Q q;
    Thread t;
    
    Producer(Q q)
    {
        this.q = q;
        t = new Thread(this,"Producer");
    }
    @Override
    public void run() {
        int i=0;
        for (int j = 0; j < 300; j++) {
             q.put(i++);
        }
        
    }
}
class Consumer implements Runnable
{
    Q q;
    Thread t;
    
    Consumer(Q q)
    {
        this.q = q;
        t = new Thread(this,"Consumer");
    }
    @Override
    public void run() {
        
        for (int j = 0; j < 300; j++) {
             q.getN();
        }
    }
}
/**
 *
 * @author thetkhine
 */
public class IncorrectProcedureConsumer {
    public static void main(String[] args) {
        Q q = new Q();
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);
        
        p.t.start();
        c.t.start();
       
        
        
    }
    
}
