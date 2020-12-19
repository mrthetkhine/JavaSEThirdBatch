/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter22;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 *
 * @author thetkhine
 */
public class ExpliclitChanneleWrite {
    public static void main(String[] args) {
        try(FileChannel fChan = (FileChannel)Files.newByteChannel(
                Paths.get("src/chapter22/hello.txt"),
                StandardOpenOption.WRITE,
                StandardOpenOption.CREATE))
        {
            ByteBuffer mBuff = ByteBuffer.allocate(26);
            
            for (int i = 0; i < 26; i++) {
                mBuff.put((byte) ('A'+i));
            }
            mBuff.rewind();
            fChan.write(mBuff);
        }
        catch(Exception e)
        {
            
        }
    }
}
