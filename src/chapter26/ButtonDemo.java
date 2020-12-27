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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author thetkhine
 */
public class ButtonDemo extends Frame{
    
    ButtonDemo()
    {
        addWindowListener(new MyWindowAdapter());
        setLayout(new FlowLayout());
        
        Button btnOk = new Button("Ok");
        btnOk.addActionListener(new ActionHandler());
        this.add(btnOk);
        
        Button btnCancel = new Button("Cancel");
        btnCancel.addActionListener(new ActionHandler());
        this.add(btnCancel);
        
        
    }
    class ActionHandler implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Button clicked "+e.getActionCommand());
        }
    }
    public static void main(String[] args) {
        ButtonDemo demo = new ButtonDemo();
        demo.setSize(new Dimension(400,400));
        demo.setTitle("ButtonDemo Demo");
        
        demo.setVisible(true);
    }
}
