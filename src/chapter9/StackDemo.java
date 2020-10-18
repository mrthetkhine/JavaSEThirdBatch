/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter9;

/**
 *
 * @author thetkhine
 */
interface Stack
{
    void push(int item);
    int pop();
            
}
class ArrayStack implements Stack
{

    int data[]= new int[10];
    int top = -1;
    @Override
    public void push(int item) {
        data[++top] = item;
    }

    @Override
    public int pop() {
        return data[top--];
    }
}
class ArrayListStack implements Stack
{

    int size;
    int data[];
    int top = -1;
    public ArrayListStack(int size) {
        this.size = size;
        this.data = new int[size];
    }
    
    
    @Override
    public void push(int item) {
        data[++top] = item;
    }

    @Override
    public int pop() {
        return data[top--];
    }
}
public class StackDemo {
    public static void main(String[] args) {
        Stack stack = new ArrayStack();
        stack.push(10);
        System.out.println("Pop "+stack.pop());
        
        stack = new ArrayListStack(20);
        stack.push(10);
        System.out.println("Pop "+stack.pop());
        
        
    }
}
