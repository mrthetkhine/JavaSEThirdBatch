/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter21;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thetkhine
 */
class InputStreamEnumerator implements Enumeration<FileInputStream>{

    private Enumeration<String> files;
    
    InputStreamEnumerator(Vector<String> files)
    {
        this.files = files.elements();
    }
    @Override
    public boolean hasMoreElements() {
        return this.files.hasMoreElements();
    }

    @Override
    public FileInputStream nextElement() {
        
        try
        {
            return new FileInputStream(files.nextElement().toString());
        }
        catch(Exception e)
        {
            return null;
        }
        
    }
}
public class SequenceInputStreamDemo {
    public static void main(String[] args) {
        int c;
        Vector<String> files = new Vector<String>();
        files.addElement("src/chapter21/hello.txt");
        files.addElement("src/chapter21/hello2.txt");
        files.addElement("src/chapter21/hello3.txt");
        
        InputStreamEnumerator ise = new InputStreamEnumerator(files);
        InputStream input = new SequenceInputStream(ise);
        try
        {
            while ( (c = input.read())!=-1)
            {
                System.out.print((char)c);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try {
                input.close();
            } catch (IOException ex) {
                Logger.getLogger(SequenceInputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
