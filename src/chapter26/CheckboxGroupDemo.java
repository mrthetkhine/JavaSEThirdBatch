/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter26;

import chapter24.MyWindowAdapter;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 *
 * @author thetkhine
 */
public class CheckboxGroupDemo extends Frame{
    
    Checkbox window, solaris, android, mac;
    
    CheckboxGroupDemo()
    {
        addWindowListener(new MyWindowAdapter());
        setLayout(new FlowLayout());
        
        CheckboxGroup cbg = new CheckboxGroup();
        
        window = new Checkbox("Window ",cbg,true);
        solaris = new Checkbox("Solaris",cbg,false);
        android = new Checkbox("Android",cbg,false);
        mac = new Checkbox("Mac",cbg,false);
        
        add(window);
        add(solaris);
        add(android);
        add(mac);
        
        MyItemListener listener = new MyItemListener();
        window.addItemListener(listener);
        android.addItemListener(listener);
        solaris.addItemListener(listener);
        mac.addItemListener(listener);
        
    }
    class MyItemListener implements ItemListener
    {

        @Override
        public void itemStateChanged(ItemEvent e) {
            System.out.println("Item Changed "+e.getSource());
        }
        
    }
    public static void main(String[] args) {
        CheckboxGroupDemo demo = new CheckboxGroupDemo();
        demo.setSize(new Dimension(400,400));
        demo.setTitle("ButtonDemo Demo");
        
        demo.setVisible(true);
    }
}
