/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter17;

/**
 *
 * @author thetkhine
 */
class MyObject
{
    double x,y,z;
    
    MyObject(double x, double y, double z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "MyObject{" + "x=" + x + ", y=" + y + ", z=" + z + '}';
    }
    
}
public class StringConcat {
    public static void main(String[] args) {
        int age = 36;
        
        String str  = "Hello age is "+ age +" old" ;
        System.out.println(str);
        
        MyObject obj = new MyObject(10,20,30);
        System.out.println("Hello myobj "+ obj);
    }
}
