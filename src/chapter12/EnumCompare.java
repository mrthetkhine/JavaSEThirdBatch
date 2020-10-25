/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter12;

enum User
{
    JUNIOR_DEV,SENIOR_DEV,TEAM_LEAD,PROJECT_MANAGER,IT_HEAD,CTO
}
        
/**
 *
 * @author thetkhine
 */
public class EnumCompare {
    public static void main(String[] args) {
        User u1 = User.JUNIOR_DEV;
        User u2 = User.IT_HEAD;
        User u3 = User.CTO;
        
        System.out.println("User u1 "+ u1.ordinal());
        System.out.println("User u2 "+ u2.ordinal());
        System.out.println("u1.compareTo(u2) "+ u1.compareTo(u2));
        System.out.println("u3.compareTo(u1) "+ u3.compareTo(u1));
        
    }
}
