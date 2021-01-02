/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter26;

import chapter24.MyWindowAdapter;
import java.awt.Button;
import java.awt.CheckboxMenuItem;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

/**
 *
 * @author thetkhine
 */
class SampleDialog extends Dialog
{
    SampleDialog(Frame parent, String title)
    {
        super(parent,title,true);
        setLayout(new FlowLayout());
        setSize(200,200);
        
        add(new Label("Press this button"));
        Button b = new Button("Cancel");
        add(b);
        
        b.addActionListener((ae)->{
            dispose();
        });
        
    }
    public void paint(Graphics g)
    {
        g.drawString("This is dialog box ",20,80);
    }
}
public class DialogBoxDemo extends Frame{
    
    DialogBoxDemo()
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
           SampleDialog dlg = new SampleDialog(this,"You clicked new");
           dlg.show();
           
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
        DialogBoxDemo demo = new DialogBoxDemo();
        demo.setSize(new Dimension(1200,1200));
        demo.setTitle("MenuDemo Demo");
        
        demo.setVisible(true);
    }
}
