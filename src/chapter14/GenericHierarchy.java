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
class Parent<T>{
    T obj;
    
    Parent(T obj)
    {
        this.obj = obj;
    }
    
    T getObj()
    {
        System.out.println("Get class "+obj.getClass());
        return this.obj;
    }
}
class Child<T> extends Parent<T>
{
    Child(T obj)
    {
        super(obj);
    }
}
public class GenericHierarchy {
    public static void main(String[] args) {
        Child<Integer> child = new Child<Integer>(100);
        System.out.println("Get "+child.getObj());
    }
}
