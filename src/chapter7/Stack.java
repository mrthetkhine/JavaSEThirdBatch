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
public class Stack {
    private int data[] = new int[10];
    private int top = -1;
    
    public void push(int data)
    {
        this.data[++top] = data;
    }
    public int pop()
    {
        return this.data[top--];
    }
}
