/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thetkhine
 */
public class EchoClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to send to server");
        
        String line = scanner.nextLine()+"\r\n";
        
        try {
            Socket client = new Socket("localhost",9090);
            
            OutputStream out = client.getOutputStream();
            out.write(line.getBytes());
            out.flush();
            
            InputStream in = client.getInputStream();
            BufferedReader bIn  =new BufferedReader(new InputStreamReader(in));
            
            line = bIn.readLine();
            System.out.println("Server returned ");
            System.out.println(line);
            
            bIn.close();
            out.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
