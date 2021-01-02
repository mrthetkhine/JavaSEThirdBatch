/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter27;

import chapter24.MyWindowAdapter;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.FilteredImageSource;
import java.awt.image.RGBImageFilter;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author thetkhine
 */
interface PlugInFilter 
{
    Image filter(Frame frame,Image in);
}
class LoadedImage extends Canvas
{
    Image img;
    
    LoadedImage(Image i)
    {
        this.img = i;
    }
    void set(Image i)
    {
        this.img = i;
        this.repaint();
    }
    @Override
    public void paint(Graphics g )
    {
        if( img != null)
        {
            g.drawImage(img, 0, 0, null);
        }
    }
    @Override
    public Dimension getPreferredSize()
    {
        return new Dimension(img.getWidth(this),img.getHeight(this));
    }
    @Override
    public Dimension getMinimumSize()
    {
        return this.getPreferredSize();
    }
}
class GrayScale extends RGBImageFilter implements PlugInFilter
{

    public GrayScale()
    {
    }
    @Override
    public Image filter(Frame frame, Image in) {
        return frame.createImage(new FilteredImageSource(in.getSource(),this));
    }

    @Override
    public int filterRGB(int x, int y, int rgb) {
        int r = (rgb >> 16) & 0xff;
        int g = (rgb >> 8) & 0xff;
        int b = rgb  & 0xff;
        
        int k= (int)(.56*g+.33*r+.11*b);
        return(0xff000000 | k <<16 | k << 8 | k);
    }
    
}
class Invert extends RGBImageFilter implements PlugInFilter
{

    public Invert()
    {
    }
    @Override
    public Image filter(Frame frame, Image in) {
        return frame.createImage(new FilteredImageSource(in.getSource(),this));
    }

    @Override
    public int filterRGB(int x, int y, int rgb) {
        int r = 0xff - (rgb >> 16) & 0xff;
        int g = 0xff -(rgb >> 8) & 0xff;
        int b = 0xff - rgb  & 0xff;
        
        int k= (int)(.56*g+.33*r+.11*b);
        return(0xff000000 | r <<16 | g << 8 | b);
    }
    
}
class Contrast extends RGBImageFilter implements PlugInFilter
{

    public Contrast()
    {
    }
    private int multCamp(int in,double factor)
    {
        in = (int)(in*factor);
        return in>255?255: in;
    }
    double gain = 1.2;
    
    private int cont(int in)
    {
        return (in < 128)?  (int)(in/gain): multCamp(in, gain);
    }
    @Override
    public Image filter(Frame frame, Image in) {
        return frame.createImage(new FilteredImageSource(in.getSource(),this));
    }

    @Override
    public int filterRGB(int x, int y, int rgb) {
        int r = cont((rgb >> 16 ) & 0xff);
        int g = cont( (rgb >> 8) & 0xff);
        int b = cont( rgb  & 0xff);
        
        
        return(0xff000000 | r <<16 | g << 8 | b);
    }
    
}        
public class ImageFilterDemo extends Frame implements ActionListener{
    Image img;
    Image filterImage;
    PlugInFilter filter;
    LoadedImage loadImage;
    
    String filters[] = {"GrayScale","Invert","Contrast","Blur","Sharpen"};
    ImageFilterDemo()
    {
        try
        {
            setLayout(new BorderLayout());
            File imageFile = new File("src/chapter27/chaint.jpg");
            img = ImageIO.read(imageFile);
            
            loadImage = new LoadedImage(img);
            
            add(loadImage, BorderLayout.CENTER);
            
            Panel p = new Panel();
            Button reset = new Button("Reset");
            p.add(reset);
            reset.addActionListener(this);
            
            for(String s : filters)
            {
                Button b = new Button(s);
                p.add(b);
                b.addActionListener(this);
            }
            
            add(p, BorderLayout.SOUTH);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        addWindowListener(new MyWindowAdapter());
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        
        if("Reset".equals(command))
        {
            loadImage.set(img);
        }
        else
        {
            try {
                filter = (PlugInFilter)(Class.forName("chapter27."+command)).getConstructor().newInstance();
                filterImage = filter.filter(this, img);
                loadImage.set(filterImage);
            } catch (Exception ex) {
                ex.printStackTrace();
            } 
        }
    }
    public static void main(String[] args) {
        ImageFilterDemo demo = new ImageFilterDemo();
        demo.setSize(new Dimension(1200,1200));
        demo.setTitle("SimpleImageDemo");
        
        demo.setVisible(true);
    }

    
}
