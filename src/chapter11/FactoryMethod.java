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
class NewThread extends Thread
{
    String name;
    NewThread(String name)
    {
        this.name = name;
    }
    public void run()
    {
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread "+this.name+" I "+i);
        }
    }
}
public class FactoryMethod {
    public static NewThread createAndStartThread(String name)
    {
        NewThread th = new NewThread(name);
        th.start();
        return th;
    }
    public static void main(String[] args) {
        NewThread t1 = createAndStartThread("TOne");
        NewThread t2 = createAndStartThread("TTwo");
        
    }
}
