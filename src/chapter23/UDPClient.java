/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter23;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thetkhine
 */
public class UDPClient {
    public static void main(String[] args) {
        
        try {
            DatagramSocket server = new DatagramSocket((int) ((Math.random()*100)+9090));
            byte buffer[] = ("Client "+Math.random()).getBytes();
            DatagramPacket packet = new
                    DatagramPacket(buffer, buffer.length,InetAddress.getLocalHost(),9090);
            
            
            server.send(packet);
            server.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            
        }
            
    }
}
