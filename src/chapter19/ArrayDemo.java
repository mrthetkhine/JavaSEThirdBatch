/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter19;

import java.util.Arrays;

/**
 *
 * @author thetkhine
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int arr[] = {100,20,30,40,50};
        
        System.out.println("Array Binary Search "+ Arrays.binarySearch(arr, 30));
        int newArr[] = Arrays.copyOf(arr, 3);
        System.out.println("New Array "+newArr);
        for(int a : newArr)
        {
            System.out.println(a);
        }
        int range[] = Arrays.copyOfRange(arr, 1, 3);
        System.out.println("Range Array ");
        for(int a : range)
        {
            System.out.println(a);
        }
        
        int arr2[] = {10,20,30,40,50};
        System.out.println("Equal "+ Arrays.equals(arr,arr2));
        int minusArr [] = new int[3];
        Arrays.fill(minusArr,-100);
        
        for(int i : minusArr)
        {
            System.out.println(i);
        }
        System.out.println("Sorted");
        Arrays.sort(arr);
        for(int a : arr)
        {
            System.out.println(a);
        }
    }
    
}
