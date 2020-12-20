/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter23;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thetkhine
 */
public class WhoIsDemo {
    public static void main(String[] args) {
        try {
            int c;
            
            Socket socket = new Socket("rs.internic.net",43);//Connect
            System.out.println("Connect ok");
            InputStream in = socket.getInputStream();
            OutputStream out = socket.getOutputStream();
            
            String host = "google.com";
            byte[] bytes = host.getBytes();
            out.write(bytes);//Data send 
            
            while ((c=in.read())!=-1)//Data Received
            {
                System.out.print((char)c);
            }
            
            socket.close();
        } catch (IOException ex) {
           ex.printStackTrace();
        }
        
    }
}
