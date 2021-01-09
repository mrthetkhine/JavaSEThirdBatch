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
public class RegStarDemo {
    public static void main(String[] args) {
        //Pattern pattern = Pattern.compile("a*b");
        Pattern pattern = Pattern.compile("a+b");
        Matcher matcher = pattern.matcher("aaaab ab cb");
      
        while(matcher.find())
        {
            System.out.println("Found at "+matcher.start() + " text "+ matcher.group());
        }
    }
}
