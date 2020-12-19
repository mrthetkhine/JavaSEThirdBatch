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
import java.nio.file.StandardOpenOption;

/**
 *
 * @author thetkhine
 */
public class MapChannelWrite {
    public static void main(String[] args) {
        try(FileChannel fChan = (FileChannel)Files.newByteChannel(
                Paths.get("src/chapter22/hello2.txt"),
                StandardOpenOption.WRITE,
                StandardOpenOption.READ,
                StandardOpenOption.CREATE
                ))
        {
            long fSize = 26;
            MappedByteBuffer mBuf = fChan.map(FileChannel.MapMode.READ_WRITE, 0, fSize);
            
            for (int i = 0; i < 26; i++) {
                mBuf.put((byte)('A'+i));
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
