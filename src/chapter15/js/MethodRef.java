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
interface StringFunc
{
    String operation(String str);
            
}
public class MethodRef {
    static String toLower(String str)
    {
        return str.toLowerCase();
    }
    String toUpper(String str)
    {
        return str.toUpperCase();
    }
    static void method(StringFunc fun, String par)
    {
        String result = fun.operation(par);
        System.out.println("Result "+result);
    }
    public static void main(String[] args) {
        
        MethodRef obj = new MethodRef();
        
        method(MethodRef::toLower,"HELLO");
        method(obj::toUpper,"hello");
        
       
    }
}
