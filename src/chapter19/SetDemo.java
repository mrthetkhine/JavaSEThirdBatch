/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter19;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author thetkhine
 */
public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        
        set.add("One");
        set.add("One");
        set.add("Two");
        set.add("Three");
        
        System.out.println("Set "+set.size());
        
        for(String s : set)
        {
            System.out.println(s);
        }
        System.out.println("Set "+set.contains("One"));
    }
}
