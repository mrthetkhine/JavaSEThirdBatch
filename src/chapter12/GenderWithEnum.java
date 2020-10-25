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
enum EGender
{
    MALE,FEMALE;
}
public class GenderWithEnum {
    public static void main(String[] args) {
        EGender mgMgGender = EGender.MALE;
        
        if( mgMgGender == EGender.MALE)
        {
            System.out.println("Male "+ mgMgGender);
        }
        switch(mgMgGender)
        {
            case MALE:
                System.out.println("Male");
                break;
            case FEMALE:
                System.out.println("Female");
                break;
        }
        EGender myaMyaGender = EGender.valueOf("FEMALE");
        System.out.println("Gender of Mya Mya "+myaMyaGender);
        
        EGender[]allGender = EGender.values();
        for(EGender gender : allGender)
        {
            System.out.println("Gender "+gender);
        }
    }
}
