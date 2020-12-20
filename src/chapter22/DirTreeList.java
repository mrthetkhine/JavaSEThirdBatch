/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter22;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
/**
 *
 * @author thetkhine
 */
class MyFileVisitor extends SimpleFileVisitor<Path>{
    public FileVisitResult visitFile(Path path, BasicFileAttributes attribs)
            throws IOException
    {
        System.out.println(path);
        return FileVisitResult.CONTINUE;
    }
}
public class DirTreeList {
    public static void main(String[] args) {
        
         Path path = Paths.get("src");
         System.out.println("Directory starting");
         
         try
         {
             Files.walkFileTree(path, new MyFileVisitor());
         }
         catch(Exception e)
         {
             e.printStackTrace();
         }
        
    }
}
