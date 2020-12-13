/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author thetkhine
 */



public class ResourceBundleDemo {
    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle("SimpleRB");
        
        System.out.println("Eng version "+ rb.getString("title"));
        System.out.println("Stop Text "+ rb.getString("StopText"));
        System.out.println("Start Text "+ rb.getString("StartText"));
        
        ResourceBundle gRb = ResourceBundle.getBundle("SimpleRB",Locale.GERMAN);
        
        System.out.println("Eng version "+ gRb.getString("title"));
        System.out.println("Stop Text "+ gRb.getString("StopText"));
        System.out.println("Start Text "+ gRb.getString("StartText"));
    }
    
}
