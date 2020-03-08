/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasethird;

/**
 *
 * @author thetkhine
 */
public class ShoppingCard
{
    public static void main(String[] args)
    {
        int quantity[] = new int[]{1,2,3};
        double prices[] = new double[]{3,5,1.5};
        
        double itemOneTotal = quantity[0]*prices[0];
        double itemTwoTotal = quantity[1]*prices[1];
        double itemThreeTotal = quantity[2]*prices[2];
        
        double total = itemOneTotal + itemTwoTotal+ itemThreeTotal ;
        System.out.println("Total "+ total);
        
        
        
    }
}
