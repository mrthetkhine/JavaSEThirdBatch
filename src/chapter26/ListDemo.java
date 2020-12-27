/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter26;

import chapter24.MyWindowAdapter;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 *
 * @author thetkhine
 */
public class ListDemo extends Frame{
    
   
    List os, browser;
    ListDemo()
    {
        addWindowListener(new MyWindowAdapter());
        setLayout(new FlowLayout());
        
        os = new List(4,true);
        browser = new List(4);
        
        os.add("Windows");
        os.add("Android");
        os.add("Solaris");
        os.add("Mac");
        
        browser.add("IE");
        browser.add("Firefox");
        browser.add("Chrome");
        
        add(os);
        add(browser);
        
        os.select(3);
        browser.select(1);
        
        MyItemListener listener = new MyItemListener();
        os.addItemListener(listener);
        browser.addItemListener(listener);
    }
    class MyItemListener implements ItemListener
    {

        @Override
        public void itemStateChanged(ItemEvent e) {
            System.out.println("Item Changed "+e.getSource());
            ListDemo.this.repaint();
        }
        
    }
    public void paint(Graphics g)
    {
        String msg = "Current Os "+ this.os.getSelectedItem()
                +" Current Browser "+ this.browser.getSelectedItem();
        
        g.setColor(Color.BLACK);
        g.drawString(msg, 30, 130);
        
    }
    public static void main(String[] args) {
        ListDemo demo = new ListDemo();
        demo.setSize(new Dimension(400,400));
        demo.setTitle("ButtonDemo Demo");
        
        demo.setVisible(true);
    }
}
