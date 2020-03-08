/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4;

/**
 *
 * @author thetkhine
 */
public class NestedLoop
{
    public static void main(String[] args)
    {
        int arr[][] = {
            {1,2,3},
            {4,5,6,7},
           
        };
        System.out.println("Arr lenght "+arr[0].length);
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                System.out.println("Arr "+i+","+j + " "+ arr[i][j]);
            }
        }
    }
}
