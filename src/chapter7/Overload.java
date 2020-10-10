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
/*
Method vs Function
signature = method name + list of parameter and their type their order
prototype = return type+ signature

method overloading 
must have same method name
parameters
    -type of parameter  
    -number of parameter
    -order of parameter
*/
public class Overload {
    
    static void display(int a)
    {
        System.out.println("integer display "+a);
    }
    static void display(String str)
    {
        System.out.println("String display "+str);
    }
    static void display(double d)
    {
        System.out.println("double display "+d);
    }
    public static void main(String[] args) {
        
        display(10);
        display("Hello");
        display(12.2);
        
    }
}
