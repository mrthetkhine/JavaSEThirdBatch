/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter26;

import chapter24.MyWindowAdapter;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author thetkhine
 */
public class ScrollBarDemo extends Frame{
    
    String msg;
    Scrollbar vertSB, horSB;
    ScrollBarDemo()
    {
        addWindowListener(new MyWindowAdapter());
        setLayout(new FlowLayout());
        
        vertSB = new Scrollbar(Scrollbar.VERTICAL,0,1,0,200);
        vertSB.setPreferredSize(new Dimension(20,100));
        
        horSB = new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,100);
        horSB.setPreferredSize(new Dimension(100, 20));
        
        add(vertSB);
        add(horSB);
        
        MyAdjustmentListener lst = new MyAdjustmentListener();
        vertSB.addAdjustmentListener(lst );
        horSB.addAdjustmentListener(lst);
        
        addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent me)
            {
                int x = me.getX();
                int y = me.getY();
                vertSB.setValue(y);
                horSB.setValue(x);
                repaint();
                
            }
        });
    }
    @Override
    public void paint(Graphics g)
    {
        msg = "Vertical "+ vertSB.getValue() ;
        msg+= " Horizontal "+horSB.getValue();
        
        g.drawString(msg, 20, 160);
    }
    class MyAdjustmentListener implements AdjustmentListener
    {

        @Override
        public void adjustmentValueChanged(AdjustmentEvent e) {
            repaint();
        }
    }
    
    public static void main(String[] args) {
        ScrollBarDemo demo = new ScrollBarDemo();
        demo.setSize(new Dimension(400,400));
        demo.setTitle("ButtonDemo Demo");
        
        demo.setVisible(true);
    }
}
