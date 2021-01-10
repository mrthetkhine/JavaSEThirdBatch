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
public class RegEmail {
    public static void main(String[] args) {
        
        Pattern pattern = Pattern.compile("\\w+@\\w+\\.[a-zA-Z]{3}");
        Matcher matcher = pattern.matcher("thetkhine@gmail.com meail.com");
      
        while(matcher.find())
        {
            System.out.println("Found at "+matcher.start() + " matched word "+ matcher.group());
        }
    }
}
