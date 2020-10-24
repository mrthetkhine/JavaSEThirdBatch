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
public class MainThread {
    public static void main(String[] args) {
        Thread th = Thread.currentThread();
        System.out.println("Main Thread "+ th.getName());
        System.out.println("Get class "+th.getClass());
        System.out.println("Priority "+th.getPriority());
        
        try
        {
            for (int i = 0; i < 10; i++) {
                System.out.println("Running "+i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
