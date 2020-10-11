/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter7;

/**
 *
 * @author thetkhine
 */
public class Student {
    String name;
    static String headMaster;
    
    Student(String name)
    {
        this.name = name;
    }
    void sayHello()
    {
        System.out.println("I am "+name + " My headmaster is "+ headMaster);
    }
    public static void main(String[] args) {
        Student s1 = new Student("Aung Aung");
        Student s2 = new Student("Hla Hla");
        
        s1.headMaster ="U Tin";
        s1.sayHello();
        s2.sayHello();
        
        s2.headMaster = "U Mya";
         s1.sayHello();
        s2.sayHello();
    }
}
