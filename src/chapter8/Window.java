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
class WindowXP //Base Class, Parent Class,Super Class
{
    public void createButton()
    {
        System.out.println("Create Button");
    }
}
class WindowVista extends WindowXP //Child Class, Subclass,Derived Class
{
    @Override
    public void createButton()
    {
        super.createButton();
        System.out.println("Add effect to Button");
    }
}
public class Window {
    
    public static void main(String[] args) {
        WindowXP window = new WindowVista();
        window.createButton();
    }
}
