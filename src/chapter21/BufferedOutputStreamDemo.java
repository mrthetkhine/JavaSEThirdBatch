/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter21;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thetkhine
 */
public class BufferedOutputStreamDemo {

    public static void main(String[] args) {
     
        try (BufferedInputStream bIn = new BufferedInputStream(new FileInputStream("src/chapter21/FileDemo.java"));
                BufferedOutputStream bOut = new BufferedOutputStream(new FileOutputStream("src/chapter21/hello.txt"))) {
            int c;
            while ((c = bIn.read()) != -1) {
                System.out.print((char) c);
                bOut.write(c);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
