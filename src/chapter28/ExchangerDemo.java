/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter28;

import java.util.concurrent.Exchanger;

/**
 *
 * @author thetkhine
 */
class MakeString extends Thread
{
    Exchanger<String> exchanger;
    String str;
    
    MakeString(Exchanger<String> ex)
    {
        this.exchanger = ex;
        str = "";
    }
    public void run()
    {
        char ch = 'A';
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                str += ch++;
            }
            try
            {
                System.out.println("Maker Exchange "+str);
                str = this.exchanger.exchange(str);
                
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            
            
        }
    }
}
class UseString extends Thread
{
    Exchanger<String> exchanger;
    String str;
    
    UseString(Exchanger<String> ex)
    {
        this.exchanger = ex;
       
    }
    public void run()
    {
        for (int i = 0; i < 3; i++) {
            try
            {
                str = this.exchanger.exchange(new String());
                System.out.println("Got string "+str);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            
            
        }
    }
}
public class ExchangerDemo {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<String>();
        
        MakeString ms = new MakeString(exchanger);
        UseString us = new UseString(exchanger);
        
        us.start();
        ms.start();
        
    }
}
