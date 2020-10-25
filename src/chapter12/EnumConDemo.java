/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter12;

/**
 *
 * @author thetkhine
 */
enum Window
{
    XP,Vista(2005),Win95(1995);
    
    int year;
    
    Window()
    {}
    Window(int year)
    {
        this.year = year;
    }
    int getYear()
    {
        return this.year;
    }
}
public class EnumConDemo {
    public static void main(String[] args) {
        Window myWindow = Window.Vista;
        System.out.println("MyWindow "+ myWindow+" year "+myWindow.getYear());
        
        boolean result = Window.XP.getYear() > Window.Vista.getYear();
        
    }
}
