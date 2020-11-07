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
public class ObjectStack {
    Object [] arr ;
    int size;
    int top;
    ObjectStack(int size)
    {
        this.size = size;
        this.arr = new Object[size];
        top = -1;
    }
    public void push(Object element)
    {
        this.arr[++top] = element;
    }
    public Object pop()
    {
        return this.arr[top--];
    }
    
    public static void main(String[] args) {
        ObjectStack objectStack = new ObjectStack(10);
        
        objectStack.push(100);
        objectStack.push(200);
        
        System.out.println("Pop "+objectStack.pop());
        System.out.println("Pop "+objectStack.pop()+1);
        
        ObjectStack stringStack = new ObjectStack(10);
        stringStack.push("One");
        stringStack.push("Two");
        
        System.out.println("Pop "+stringStack.pop());
        System.out.println("Pop "+stringStack.pop()+1);
        
        stringStack.push(100);
        System.out.println("Pop "+stringStack.pop());
                
    }
}
