/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter6;

/**
 *
 * @author thetkhine
 */
public class Doctor
{
    String name, position, phoneNo;
    
    Doctor(String name, String position, String phoneNo)
    {
        this(name,position);
        this.phoneNo = phoneNo; 
        System.out.println("3 Argument Contructor run");
    }
    Doctor(String name, String position)
    {
        this.name = name;
        this.position = position;
        System.out.println("2 Argument Contructor run");
    }
    
    void show()
    {
        System.out.println("----------------------------");
        System.out.println("Doctor Name Dr "+name);
        System.out.println("Doctor Position "+position.toUpperCase());
        System.out.println("Doctor Phone no "+phoneNo);
        
    }
    
    void singSong(String song)
    {
        System.out.println(this.name +" sing Song "+song);
    }
    
    public static void main(String[] args)
    {
        Doctor uPhyu = new Doctor("U Phyu","Surgical Doctor");   
        Doctor uMae = new Doctor("U Mae","Surgical Doctor","999");
       
        System.out.println("UPhyu "+ uPhyu);
        uPhyu.show();
        uMae.show();
        
        uPhyu.singSong("Mya Nanda");
        uMae.singSong("Another Song");
        
       
    }
}
