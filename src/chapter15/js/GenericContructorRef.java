/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter15.js;

/**
 *
 * @author thetkhine
 */
interface MyGenConFunc<T>{
    MyGenClass <T> fun(int n);
}
class MyGenClass<T>
{
    private T val;
    MyGenClass(T va)
    {
        val = va;
    }
    MyGenClass()
    {
        val = null;
    }
    T getVal()
    {
        return val;
    }
}
public class GenericContructorRef {
    public static void main(String[] args) {
        
        MyGenConFunc<Integer> fun = MyGenClass<Integer>::new;
        MyGenClass<Integer> obj = fun.fun(100);
        
        System.out.println("Obj.getValue "+obj.getVal());
        
    }
}
