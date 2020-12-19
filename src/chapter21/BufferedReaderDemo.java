/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter21;

import java.io.BufferedReader;
import java.io.CharArrayReader;

/**
 *
 * @author thetkhine
 */
public class BufferedReaderDemo {
    public static void main(String[] args) {
        String s = "This is a string";
        
        char buf[] = new char[s.length()];
        s.getChars(0, s.length(), buf, 0);
        
        CharArrayReader in = new CharArrayReader(buf);
        
        int c;
        try(BufferedReader bReader = new BufferedReader(in))
        {
            while( (c= bReader.read())!=-1)
            {
                System.out.print((char)c);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
