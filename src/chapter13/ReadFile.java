/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thetkhine
 */
public class ReadFile {
    
    //Refactoring.
    private static void readFile(String fileName) throws IOException {
        int i;
        FileInputStream fin  = null;
        try {
            //File f = new File(".");
            //System.out.println("Path "+f.getAbsolutePath());
            fin = new FileInputStream(fileName);
            
            do
            {
                i = fin.read();
                if(i != -1)
                {
                    System.out.print((char)i);
                }
            }
            while(i!=-1);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        finally
        {
            System.out.println("Fin "+fin);
            if(fin != null)
            {
                fin.close();
            }
        }
    }
    public static void main(String[] args) throws IOException {
        //readFile("src/chapter13/ReadFile.java");
        readFile("src/chapter13/ReadConsole.java");
    }

    
}
