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
public class ArrayDemo
{
    public static void main(String[] args)
    {
        int dayInMonth[] = new int[12];
        dayInMonth[0] = 31;
        dayInMonth[11]=31;
        
        System.out.println("Arr[0 ]"+dayInMonth[0]);
        System.out.println("Arr[2 ]"+dayInMonth[2]);
        System.out.println("Arr[12 ]"+dayInMonth[12]);
    }
}
