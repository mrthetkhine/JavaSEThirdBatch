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
        students.add(new Student("Kyaw Kyaw",20));
        
        List<String> names  = students.stream()
                                .filter(student-> student.age>20)
                                .map(student->student.name)
                                .filter(name->name.length()>2)
                                .collect(Collectors.toList());
        
        for(String name : names)
        {
            System.out.println("Name "+name);
            
        }
        
        List<String> resultName = new ArrayList<String>();
        for(Student stu : students)
        {
            resultName.add(stu.name);
        }
        System.out.println("Result "+ resultName);
    }
}
