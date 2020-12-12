/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter20;

import java.util.Optional;

/**
 *
 * @author thetkhine
 */
public class OptionalDemo {
    public static void main(String[] args) {
        Optional<String> str = Optional.of("Hello");
        Optional<String> str2 = Optional.empty();
       
        System.out.println(" To Uppercase "+(str.isPresent()? str.get().toUpperCase():""));
        System.out.println("To uppercase "+ str2.orElse("Java").toUpperCase());
    }
}
