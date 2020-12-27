/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter25;

import java.awt.Dimension;
import java.awt.Frame;
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
    public static void main(String[] args) {
        GraphicsDemo demo = new GraphicsDemo();
        demo.setSize(new Dimension(500,500));
        demo.setTitle("Graphics Demo");
        
        demo.setVisible(true);
    }
}
