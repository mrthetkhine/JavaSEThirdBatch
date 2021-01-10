/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter30;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thetkhine
 */
class Hello
{
    private String name;
    public Hello()
    {
        System.out.println("Constructor Invoked");
    }
    public void display()
    {
        System.out.println("Displayed invoked "+name);
    }
}
public class RefDemo {
    public static void main(String[] args) {
        try {
            Class c = Hello.class;
            
            Object obj = c.newInstance();
            
            Field field = c.getDeclaredField("name");
            field.setAccessible(true);
            field.set(obj, "TK");
            
            Method method = c.getMethod("display", null);
            method.invoke(obj, null);
        } catch (Exception ex) {
           ex.printStackTrace();
        } 
    }
}
