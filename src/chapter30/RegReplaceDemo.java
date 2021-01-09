/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter30;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author thetkhine
 */
public class RegReplaceDemo {
    public static void main(String[] args) {
        String str = "Jon Jonathan Frank Ken Told";
        Pattern pattern = Pattern.compile("Jon.*? ");
        Matcher matcher = pattern.matcher(str);
      
        System.out.println("Original sequence "+ str);
        str = matcher.replaceAll("Eric ");
        System.out.println("Modified sequence "+ str);
    }
}
