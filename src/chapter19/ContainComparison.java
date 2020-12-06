/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author thetkhine
 */
public class ContainComparison {
    public static void main(String[] args) {
        
        List<String> strList = new ArrayList<String>();
        
        for (int i = 0; i < 10000000; i++) {
            strList.add(i+"");
        }
        double start = System.currentTimeMillis();
        boolean contain =  strList.contains("10000000");
        double end = System.currentTimeMillis();
        
        double time = (end-start)/1000;
        System.out.println("List contain Mili sec "+time);
        
        
        Set<String> set = new HashSet<String>();
        for (int i = 0; i < 10000000; i++) {
            set.add(i+"");
        }
        
        start = System.currentTimeMillis();
        contain =  set.contains("10000000");
        end = System.currentTimeMillis();
        
        time = (end-start)/1000;
        System.out.println("Set contain Mili sec "+time);
        
        HashMap<String,String> map = new HashMap<String,String>();
        for (int i = 0; i < 10000000; i++) {
            map.put(i+"",i+"00");
        }
        start = System.currentTimeMillis();
        contain =  map.containsKey("10000000");
        end = System.currentTimeMillis();
        
        time = (end-start)/1000;
        System.out.println("Map contain Mili sec "+time);
      
    }
    
}
