/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter21;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thetkhine
 */
public class OutputStreamDemo {
    public static void main(String[] args) {
        String source = "Java programming language";
        
        
        try(FileOutputStream fOut = new FileOutputStream("src/chapter21/hello2.txt"))
        {
            fOut.write(source.getBytes());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
