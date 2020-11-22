/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter29;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author thetkhine
 */
public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        
        List<Integer> doubleList = list
                                    .stream()
                                    .map((ele)->ele*2)
                                    .collect(Collectors.toList());
        
        for(Integer i  :doubleList)
        {
            System.out.println("Item "+i);
        }
    }
}