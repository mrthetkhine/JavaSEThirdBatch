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
public class ForLoopDemo
{
    public static void main(String[] args)
    {
        for(int i=0; i <5; i++)
        {
            System.out.println("Hello World "+i);
        }
        int arr [] = {10,20,30,40};
        
        System.out.println("Arr.length "+arr.length);
        for(int i=0; i < arr.length; i++)
        {
            System.out.println("Arr "+i+ " "+ arr[i]);
        }
    }
}
