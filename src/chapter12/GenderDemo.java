/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter12;

/**
 *
 * @author thetkhine
 */
interface Gender
{
    int MALE = 0;
    int FEMALE =1;
}
public class GenderDemo {
    
    public static void main(String[] args) {
        int mgMgGender = Gender.MALE;
        //mgMgGender = 100;
        System.out.println("Male "+mgMgGender);
    }
}
