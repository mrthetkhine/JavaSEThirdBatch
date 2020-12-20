/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter23;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thetkhine
 */
public class HttpConDemo {
    public static void main(String[] args) {
        try {
            URL url  =new URL("http://www.google.com");
            HttpURLConnection httpConn = (HttpURLConnection)url.openConnection();
            
            System.out.println("Request method "+ httpConn.getRequestMethod());
            System.out.println("Response code "+ httpConn.getResponseCode());
            
            Map<String,List<String>> headers = httpConn.getHeaderFields();
            Set<String> headersKey = headers.keySet();
            
            for (String key : headersKey) {
                System.out.println("Key "+key + " Value "+ headers.get(key));
            }
            System.out.println("Response ");
            System.out.println(httpConn.getResponseMessage());
            
            System.out.println("Content "+ httpConn.getContent());
            InputStream in =  httpConn.getInputStream();
            int c;
            while((c=in.read())!=-1)
            {
                System.out.print((char)c);
            }
            in.close();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
}
