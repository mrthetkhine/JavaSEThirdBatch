/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4;

import java.util.Scanner;

/**
 *
 * @author thetkhine
 */
public class FindInArray
{
    public static void main(String[] args)
    {
        int arr[] = {10,20,29,30,35,40, 45};
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter number to find");
        int input = scanner.nextInt();
        
        System.out.println("Number is "+ input);
        
        boolean found = false;
        
        int index = 0;
        while( !found && index < arr.length)
        {
            if( arr[index] == input)
            {
                System.out.println("Found "+ input +" At index "+index);
                found = true;
            }
            index ++;
        }
    }
}
