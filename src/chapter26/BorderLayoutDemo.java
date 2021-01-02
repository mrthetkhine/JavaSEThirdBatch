/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter26;

import chapter24.MyWindowAdapter;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Panel;

/**
 *
 * @author thetkhine
 */
public class BorderLayoutDemo extends Frame{
    
    BorderLayoutDemo()
    {
        setLayout(new BorderLayout());
        Button left = new Button("Left");
        Button center = new Button("Center");
        Button right = new Button("Right");
        Button top = new Button("Top");
        Button bottom = new Button("Bottom");
        
        Panel centerPanel = new Panel();
        centerPanel.add(center);
        
        add(top, BorderLayout.NORTH);
        add(bottom, BorderLayout.SOUTH);
        add(left, BorderLayout.WEST);
        add(right, BorderLayout.EAST);
        add(centerPanel,BorderLayout.CENTER);
        
        addWindowListener(new MyWindowAdapter());
    }
    public static void main(String[] args) {
        BorderLayoutDemo demo = new BorderLayoutDemo();
        demo.setSize(new Dimension(1200,1200));
        demo.setTitle("Graphics Demo");
        
        demo.setVisible(true);
    }
}
