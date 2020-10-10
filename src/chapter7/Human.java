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
public class Human {
    int age ;
    String name;
    
    Human(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "Human{" + "age=" + age + ", name=" + name + '}';
    }
  
    public static void main(String[] args) {
        Human h1 = new Human("H1",10);
        
        System.out.println("h1 "+h1);
        Human h2 = h1;
        
        h2.age = 40;
        System.out.println("H1 "+ h1);
        System.out.println("H2 "+h2);
        
        h2 = new Human("H2",50);
        h2.age = 100;
        
        System.out.println("H1 "+ h1);
        System.out.println("H2 "+h2);
        
        int a ,b;
        a = 10;
        b = a;
        b++;
        System.out.println("a "+a + " b "+b);
        
    }
}
