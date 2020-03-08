/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chp5;

/**
 *
 * @author thetkhine
 */
public class IfDemo
{
    public static void main(String[] args)
    {
        boolean isObstacle = false;
        boolean isRedSign = true ;
        
        boolean stop = isObstacle || isRedSign;
        
        System.out.println("Robot is going");
        
        if( stop )
        {
            System.out.println("Stop");
            System.out.println("Rest");
        }
        else
        {
            System.out.println("Go");
        }
        
        System.out.println("After all");
        
        boolean isHungry = false;
        if( isHungry )
        {
            System.out.println("Eat");
        }
    }
}
