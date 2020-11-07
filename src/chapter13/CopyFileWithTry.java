/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author thetkhine
 */
public class CopyFileWithTry {
    public static void main(String[] args) {
       
        try(FileInputStream fIn = new FileInputStream("src/chapter13/CopyFile.java");
            FileOutputStream fOut = new FileOutputStream("src/chapter13/copy2.txt"))
        {         
            int i;
            do
            {
                i = fIn.read();
                if(i != -1)
                {
                    fOut.write(i);
                }
                
            }while(i!=-1);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    
    }
    
}
