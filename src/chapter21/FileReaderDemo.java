/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter21;

import java.io.FileReader;

/**
 *
 * @author thetkhine
 */
public class FileReaderDemo {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("src/chapter21/FileReaderDemo.java"))
        {
            int c;
            while ( (c=fr.read())!=-1)
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
