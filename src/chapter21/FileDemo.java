/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter21;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Date;


/**
 *
 * @author thetkhine
 */
class OnlyExt implements FilenameFilter
{
    String ext;
    public OnlyExt(String ext)
    {
        this.ext = "."+ext;
    }
    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(this.ext);
    }
}
public class FileDemo {
    public static void main(String[] args) {
        File f = new File("src/chapter21");
        //File f = new File("src\\chapter21\\FileDemo.java");
        
        System.out.println("File Name "+f.getName());
        System.out.println("Path "+ f.getPath());
        System.out.println("Abs Path "+ f.getAbsolutePath());
        System.out.println("Parent "+ f.getParent());
        System.out.println("isExist "+f.exists());
        System.out.println("Can write "+f.canWrite() +" Read "+ f.canRead()+ " Exe "+ f.canExecute());
        
        System.out.println("Is directory "+ f.isDirectory() + " File "+ f.isFile());
        System.out.println("Last modified size "+ new Date(f.lastModified()));
        System.out.println("File size in byte "+ f.length());
        
        //f.delete();
        
        if( f.isDirectory())
        {
            OnlyExt ext = new OnlyExt("txt");
            String [] list = f.list(ext);
            for (String file : list) {
                
                File newFile = new File(f.getAbsolutePath()+"/"+file);
                if( newFile.isDirectory())
                {
                    System.out.println("Directory "+file);
                }
                else
                {
                    System.out.println("File "+file);
                }
            }
        }
    }
}
