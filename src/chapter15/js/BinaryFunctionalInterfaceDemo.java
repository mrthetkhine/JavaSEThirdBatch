/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter15.js;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 *
 * @author thetkhine
 */
public class BinaryFunctionalInterfaceDemo {
    
    public static void main(String[] args) {
        BinaryOperator<Integer> bOp = (a,b)-> a+b;
        
        System.out.println("Result "+ bOp.apply(10, 20));
        
        UnaryOperator<Integer> doubleOp = (a)->a*a;
        System.out.println("Double "+doubleOp.apply(10));
        
        Function<Integer,Integer> fun;
        fun = (a)->{
            System.out.println("Func Invoked a "+ a );
            return a*a;
        };
        System.out.println("Result "+ fun.apply(5));
    }
}
