/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter29;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author thetkhine
 */
public class AllMatchDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(12);
        list.add(3);
        list.add(3);
        list.add(1);
        list.add(14);
        list.add(-5);
        
        boolean result = list.stream().allMatch(ele-> ele>0);
        
        System.out.println("All greater than zero "+result);
        
        boolean any = list.stream().anyMatch(ele-> ele<0);
        System.out.println("Any negative "+any);
        
        List<Integer> distinct = list.stream().distinct().collect(Collectors.toList());
        System.out.println("Distinct "+distinct);
    }
}
