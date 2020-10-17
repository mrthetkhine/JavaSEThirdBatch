/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter7;

/**
 *
 * @author thetkhine
 */
public class OverloadVarArgs {
    public static void method(int ... args)
    {
        System.out.println("Int method");
        /*
        for(int i=0;i < args.length;i++)
        {
            System.out.println("Int "+args[i]);
        }
        */
        for(int i : args)//readonly
        {
            System.out.println("Int "+i);
        }
            
    }
     public static void method(char ... args)
    {
        System.out.println("Char method");
        for(int i=0;i < args.length;i++)
        {
            System.out.println("Char "+args[i]);
        }
    }
     public static void main(String[] args) {
        method(1,2,3,4);
        method('A','B','C','D');
        method();
    }
}
