/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter22;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thetkhine
 */
public class PathDemo {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("src/chapter22/hello4.txt");
            
            System.out.println("File Name "+path.getFileName());
            System.out.println("Path "+path);
            System.out.println("Abs Path "+ path.toAbsolutePath());
            System.out.println("Parent "+path.getParent());
            
            if(Files.exists(path))
            {
                System.out.println("File exist");
            }
            else
            {
                System.out.println("File does not exist");
            }
            if( Files.isHidden(path))
            {
                System.out.println("Is Hidden");
            }
            else
            {
                System.out.println("Not hidden");
            }
            if(Files.isWritable(path))
            {
                System.out.println("Writable");
            }
            if(Files.isExecutable(path))
            {
                System.out.println("Executable");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
