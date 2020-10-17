/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter8;

/**
 *
 * @author thetkhine
 */
abstract class Shape extends Object
{
    protected String id;
    Shape()
    {
        System.out.println("Shape Constructor");
    }
    Shape(String id)
    {
        System.out.println("Shape Constructor with id "+id);
        this.id = id;
    }
    //final 
    abstract void draw();
    
}
class Circle extends Shape
{
    Circle()
    {
        System.out.println("Circle Constructor");
    }
    Circle(String id)
    {
        super(id);
        System.out.println("Circle Constructor with id parameter");
         
    }
    
    @Override
    void draw()
    {
        System.out.println("Draw Circle");
    }
    
}
class Rectangle extends Shape
{
    Rectangle()
    {
         System.out.println("Rect constructor");
    }
     @Override
     void draw()
    {
         System.out.println("Draw Rectangle");
    }
}
class Square extends Rectangle
{
    Square()
    {
        System.out.println("Square constructor");
    }
     @Override
     void draw()
    {
         System.out.println("Draw Square");
    }
}
public class ShapeDemo {
    public static void main(String[] args) {
       
        Shape s = new Circle("ID1");
        s.draw();
        
        s = new Rectangle();
        s.draw();
        
        s = new Square();
        //Circle c = new Shape();
    }
}
