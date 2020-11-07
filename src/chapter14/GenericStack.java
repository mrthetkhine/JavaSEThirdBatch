/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter14;
import java.util.Stack;
/**
 *
 * @author thetkhine
 */
public class GenericStack {
    public static void main(String[] args) {
        
        Stack<Integer> intStack = new Stack<Integer>();
        
        intStack.add(100);
        //intStack.add("Hello");
        
        intStack.add(200);
        
        Stack<String> strStack = new Stack<String>();
        strStack.add("Hello");
        
        System.out.println("Pop "+strStack.pop());
        Object obj = "Hello";
        
        
    }
}
