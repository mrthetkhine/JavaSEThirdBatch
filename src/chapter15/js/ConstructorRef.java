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
interface MyConFunc{
    MyConClass fun(int n);
}
class MyConClass 
{
    private int val;
    
    MyConClass(int a)
    {
        System.out.println("Consturctor invoked with parameter "+a);
        this.val = a;
    }
    MyConClass()
    {
        this.val = 0;
    }
    int getVal()
    {
        return this.val;
    }
}
public class ConstructorRef {
    public static void main(String[] args) {
        MyConFunc func = MyConClass::new;
        
        MyConClass ret = func.fun(10);
        
        System.out.println("Ret.getValue "+ret.getVal());
    }
}
