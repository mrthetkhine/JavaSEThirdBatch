/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter23;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thetkhine
 */
public class UCDemo {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol");
            
            URLConnection conn = url.openConnection();
            long date = conn.getDate();
            
            if(date == 0)
            {
                System.out.println("No Date");
            }
            else
            {
                System.out.println("Date "+ new Date(date));
            }
            long len = conn.getContentLengthLong();
            if(len !=0)
            {
                InputStream in =  conn.getInputStream();
                int c;
                while((c=in.read())!=-1)
                {
                    System.out.print((char)c);
                }
                in.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
