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
public class RegSplitDemo {
    public static void main(String[] args) {
       
        Pattern pattern = Pattern.compile("[ ,.!]");
        String[] strs = pattern.split("one two,three!done.who");
        for(String st : strs)
        {
            System.out.println(st);
        }
    }
}
