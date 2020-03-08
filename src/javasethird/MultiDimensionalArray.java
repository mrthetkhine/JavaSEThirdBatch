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
public class MultiDimensionalArray
{
    public static void main(String[] args)
    {
        int multi[][] = new int[][]{
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
        };
        System.out.println("Arr[] "+ multi[1][3] * multi[2][0]);
    }
}
