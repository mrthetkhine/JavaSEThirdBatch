/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter14;

/**
 *
 * @author thetkhine
 */
public class Stats<T extends Number> {
    
    T[] nums;
    Stats(T[] nums)
    {
        this.nums = nums;
    }
    double average()
    {
        double avg = 0;
        for(T t:nums)
        {
            avg += t.doubleValue();
        }
        return avg;
    }
    boolean sameAvg(Stats<?> obj)
    {
        return this.average() == obj.average();
    }
    
    public static void main(String[] args) {
        Integer iNums[] = {10,20,30};
        
        Stats<Integer> statIntGen = new Stats<Integer>(iNums);
        System.out.println("Average "+statIntGen.average());
        
        //String []strArr = {"Hello"};
        //Stats<String> strGen = new Stats<String>(strArr);
        Float fArr[]= {10.0f,20.0f,30.0f};
        Stats<Float> floatGen = new Stats<Float>(fArr);
        
        System.out.println("Same Avg "+statIntGen.sameAvg(floatGen));
        
        
    }
}
