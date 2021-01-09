/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter28;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;

/**
 *
 * @author thetkhine
 */
class RecSum extends RecursiveTask<Double>
{
    final int treshold = 500;
    double[] data;
    int start,end;
    public RecSum(double[] data,int start, int end) {
        this.data = data;
        this.start = start;
        this.end = end;
    }

    
    @Override
    protected Double compute() {
        double sum = 0;
        if( (end-start) < treshold)
        {
            //System.out.println("Compute Start "+ start + " end "+end );
            for (int i = start; i < end; i++) {
                sum+= data[i];
            }
        }
        else
        {
            int middle = (start + end) /2;
            RecSum a = new RecSum(data,start,middle);
            RecSum b = new RecSum(data,middle,end);
            
            a.fork();
            b.fork();
            
            sum = a.join() + b.join();
                    
        }
        return sum;
    }
}
public class ForkJoinTask {
    public static void main(String[] args) {
        long start, end;
        ForkJoinPool pool = new ForkJoinPool(12);
        double nums[] = new double[100000000];
        
        for (int i = 0; i < nums.length; i++) {
           nums[i] = i;
        }
       
        start = System.nanoTime();
        RecSum sqrt = new RecSum(nums, 0, nums.length);
        double sum = pool.invoke(sqrt);
        
        end = System.nanoTime();
        
        System.out.println("Sum is "+sum);
    }
}
