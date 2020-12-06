/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter19;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author thetkhine
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        
        map.put("first", "One");
        map.put("second", "Two");
        
        Set<String> keys = map.keySet();
        for(String key : keys)
        {
            System.out.println("Key "+key +" Value "+ map.get(key));
        }
        System.out.println("Map Contain key "+ map.containsKey("first"));
        System.out.println("NonKey "+ map.get("non-key"));
    }
}
