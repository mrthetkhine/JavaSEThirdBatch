/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter14;

/**
 *
 * @author thetkhine
 */
public class KeyValue<K,V> {
    K key;
    V value;
    
    public KeyValue(K k, V v)
    {
        this.key = k;
        this.value = v;
    }
    
    public void setKey(K k)
    {
        this.key = k;
    }
    public void setValue(V v)
    {
        this.value = v;
    }
    public K getKey()
    {
        return this.key;
    }
    public V getValue()
    {
        return this.value;
    }
    public static void main(String[] args) {
        KeyValue<String,Integer> strInteger = new KeyValue<String,Integer>("key1",100);
        
        System.out.println("Key "+strInteger.getKey());
        System.out.println("Value "+strInteger.getValue());
        
        KeyValue<String,String> strStr = new KeyValue<String,String>("myKey","myValue");
        System.out.println("Key "+strStr.getKey());
        System.out.println("Value "+strStr.getValue());
    }
    
}
