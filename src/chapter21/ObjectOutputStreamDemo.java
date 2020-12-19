/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter21;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/**
 *
 * @author thetkhine
 */
public class ObjectOutputStreamDemo {

    public ObjectOutputStreamDemo(FileOutputStream fileOutputStream) {
    }
    public static void main(String[] args) {
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ourobject.data")))
        {
            OurHuman h = new OurHuman("Aung Lwin",34);
            out.writeObject(h);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("ourobject.data")))
        {
            OurHuman h = (OurHuman)in.readObject();
            System.out.println(h);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
            
    }
}
