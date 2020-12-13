/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter21;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thetkhine
 */
public class ByteOutputStream {
    public static void main(String[] args) {
        try
        {
            String str ="Some text";
            byte[] b = str.getBytes();
            
            ByteArrayOutputStream bOut = new ByteArrayOutputStream();
            
            try
            {
                bOut.write(b);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            try(FileOutputStream fOut = new FileOutputStream("src/chapter21/hello3.txt"))
            {
                bOut.writeTo(fOut);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            bOut.close();
            
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
        
    }
}
