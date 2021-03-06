/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter28;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

/**
 *
 * @author thetkhine
 */
class SqrtTransform extends RecursiveAction
{
    final int treshold = 2000;
    double[] data;
    int start,end;
    public SqrtTransform(double[] data,int start, int end) {
        this.data = data;
        this.start = start;
        this.end = end;
    }

    
    @Override
    protected void compute() {
        if( (end-start) < treshold)
        {
            //System.out.println("Compute Start "+ start + " end "+end );
            for (int i = start; i < end; i++) {
                data[i] = Math.sqrt(data[i]);
            }
        }
        else
        {
            int middle = (start + end) /2;
            invokeAll(new SqrtTransform(data, start, middle),
                     new SqrtTransform(data, middle, end));
        }
    }
}
public class ForkJoinDemo {
    public static void main(String[] args) {
        long start, end;
        ForkJoinPool pool = new ForkJoinPool(12);
        double nums[] = new double[100000000];
        
        for (int i = 0; i < nums.length; i++) {
           nums[i] = i;
        }
        System.out.println("Portion of original sequence");
        for (int i = 0; i < 10; i++) {
            System.out.print(nums[i]+" ");
        }
        System.out.println("\n");
        
        start = System.nanoTime();
        SqrtTransform sqrt = new SqrtTransform(nums, 0, nums.length);
        pool.invoke(sqrt);
        
        end = System.nanoTime();
        System.out.println("Portion of tranformed sequence");
        for (int i = 0; i < 10; i++) {
            System.out.format("%.4f ",nums[i]);
        }
        System.out.println("\n");
        System.out.println("Avail Processor "+Runtime.getRuntime().availableProcessors());
        System.out.println("Nano sec "+(end-start)/1000+" mili");
        
    }
}
