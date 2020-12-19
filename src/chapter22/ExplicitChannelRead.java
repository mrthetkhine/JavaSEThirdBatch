/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter22;

import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author thetkhine
 */
public class ExplicitChannelRead {
    public static void main(String[] args) {
        int count;
        Path filePath =Paths.get("src/chapter22/test.txt");
        
        
        try(SeekableByteChannel fChan = Files.newByteChannel(filePath))
        {
            ByteBuffer mBuff = ByteBuffer.allocate(128);
            
            
            do
            {
                count = fChan.read(mBuff);
                if(count != -1)
                {
                    mBuff.rewind();
                    
                    for (int i = 0; i < count; i++) {
                        System.out.print((char)mBuff.get());
                    }
                }
            }while(count!=-1);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
