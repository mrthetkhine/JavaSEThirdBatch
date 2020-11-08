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
public class GenAmbiguity<T,V> {
    
    //static T obj;
    T obj1;
    V obj2;
    
    void set(T obj1)//void set(Object obj1)
    {
        this.obj1 = obj1;
    }
    /*
    void set(V obj2)//void set(Object obj2)
    {
        
    }
*/
}
