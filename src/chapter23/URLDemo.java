/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter23;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thetkhine
 */
public class URLDemo {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol");
            
            System.out.println("Protocl "+url.getProtocol());
            System.out.println("Path "+url.getPath());
            
            System.out.println("Host "+url.getHost());
            System.out.println("File "+url.getFile());
            System.out.println("External Form "+url.toExternalForm());
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        }
    }
}
