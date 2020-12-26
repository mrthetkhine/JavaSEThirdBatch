/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter23;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thetkhine
 */
class EchoHandler extends Thread
{
    Socket client;
    EchoHandler(Socket client)
    {
        this.client = client;
        System.out.println("Client Socket Add "+ client.getInetAddress() +" Port "+client.getPort());
        
       
        
    }
    public void run()
    {
        try {
            InputStream in = client.getInputStream();
            BufferedReader bIn  =new BufferedReader(new InputStreamReader(in));
            
            String line = bIn.readLine();
            System.out.println("Server get line "+ line);
            OutputStream out = client.getOutputStream();
            String msg = "Server Echoed "+line +"\r\n";
            out.write(msg.getBytes());
            
            bIn.close();
            out.close();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
public class EchoServer {
    public static void main(String[] args) {
        
        try {
            ServerSocket socket = new ServerSocket(9090);
            
            while(true)
            {
                Socket clientSocket = socket.accept();
                
                EchoHandler handler = new EchoHandler(clientSocket);
                handler.start();
                
                
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
}
