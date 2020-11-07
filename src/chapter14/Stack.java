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
public class Stack {
    int [] arr ;
    int size;
    int top;
    Stack(int size)
    {
        this.size = size;
        this.arr = new int[size];
        top = -1;
    }
    public void push(int element)
    {
        this.arr[++top] = element;
    }
    public int pop()
    {
        return this.arr[top--];
    }
    
    public static void main(String[] args) {
        Stack stack = new Stack(10);
        
        stack.push(100);
        stack.push(200);
        
        System.out.println("Pop "+stack.pop());
        System.out.println("Pop "+stack.pop());
                
    }
}
