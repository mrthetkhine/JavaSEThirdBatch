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
public class Stack
{
    private int stack[] ;
    private int top;
    
    Stack(int size)
    {
        stack = new int[size];
        top = -1;
    }
    void push(int value)
    {
        if( top < stack.length-1)
        {
            stack[++top] = value;
        }
        else
        {
            System.out.println("Cannot push ");
        }
    }
    int pop()
    {
        if(top >=0)
        {
            return stack[top --];
        }
        else
        {
            System.out.println("Cannot pop");
            return -1;
        }
        
    }
    
}
