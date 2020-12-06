/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author thetkhine
 */
public class AlgorithmDemo {
    public static void main(String[] args) {
        List<String> str = new ArrayList<String>();
        
        str.add("One");
        str.add("Two");
        str.add("Three");
        str.add("Four");
        str.add("Five");
        
        Comparator<String> r = Collections.reverseOrder();
        
        Collections.sort(str, r);
        for(String s : str)
        {
            System.out.println(s);
        }
        
        Collections.shuffle(str);
        System.out.println("========");
        for(String s : str)
        {
            System.out.println(s);
        }
        System.out.println("Min "+ Collections.min(str));
        System.out.println("Max "+ Collections.max(str));
        
        
    }
}
