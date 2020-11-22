/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter29;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;

/**
 *
 * @author thetkhine
 */
public class IteratorDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        
        students.add(new Student("Tk",36));
        students.add(new Student("Mg mg",20));
        students.add(new Student("Aung Aung",25));
        students.add(new Student("Kyaw Kyaw",20));
        
        Stream<Student> studentsStream = students.stream();
        Iterator<Student> studentIterator = studentsStream.iterator();
        
        while(studentIterator.hasNext())
        {
            System.out.println("Item "+studentIterator.next().name);
        }
        
        Spliterator<Student> sIterator =students.stream().spliterator();
        Spliterator<Student> sIterator2 = sIterator.trySplit();
        
        while(sIterator2.tryAdvance((stu)->System.out.println(stu.name)));
    }
}
