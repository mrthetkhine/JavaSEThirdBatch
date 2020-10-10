/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter7;

/**
 *
 * @author thetkhine
 */
public class Box {
    double width, height, depth;
    
    Box(double width, double height)
    {
        System.out.println("2 argument constructor ");
        this.width = width;
        this.height = height;
    }
    Box(double width, double height,double depth)
    {
        System.out.println("3 argument constructor ");
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    static double aera(Box box)
    {
        return box.width*box.height*box.depth;
    }
    public static void main(String[] args) {
        Box box = new Box(10,20);//2
        box = new Box(2,3,4);
        
        double a = aera(box);
        System.out.println("Area "+a);
    }
    
}
