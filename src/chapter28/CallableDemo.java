/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter28;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 * @author thetkhine
 */
class Sum implements Callable<Integer>
{
    int stop;
    
    Sum(int stop)
    {
        this.stop = stop;
    }
    
    @Override
    public Integer call() throws Exception {
        int result = 0;
        for (int i = 1; i <= stop; i++) {
            System.out.println("Sum i "+i);
            result += i;
        }
        return result;
    }
}
class Factorial implements Callable<Integer>
{
    int stop;
    
    Factorial(int stop)
    {
        this.stop = stop;
    }
    
    @Override
    public Integer call() throws Exception {
        int result = 1;
        for (int i = 1; i <= stop; i++) {
            System.out.println("Fact i "+i);
            result *= i;
        }
        return result;
    }
}
public class CallableDemo {
    
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);
        
        Future<Integer> sumResult;
        Future<Integer> factorialResult;
        
        System.out.println("Starting");
        sumResult = es.submit(new Sum(15));
        factorialResult = es.submit(new Factorial(10));
        
        try
        {
            System.out.println("Sum result "+ sumResult.get());
            System.out.println("Fac result "+ factorialResult.get());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        es.shutdown();
    }
}
