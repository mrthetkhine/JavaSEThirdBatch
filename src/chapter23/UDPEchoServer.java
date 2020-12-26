/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter23;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 *
 * @author thetkhine
 */
class Handler extends Thread
{
    DatagramPacket packet ;
    Handler(DatagramPacket packet)
    {
        this.packet = packet;
    }
    @Override
    public void run()
    {
        String input = new String(this.packet.getData(), 0,packet.getLength());
        System.out.println("Get data from server "+input);
    }
}

        
public class UDPEchoServer {
    public static void main(String[] args) {
        DatagramSocket server = null;
 
        try
        {
            server = new DatagramSocket(9090);
            
            while(true)
            {
                byte buffer[] = new byte[1024];
                DatagramPacket datagramPacket = new
                DatagramPacket(buffer, buffer.length);
                server.receive(datagramPacket);

                Handler handler = new Handler(datagramPacket);
                handler.start();
            }
            
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
