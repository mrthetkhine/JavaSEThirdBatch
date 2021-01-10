/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter31;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 *
 * @author thetkhine
 */
public class SwingDemo {
    SwingDemo()
    {
        JFrame frame = new JFrame("SwingDemo");
        
        frame.setSize(new Dimension(400,500));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel label = new JLabel("Hello");
        frame.add(label);
        
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
                new SwingDemo();
            }
        });
    }
}
