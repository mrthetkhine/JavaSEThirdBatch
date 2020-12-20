/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter22;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author thetkhine
 */
public class NIOStreamWrite {
    public static void main(String[] args) {
        try(OutputStream out = Files.newOutputStream(Paths.get("src/chapter22/hello4.txt")))
        {
            for (int i = 0; i < 26; i++) {
                out.write((byte)('a'+i));
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
