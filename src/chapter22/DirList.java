/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter22;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

/**
 *
 * @author thetkhine
 */
public class DirList {
    public static void main(String[] args) {
        Path path = Paths.get("src/chapter22");
        
        try(DirectoryStream<Path> dir = Files.newDirectoryStream(path))
        {
            for(Path entry :dir)
            {
                BasicFileAttributes attr =  Files.readAttributes(entry, BasicFileAttributes.class);
                if(attr.isDirectory())
                {
                    System.out.print("DIR");
                }
                else
                {
                    System.out.print("   ");
                }
                System.out.println("");
                System.out.println(entry);
            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
            
    }
}
