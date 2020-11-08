/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter14;
import java.util.Stack;
/**
 *
 * @author thetkhine
 */
public class GenInstanceOf {
    public static void main(String[] args) {
          Stack<Integer> intStack = new Stack<>();
          
          System.out.println("intStack "+ (intStack instanceof Stack));
          System.out.println("intStack instanceof Stack<?> "+ (intStack instanceof Stack<?>));
          
          System.out.println("Get class "+ intStack.getClass());
          
         
          //boolean result = (intStack instanceof Stack<Integer>);
          //System.out.println("intStack instanceof Stack<Integer> "+ result);
          
    }
}
