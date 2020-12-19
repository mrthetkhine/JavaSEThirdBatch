/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter21;

import java.io.Serializable;

/**
 *
 * @author thetkhine
 */
public class OurHuman implements Serializable{
    String name;
    int age;
    
    public OurHuman(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "OurHuman{" + "name=" + name + ", age=" + age + '}';
    }
    
}
