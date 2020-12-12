/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter20;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author thetkhine
 */
class MyTask extends TimerTask
{

    @Override
    public void run() {
        System.out.println("Run some batch job");
    }
    
}
public class TimeTaskDemo {
    
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Timer timer = new Timer();
        
        timer.schedule(task, 1000,500);
        
        try
        {
            Thread.sleep(5000);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        timer.cancel();
        
    }
}
