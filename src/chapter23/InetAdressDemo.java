/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter23;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thetkhine
 */
public class InetAdressDemo {
    public static void main(String[] args) {
        try {
            InetAddress localhost = InetAddress.getLocalHost();
            System.out.println("Localhost "+localhost);
            
            InetAddress google = InetAddress.getByName("www.google.com");
            System.out.println("Google "+google);
            
            InetAddress[] all = InetAddress.getAllByName("www.google.com");
            for(InetAddress addr : all)
            {
                System.out.println("Inet Addr "+addr);
            }
            
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        }
        
        
    }
}
