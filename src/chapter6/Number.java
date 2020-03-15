/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter6;

/**
 *
 * @author thetkhine
 */
public class Number
{
   private double value;
   
   Number(double value)
   {
       this.value = value;
   }
   Number add(Number b)
   {
       double valueC = this.value + b.value;
       Number c = new Number(valueC);
       return c;
   }
   Number inc()
   {
       this.value ++;
       return this;
   }
   double getValue()
   {
       return this.value;
   }
    public static void main(String[] args)
    {
        Number a = new Number(10);
        Number b = new Number(20);
        Number c = a.add(b);
        c.inc();
        
        System.out.println("C "+ c.getValue());
    }
    
}
