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
public class GenericStatic<T> {
    
    static int count =0;
    T data;
    
    GenericStatic(T data)
    {
        count ++;
    }
    
    public static void main(String[] args) {
        GenericStatic<String> gString = new GenericStatic<String>("Hello");
        GenericStatic<Integer> iString = new GenericStatic<>(100);
        
        System.out.println("Count "+ gString.count);
    }
}
