/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author thetkhine
 */
public class ReadConsole {
    public static void main(String[] args) throws IOException {
        String c;
        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(System.in));
        
        do
        {
            c = br.readLine();
            System.out.println("Str "+c);
            
            
        }while(! "stop".equals(c));
    }
}
