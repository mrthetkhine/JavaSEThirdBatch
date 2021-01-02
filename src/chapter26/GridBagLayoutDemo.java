/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter26;

import chapter24.MyWindowAdapter;
import java.awt.Checkbox;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
/**
 *
 * @author thetkhine
 */
public class GridBagLayoutDemo extends Frame{
    
    String msg;
    Checkbox window,android, solaris,mac;
    GridBagLayoutDemo()
    {
        GridBagLayout gBag = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        
        setLayout(gBag);
        
        window = new Checkbox("Window",true);
        android = new Checkbox("Android");
        solaris = new Checkbox("Solaris");
        mac = new Checkbox("Mac");
        
        gbc.weightx = 5.0;
        gbc.ipadx = 200;
        gbc.insets = new Insets(0,6,0,0);
        gbc.anchor = GridBagConstraints.NORTHEAST;
        gbc.gridwidth = GridBagConstraints.RELATIVE;
        
        gBag.setConstraints(window, gbc);
        
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gBag.setConstraints(android, gbc);
        
        gbc.weighty = 5.0;
        gbc.gridwidth = GridBagConstraints.RELATIVE;
        gBag.setConstraints(solaris, gbc);
         
        gbc.gridwidth = GridBagConstraints.REMAINDER; 
        gBag.setConstraints(mac, gbc);
        
        add(window);
        add(android);
        add(solaris);
       
        add(mac);
        addWindowListener(new MyWindowAdapter());
    }
    
    public static void main(String[] args) {
        GridBagLayoutDemo demo = new GridBagLayoutDemo();
        demo.setSize(new Dimension(400,400));
        demo.setTitle("GridBagLayoutDemo Demo");
        
        demo.setVisible(true);
    }
}
