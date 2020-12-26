/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter24;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;

/**
 *
 * @author thetkhine
 */
public class MouseEventDemo extends JFrame implements MouseListener{
    
    String msg="";
    int x =0,y=0;
    MouseEventDemo()
    {
        this.addMouseListener(this);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        msg = "Mouse clicked "+ e.getX() +" "+e.getY();
        repaint();
        System.out.println("Mouse clicked ");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        msg = "Mouse Pressed "+ e.getX() +" "+e.getY();
        repaint();
        System.out.println("Mouse Pressed ");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        msg = "Mouse released "+ e.getX() +" "+e.getY();
        repaint();
        System.out.println("Mouse Released ");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        msg = "Mouse entered "+ e.getX() +" "+e.getY();
        repaint();
        System.out.println("Mouse entered ");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        msg = "Mouse exited "+ e.getX() +" "+e.getY();
        repaint();
        System.out.println("Mouse exited ");
    }
    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        System.out.println("Paint "+msg);
        g.setColor(Color.BLACK);
        g.drawString(msg,x,y);
    }
    public static void main(String[] args) {
        MouseEventDemo demo = new MouseEventDemo();
        
        demo.setSize(new Dimension(500,500));
        demo.setTitle("MouseEvent Demo");
        demo.setVisible(true);
    }

    
}
