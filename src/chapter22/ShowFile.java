/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter22;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author thetkhine
 */
public class ShowFile {
    public static void main(String[] args) {
        try(InputStream in = Files.newInputStream(Paths.get("src/chapter22/hello2.txt")))
        {
            int i;
            while( (i= in.read()) !=-1)
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
