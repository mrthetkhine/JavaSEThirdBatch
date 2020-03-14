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
    
    
    void show()
    {
        System.out.println("----------------------------");
        System.out.println("Doctor Name Dr "+name);
        System.out.println("Doctor Position "+position);
        System.out.println("Doctor Phone no "+phoneNo);
        
    }
    
    public static void main(String[] args)
    {
        Doctor uPhyu = new Doctor();
        uPhyu.name = "U Phyu";
       // uPhyu.position = "Surgical Doctor";
        uPhyu.phoneNo = "12233";
        
        Doctor uMae = new Doctor();
        uMae.name = "U Mae";
        uMae.position = "Surgical Doctor";
        uMae.phoneNo = "99111";
        
        uPhyu.show();
        
        uMae.show();
        
       
    }
}
