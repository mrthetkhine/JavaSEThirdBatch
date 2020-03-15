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
public class StackDemo
{
    public static void main(String[] args)
    {
        Stack stack = new Stack(10);
        
        //stack.top= -5;
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        System.out.println("Stack.pop "+stack.pop());
        System.out.println("Stack.pop "+stack.pop());
        System.out.println("Stack.pop "+stack.pop());
    }
}
