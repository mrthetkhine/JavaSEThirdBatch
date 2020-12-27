/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter26;

import chapter24.MyWindowAdapter;
import chapter25.GraphicsDemo;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author thetkhine
 */
public class TextAreaDemo extends Frame{
    
   
    TextAreaDemo()
    {
        setLayout(new FlowLayout());
        
        String str = "Text areas are almost self-contained controls. Your program incurs virtually no management overhead. Normally, your program simply obtains the current text when it is needed. You can, however, listen for TextEvents";
        TextArea area = new TextArea(str,10,30);
        
        add(area);
        addWindowListener(new MyWindowAdapter());
        
    }
   
    public static void main(String[] args) {
        TextAreaDemo demo = new TextAreaDemo();
        demo.setSize(new Dimension(1200,1200));
        demo.setTitle("Graphics Demo");
        
        demo.setVisible(true);
    }
}
