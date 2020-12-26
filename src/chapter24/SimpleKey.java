/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter24;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

/**
 *
 * @author thetkhine
 */
public class SimpleKey extends JFrame implements KeyListener{

    String msg = "";
    String keyState = "";
    SimpleKey()
    {
        this.addKeyListener(this);
        this.addWindowListener(new MyWindowAdapter());
    }
    @Override
    public void keyTyped(KeyEvent e) {
        msg+= e.getKeyChar();
        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        keyState = "Key Down";
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        keyState = "Key Up";
        repaint();
    }
    public void paint(Graphics g)
    {
        g.drawString(msg,20,100);
        g.drawString(keyState,20,50);
    }
    public static void main(String[] args) {
        SimpleKey demo = new SimpleKey();
        
        demo.setSize(new Dimension(500,500));
        demo.setTitle("SimpleKey Demo");
        demo.setVisible(true);
    }
}
