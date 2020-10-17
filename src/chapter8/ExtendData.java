/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter8;

/**
 *
 * @author thetkhine
 */
class Human
{
    String name;
    int age;
    
    public void work()
    {
        System.out.println("Human "+this.name+" works");
    }
}
class Teacher extends Human
{
    String school;
    
    public void work()
    {
        System.out.println("Teacher "+this.name+ " Works at "+this.school);
    }
}
class Doctor extends Human
{
    String speciality;
    
    public void work()
    {
        System.out.println("Doctor "+this.name+ " Works at "+this.speciality);
    }
}
public class ExtendData {
    
    public static void main(String[] args) {
        Teacher h = new Teacher();
        
        h.name = "Saya U Mya";
        h.age = 34;
        h.school = "BEHS 12";
        
        h.work();
        
    }
}
