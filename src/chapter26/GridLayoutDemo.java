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
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Panel;

/**
 *
 * @author thetkhine
 */
public class GridLayoutDemo extends Frame{
    
    GridLayoutDemo()
    {
        setLayout(new GridLayout(3,3));
       
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Button btn = new Button("Row "+i + " Col "+j);
                this.add(btn);
            }
        }
        addWindowListener(new MyWindowAdapter());
    }
    @Override
    public Insets getInsets()
    {
        return new Insets(140,10,20,20);
    }
    public static void main(String[] args) {
        GridLayoutDemo demo = new GridLayoutDemo();
        demo.setSize(new Dimension(1200,1200));
        demo.setTitle("Graphics Demo");
        
        demo.setVisible(true);
    }
}
