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
public class VarLengthArg {
    
    public static void method(char ch, int ...args)
    {
        for(int i=0;i < args.length;i++)
        {
            System.out.println("Arg "+args[i]);
        }
    }
    public static void main(String[] args) {
        method('A',1,2);
        method('C',1,2,3,4,5);
        System.out.printf("%f Hello %f %s",1.2,1.4, "How are you");
    }
}
