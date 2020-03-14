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
public class BreakDemo
{
    public static void main(String[] args)
    {
        
        int i=0;
        outerLoop:while (i < 10 )
        {
            System.out.println("I is "+i);
           
            for (int j = 0; j < 10; j++)
            {
                System.out.println("J is "+j);
                if(j == 5)
                {
                    break outerLoop;
                }
                //System.out.println("End of j "+j);
            }
            i++;
        }
        System.out.println("End of loop");
    }
}
