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
public class StackDemo {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        //stack.top = 10;
        stack.push(20);
        
        System.out.println("Stack pop "+stack.pop());
        System.out.println("Stack pop "+stack.pop());
    }
}
