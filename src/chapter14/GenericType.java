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
public class GenericType<T> {
    
   T obj;
   GenericType(T obj)
   {
       this.obj = obj;
   }

   
   T getData()
   {
       return this.obj;
   }
   void setData(T obj)
   {
       this.obj = obj;
   }
    public static void main(String[] args) {
        GenericType<Integer> data = new GenericType<Integer>(10);
        
        //data.setData("Hello");
        System.out.println("get data "+data.getData());
        
        GenericType<String> dataStr = new GenericType<String>("String");
        dataStr.setData("Hello");
        
        System.out.println("get data "+dataStr.getData());
    }
}
