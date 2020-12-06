/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter18;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author thetkhine
 */
class Persons implements Iterable
{
    ArrayList<Human> humans;
    Persons()
    {
        humans = new ArrayList<Human>();
        
        humans.add(new Human("Tk",36,"UCSY"));
        humans.add(new Human("One",12,"UCSY"));
        humans.add(new Human("Two",45,"UCSY"));
    }

    @Override
    public Iterator iterator() {
        return humans.iterator();
    }
    
}
public class IteratableDemo {
    public static void main(String[] args) {
        Persons person = new Persons();
        
        for(Object o : person)
        {
            Human h = (Human)o;
            System.out.println(h);
        }
    }
}
