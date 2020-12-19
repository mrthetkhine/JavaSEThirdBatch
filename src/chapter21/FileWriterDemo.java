/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter21;

import java.io.FileWriter;

/**
 *
 * @author thetkhine
 */
public class FileWriterDemo {
    public static void main(String[] args) {
        try(FileWriter fWriter = new FileWriter("src/chapter21/test.txt"))
        {
            String msg ="To change this license header, choose License Headers in Project Properties.\n" +
                    " * To change this template file, choose Tools | Templates\n" +
                    " * and open the template in the editor.";
            fWriter.write(msg);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
