/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter21;

import java.io.CharArrayReader;

/**
 *
 * @author thetkhine
 */
public class CharArrayReaderDemo {
    public static void main(String[] args) {
        String tmp = "Hello";
        int length = tmp.length();
        char c[] = new char[length];
        
        tmp.getChars(0, length, c, 0);
        
        int i;
        try(CharArrayReader input1 =  new CharArrayReader(c))
        {
            while( (i=input1.read())!=-1)
            {
                System.out.print((char)i);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
