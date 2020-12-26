/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter24;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

/**
 *
 * @author thetkhine
 */

public class AdapterDemo extends JFrame {

    
    AdapterDemo()
    {
        this.addKeyListener(new MyKeyAdapter());
        this.addWindowListener(new MyWindowAdapter());
    }
    class MyKeyAdapter extends KeyAdapter
    {
        @Override
        public void keyTyped(KeyEvent e) {
            System.out.println("Key Typed "+e.getKeyChar());
        }

    }
    
    public static void main(String[] args) {
        AdapterDemo demo = new AdapterDemo();
        
        demo.setSize(new Dimension(500,500));
        demo.setTitle("SimpleKey Demo");
        demo.setVisible(true);
    }
}
