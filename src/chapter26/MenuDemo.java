/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter26;

import chapter24.MyWindowAdapter;
import java.awt.Button;
import java.awt.CheckboxMenuItem;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

/**
 *
 * @author thetkhine
 */
public class MenuDemo extends Frame{
    MenuDemo()
    {
       setLayout(new FlowLayout());
       MenuBar menuBar = new MenuBar();
       
       Menu fileMenu = new Menu("File");
       
       MenuItem newMenu = new MenuItem("New");
       fileMenu.add(newMenu);
       
       Menu editMenu = new Menu("Edit");
       fileMenu.add(editMenu);
       
       editMenu.add(new MenuItem("Cut"));
       editMenu.add(new MenuItem("Copy"));
       
       fileMenu.addSeparator();
       
       CheckboxMenuItem debug = new CheckboxMenuItem("Debug");
       fileMenu.add(debug);
       
       menuBar.add(fileMenu);
       this.setMenuBar(menuBar);
       
       
       newMenu.addActionListener((ae)->{
           System.out.println("New Menu clicked");
       });
       editMenu.addActionListener((ae)->{
           System.out.println("Edit Menu clicked");
       });
       debug.addActionListener((ae)->{
           System.out.println("Debug clicked");
       });
       debug.addItemListener((ie)->{
        System.out.println("Debug checked");
       });
       addWindowListener(new MyWindowAdapter());
        
    }
    
    public static void main(String[] args) {
        MenuDemo demo = new MenuDemo();
        demo.setSize(new Dimension(1200,1200));
        demo.setTitle("MenuDemo Demo");
        
        demo.setVisible(true);
    }
}
