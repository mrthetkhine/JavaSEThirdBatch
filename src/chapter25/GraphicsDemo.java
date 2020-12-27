/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter25;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author thetkhine
 */

public class GraphicsDemo extends Frame{
    
    GraphicsEnvironment ge;
    String msg = "";
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
        
        addMouseListener(new MyMouseAdapter());
        ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String fonts[] = ge.getAvailableFontFamilyNames();
        for (String str : fonts) {
            msg += str + "\r\n";
            System.out.println("Font "+ str);
        }
        
        //Font f = this.getFont();
        //System.out.println("Current Font Family "+ f.getFamily());
        //System.out.println("Current Name "+ f.getFontName());
    }
    
    public void paint(Graphics g)
    {
        Font f = this.getFont();
        System.out.println("Current Font Family "+ f.getFamily());
        System.out.println("Current Name "+ f.getFontName());
        
        Color c = new Color(10,20,40);
        g.setColor(c);
        Font f2 = new Font("Georgia",Font.PLAIN,24);
        g.setFont(f2);
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
    class MyMouseAdapter extends MouseAdapter
    {

        @Override
        public void mouseEntered(MouseEvent me)
        {
            System.out.println("Mouse Entered");
        }
        @Override
        public void mouseExited(MouseEvent me)
        {
            System.out.println("Mouse Exited");
        }
        @Override
        public void mouseClicked(MouseEvent me)
        {
            System.out.println("Mouse Clicked");
        }
    }
    public static void main(String[] args) {
        GraphicsDemo demo = new GraphicsDemo();
        demo.setSize(new Dimension(1200,1200));
        demo.setTitle("Graphics Demo");
        
        demo.setVisible(true);
    }
}
