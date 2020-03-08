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
        String arr [] = {"Orange","Apple","Banana"};
        
        System.out.println("Arr.length "+arr.length);
        for(final String ele : arr)
        {
            //ele = "";
            System.out.println("Arr  "+ele);
        }
        System.out.println("Arr 0 "+ arr[0]);
        System.out.println("Arr 1 "+ arr[1]);
    }
}
