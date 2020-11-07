/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thetkhine
 */
public class CopyFile {
    
    public static void main(String[] args) {
        FileInputStream fIn = null;
        FileOutputStream fOut = null;
        
        try
        {
            fIn = new FileInputStream("src/chapter13/CopyFile.java");
            fOut = new FileOutputStream("src/chapter13/copy.txt");
            
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
        finally
        {
            if(fIn != null)
            {
                try {
                    fIn.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            if( fOut !=null)
            {
                try {
                    fOut.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
