/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter12;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 *
 * @author thetkhine
 */
@Retention(RetentionPolicy.RUNTIME)
@interface Single
{
    int value();
}
public class SingleMemberAnnotation {
    
    @Single(100)
    public static void method()
    {
        System.out.println("My Method");
    }
    public static void main(String[] args) {
        
    }
}
