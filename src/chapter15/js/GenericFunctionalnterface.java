/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter15.js;

/**
 *
 * @author thetkhine
 */
interface SomeFunc<T>
{
    T func(T t);
}
public class GenericFunctionalnterface {
    public static void main(String[] args) {
        SomeFunc<String> reverse = (str)->{
            
            String result = "";
            for (int i = str.length()-1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };
        
        System.out.println("Reverse "+ reverse.func("Hello"));
        
        SomeFunc<Integer> getDouble = (num)->{
            return num* num;
        };
        
        System.out.println("GetDouble "+ getDouble.func(9));
    }
}
