/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter11;

class CQ
{
    int n;
    boolean valueSet = false;
    synchronized int getN()
    {
        while(!valueSet)
        {
            System.out.println("Consumer Waiting");
            try
            {
                wait();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        valueSet = false;
        notify();
        System.out.println("Got N "+n);
        return n;
    }
    synchronized void put(int n)
    {
        while(valueSet)
        {
            System.out.println("Producer Waiting");
            try
            {
                wait();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        this.n = n;
        this.valueSet = true;
        System.out.println("Put N "+n);
        notify();
        
    }
}
class CProducer implements Runnable
{
    CQ q;
    Thread t;
    
    CProducer(CQ q)
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
class CConsumer implements Runnable
{
    CQ q;
    Thread t;
    
    CConsumer(CQ q)
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
public class CorrectProducerConsumer {
    public static void main(String[] args) {
        CQ q = new CQ();
        CProducer p = new CProducer(q);
        CConsumer c = new CConsumer(q);
        
        p.t.start();
        c.t.start();
       
        
        
    }
    
}
