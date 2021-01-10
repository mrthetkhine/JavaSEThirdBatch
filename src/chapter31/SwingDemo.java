/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter31;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
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
        frame.setLayout(new FlowLayout());
      
        frame.setSize(new Dimension(400,500));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton alpha = new JButton("Alpha");
        JButton beta = new JButton("Beta");
        
        frame.add(alpha);
        frame.add(beta);
        
        JLabel label = new JLabel("Hello");
        frame.add(label);
        
        frame.setVisible(true);
        
        alpha.addActionListener((ae)->{
            label.setText("Alpha button clicked");
        });
        
        beta.addActionListener((ae)->{
            label.setText("beta button clicked");
        });
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
