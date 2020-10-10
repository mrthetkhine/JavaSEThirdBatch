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
public class ParameterPassing {
    
    static void changeData(int a)
    {
        a= 100;
    }
    static void changeObjectData(Human paramH)
    {
        paramH.age = 100;
    }
    static void changeRefItselft(Human obj)
    {
        obj = new Human("H2 Changed",200);
    }
    public static void main(String[] args) {
        
        int data = 200;
        
        changeData(data);
        System.out.println("A "+data);
        
        Human h = new Human("H1",10);
        changeObjectData(h);
        
        System.out.println("h "+h);
        
        changeRefItselft(h);
        System.out.println("h "+h);
        /*
        int a , b;
        a = 10;
        b = a;
        a ++ ;
        System.out.println("A "+a + " B "+b);        
        */
    }
}
