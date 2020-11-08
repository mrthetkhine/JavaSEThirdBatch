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
interface MinMax<T extends Comparable<T>>
{
    T min();
    T max();
}
class MyClass<T extends Comparable<T>> implements MinMax<T>
{

    T[] vals;
    
    MyClass(T[] o)
    {
        this.vals = o;
    }
    
    @Override
    public T min() {
        T value = this.vals[0];
        for (int i = 1; i < vals.length; i++) {
            if(vals[i].compareTo(value) < 0)
            {
                value = vals[i];
            }
        }
        return value;
    }

    @Override
    public T max() {
        T value = this.vals[0];
        for (int i = 1; i < vals.length; i++) {
            if(vals[i].compareTo(value) > 0)
            {
                value = vals[i];
            }
        }
        return value;
    }
}
public class GenericInterfaceDemo {
    public static void main(String[] args) {
        Integer iNums[] = {3,5,6,100,10};
        MyClass myClass = new MyClass(iNums);
        
        System.out.println("Min "+myClass.min());
        System.out.println("Min "+myClass.max());
    }
}
