/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter31;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author thetkhine
 */
public class SwingDrawing extends JFrame {
    
    SwingDrawing()
    {
        setSize(new Dimension(400,500));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    @Override
    public void paint(Graphics g)
    {
        g.setColor(Color.black);
        g.setFont(new Font("Times New Roman",Font.PLAIN,20));
        g.drawString("Hello", 10, 50);
        g.drawLine(0, 0, 400, 500);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
                new SwingDrawing();
            }
        });
    }
    
}
