/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter22;

import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author thetkhine
 */
public class MapChannelRead {
    public static void main(String[] args) {
        try(FileChannel fChan = (FileChannel)Files.newByteChannel(Paths.get("src/chapter22/test.txt")))
        {
            long fSize = fChan.size();
            MappedByteBuffer mBuf = fChan.map(FileChannel.MapMode.READ_ONLY, 0, fSize);
            
            for (int i = 0; i < fSize; i++) {
                System.out.print((char)mBuf.get());
            }
            byte b = 0;
            //mBuf.put(b);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
