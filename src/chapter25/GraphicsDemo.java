/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter25;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author thetkhine
 */
public class GraphicsDemo extends Frame{
    
    public GraphicsDemo()
    {
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent event)
            {
                System.out.println("window Closing");
                System.exit(0);
            }
        }); 
    }
    public void paint(Graphics g)
    {
        g.setColor(Color.blue);
        g.drawString("Hello", 10, 50);
        g.drawLine(10, 50, 100, 50);
        
        g.drawArc(10, 80, 50, 50, 0, 360);
        
        int centerX = 800/2;
        int centerY = 800/2;
        
        for (int i = 0; i < 360*10; i++) {
            
            double r = (1+Math.cos(7.5*i))*200;
            //double r = 200;
            int x = (int)(r * Math.cos(i));
            int y = (int)(r * Math.sin(i));
            
            g.fillArc(centerX+x, centerY+y, 5, 5, 0, 360);
        }
        
        
    }
    public static void main(String[] args) {
        GraphicsDemo demo = new GraphicsDemo();
        demo.setSize(new Dimension(1200,1200));
        demo.setTitle("Graphics Demo");
        
        demo.setVisible(true);
    }
}
