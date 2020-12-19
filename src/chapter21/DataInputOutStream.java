/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter21;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thetkhine
 */
public class DataInputOutStream {
    public static void main(String[] args) {
        try(DataOutputStream dOut = new DataOutputStream(new FileOutputStream("test.data")))
        {
            dOut.writeDouble(98.6);
            dOut.writeInt(123);
            dOut.writeBoolean(true);
            
           
        }
        catch(Exception e )
        {
            e.printStackTrace();
        }
        try(DataInputStream dIn = new DataInputStream(new FileInputStream("test.data")))
        {
            double d = dIn.readDouble();
            int i = dIn.readInt();
            boolean b = dIn.readBoolean();
            
            System.out.println("Double "+d +" Int "+i + " Boolean b "+b);
            
           
        }
        catch(Exception e )
        {
            e.printStackTrace();
        }
    }   
}
