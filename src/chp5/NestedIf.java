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
public class NestedIf
{
    public static void main(String[] args)
    {
        boolean isHungry = true;
        boolean hasEnoughMoney = false;
        boolean haveSponsorFriend = true;
        if( isHungry )
        {
            System.out.println("Want to eat");
            if( hasEnoughMoney )
            {
                System.out.println("Eat Hotpot");
            }
            else if( haveSponsorFriend )
            {
               System.out.println("Eat Hotpot with free");
                
            }
            else
            {
                System.out.println("Eat something else");
            }
        }
        else
        {
            System.out.println("Do Nothing");
        }
    }
}
