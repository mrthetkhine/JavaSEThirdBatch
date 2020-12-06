/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author thetkhine
 */
public class CollectionDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("One");
        
        List<String> subList = new ArrayList<String>();
        subList.add("Five");
        subList.add("Six");
        
        list.addAll(subList);
        System.out.println("Size "+ list.size());
        
        subList.clear();
        System.out.println("Sub List "+subList.size());
        System.out.println("Is Empty "+subList.isEmpty());
        
        String one = new String("One");
        
        subList.add("Two");
        subList.add("Six");
        System.out.println("Contain "+ list.contains(one));
        
        System.out.println("Sublist contain all "+ list.containsAll(subList));
        
        list.remove("One");
        System.out.println("Size "+list.size());
        for(String s : list)
        {
            System.out.println(s);
        }
        System.out.println("=======");
        list.remove("One");
        System.out.println("Size "+list.size());
        for(String s : list)
        {
            System.out.println(s);
        }
        
        System.out.println("Remove one " + list.remove("One"));
        //list.removeAll(subList);
        
        list.retainAll(subList);
        System.out.println("Retain all from list " );
        for(String s : list)
        {
            System.out.println(s);
        }
        list.add(0,"One");
        System.out.println("Add index 0");
        for(String s : list)
        {
            System.out.println(s);
        }
        System.out.println("Get 0 "+list.get(0));
        System.out.println("IndexOf Six "+list.indexOf("Six"));
        System.out.println("IndexOf Six "+list.indexOf("Seven"));
        
        list.set(0, "Hello");
        for(String s : list)
        {
            System.out.println(s);
        }
        
        List<String> anotherList = list.subList(0, 2);
        System.out.println("SubList");
        Collections.sort(list);
        for(String s : list)
        {
            System.out.println(s);
        }
    }
    
}
