/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter18;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thetkhine
 */
public class RuntimeDemo {
    public static void main(String[] args) {
        try {
            Runtime.getRuntime().exec("open /Applications/Calculator.app");
                    
           
            
        } catch (Exception ex) {
            Logger.getLogger(RuntimeDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }
}
