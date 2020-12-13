/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author thetkhine
 */
public class FileInputStreamDemo {
    public static void main(String[] args) {
        int size;
        
        try(FileInputStream f = new FileInputStream("src/chapter21/FileDemo.java"))
        {
            size = f.available();
            System.out.println("Total availble size "+ size);
            int n = size /40;
            
            for (int i = 0; i < n; i++) {
                System.out.print((char)f.read());
            }
            System.out.println();
            System.out.println("Availble size "+ f.available());
            
            byte b [] = new byte[n];
            if( f.read(b) != n)
            {
                System.out.println("Could not read file");
            }
            System.out.println(new String(b,0,n));
            System.out.println("Availble size "+ f.available());
            f.skip(size/2);
            System.out.println("Availble size "+ f.available());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
