/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter26;

import chapter24.MyWindowAdapter;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

/**
 *
 * @author thetkhine
 */
public class FlowLayoutDemo extends Frame{
    FlowLayoutDemo()
    {
        setLayout(new FlowLayout(FlowLayout.TRAILING,30,30));
        
        Label lblOne = new Label("One");
        Label lblTwo = new Label("Two");
        Label lblThree = new Label("Three");
        
        this.add(lblOne);
        this.add(lblTwo);
        this.add(lblThree);
        
        for (int i = 0; i < 5; i++) {
            if(Math.random() > 0.5)
            {
                Label lbl = new Label("Label "+i);
                this.add(lbl);
            }
            else
            {
                Button btn = new Button("Button "+i);
                this.add(btn);
            }
        }
        addWindowListener(new MyWindowAdapter());
        
    }
    
    public static void main(String[] args) {
        FlowLayoutDemo demo = new FlowLayoutDemo();
        demo.setSize(new Dimension(1200,1200));
        demo.setTitle("Graphics Demo");
        
        demo.setVisible(true);
    }
}
