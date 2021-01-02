/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter27;

import chapter24.MyWindowAdapter;
import chapter26.DialogBoxDemo;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author thetkhine
 */
public class SimpleImageDemo extends Frame {
    Image img;
    SimpleImageDemo()
    {
        addWindowListener(new MyWindowAdapter());
        
        try
        {
            File imageFile = new File("src/chapter27/chaint.jpg");
            img = ImageIO.read(imageFile);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    @Override
    public void paint(Graphics g)
    {
        g.drawImage(img, getInsets().left, getInsets().top, null);
    }
    public static void main(String[] args) {
        SimpleImageDemo demo = new SimpleImageDemo();
        demo.setSize(new Dimension(1200,1200));
        demo.setTitle("SimpleImageDemo");
        
        demo.setVisible(true);
    }
}
