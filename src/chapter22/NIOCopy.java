/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter22;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author thetkhine
 */
public class NIOCopy {
    public static void main(String[] args) {
        String src = "src/chapter22/hello2.txt";
        String dest = "src/chapter22/hello3.txt";
        
        try
        {
            Path source = Paths.get(src);
            Path destPath = Paths.get(dest);
            
            Files.copy(source, destPath, StandardCopyOption.REPLACE_EXISTING);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
}
