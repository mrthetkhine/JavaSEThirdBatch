/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter26;

import chapter24.MyWindowAdapter;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Checkbox;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;

/**
 *
 * @author thetkhine
 */
public class CardLayoutDemo extends Frame{
    
    Checkbox window10,window7,window8,android,solaris,mac;
    Panel osCards;
    CardLayout cardL0;
    Button win, other;
    
    CardLayoutDemo()
    {
        setLayout(new FlowLayout());
        win = new Button("Window");
        other  = new Button("Other");
        
        add(win);
        add(other);
        
        cardL0 = new CardLayout();
        osCards = new Panel();
        osCards.setLayout(cardL0);
        
        window7 = new Checkbox("Window 7",true);
        window8 = new Checkbox("Window 8");
        window10 = new Checkbox("Window 9");
        android = new Checkbox("Android");
        solaris = new Checkbox("Solaris");
        mac = new Checkbox("Mac");
        
        Panel winPanel = new Panel();
        winPanel.add(window7);
        winPanel.add(window8);
        winPanel.add(window10);
        
        Panel otherPanel = new Panel();
        otherPanel.add(android);
        otherPanel.add(solaris);
        otherPanel.add(mac);
        
        osCards.add(winPanel, "Window");
        osCards.add(otherPanel, "Other");
        
        add(osCards);
        
        win.addActionListener((ae)->{ cardL0.show(osCards,"Window");});
        other.addActionListener((ae)->{ cardL0.show(osCards,"Other");});
        
        addWindowListener(new MyWindowAdapter());
    }
    
    public static void main(String[] args) {
        CardLayoutDemo demo = new CardLayoutDemo();
        demo.setSize(new Dimension(1200,1200));
        demo.setTitle("Graphics Demo");
        
        demo.setVisible(true);
    }
}
