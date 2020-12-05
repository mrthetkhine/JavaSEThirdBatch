/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter18;

/**
 *
 * @author thetkhine
 */
public class MemoryDemo {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        
        System.out.println("Total Memory "+ r.totalMemory());
        System.out.println("Free Memory "+r.freeMemory());
        
        Integer[]arr = new Integer[100000];
        
        long start = System.currentTimeMillis();
        for(int i=0;i< arr.length;i++)
        {
            arr[i] = new Integer(i);
        }
        System.out.println("After Total Memory "+ r.totalMemory());
        System.out.println("After Free Memory "+r.freeMemory());
        
        arr = null;
        r.gc();
        long end = System.currentTimeMillis();
        System.out.println("Total Memory "+ r.totalMemory());
        System.out.println("Free Memory "+r.freeMemory());
        
        System.err.println("Error");
        
        long time = (end-start)/1000;
        System.out.println("Time in sec "+time);
        
    }
}
