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
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author thetkhine
 */
public class TextFieldDemo extends Frame{
    
    TextField txtName, txtPassword;
    TextFieldDemo()
    {
        setLayout(new FlowLayout());
        
        Label lblName = new Label("Name  ", Label.RIGHT);
        Label lblPassword = new Label("Password ", Label.RIGHT);
        
        txtName = new TextField(12);
        txtPassword = new TextField(8);
        txtPassword.setEchoChar('*');
        
        add(lblName);
        add(txtName);
        add(lblPassword);
        add(txtPassword);
        
        MyActionListener lst = new MyActionListener();
        
        txtName.addActionListener(lst);
        txtPassword.addActionListener(lst);
        
        addWindowListener(new MyWindowAdapter());
        
    }
    class MyActionListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Repaint");
            repaint();
        }
        
    }
    public void paint(Graphics g)
    {
        String msg = "Name "+ this.txtName.getText()
                +" Password "+ this.txtPassword.getText();
        
        g.setColor(Color.BLACK);
        g.drawString(msg, 30, 130);
        
    }
    public static void main(String[] args) {
        TextFieldDemo demo = new TextFieldDemo();
        demo.setSize(new Dimension(1200,1200));
        demo.setTitle("Graphics Demo");
        
        demo.setVisible(true);
    }
}
