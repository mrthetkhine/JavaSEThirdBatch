/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter18;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author thetkhine
 */
class Human implements Comparable
{
    String name;
    int age;
    String school;
    
    Human(String name, int age, String school)
    {
        this.name = name;
        this.age = age;
        this.school = school;
    }

    @Override
    public int compareTo(Object o) {
        Human h = (Human)o;
        return this.age - h.age;
    }

    @Override
    public String toString() {
        return "Human{" + "name=" + name + ", age=" + age + ", school=" + school + '}';
    }
    
}
public class ComparableDemo {
    public static void main(String[] args) {
        ArrayList<Human> humans = new ArrayList<Human>();
        
        humans.add(new Human("Tk",36,"UCSY"));
        humans.add(new Human("One",12,"UCSY"));
        humans.add(new Human("Two",45,"UCSY"));
        
        Collections.sort(humans);
        
        for(Human h : humans)
        {
            System.out.println(h);
        }
        
    }
}
