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

public class MapDemo2 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        
        students.add(new Student("Tk",36));
        students.add(new Student("Mg mg",20));
        students.add(new Student("Aung Aung",25));
        
        
        List<String> names  = students.stream()
                                .map(student->student.name)
                                .collect(Collectors.toList());
        
        for(String name : names)
        {
            System.out.println("Name "+name);
        }
    }
}
