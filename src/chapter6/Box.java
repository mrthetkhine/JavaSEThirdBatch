/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter6;

/**
 *
 * @author thetkhine
 */
public class Box
{
    double width, height,depth;
    
    double volume()
    {
        return width * height * depth;
    }
    void show()
    {
        System.out.println("--------------");
        System.out.println("Width "+ width);
        System.out.println("Height "+ height);
        System.out.println("Depth "+ depth);
        double vol = volume();
        System.out.println("Volume "+ vol);
    }
    
    public static void main(String[] args)
    {
        Box box1 = new Box();
        box1.width = 1;
        box1.height = 2;
        box1.depth = 3;
        
        box1.show();
        
        Box box2 = new Box();
        box2.width = 10;
        box2.height = 2;
        box2.depth = 3;
        
        box2.show();
    }
}
