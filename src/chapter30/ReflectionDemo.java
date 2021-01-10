/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter30;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thetkhine
 */
public class ReflectionDemo {
    public static void main(String[] args) {
        try {
            Class<?> c = Class.forName("java.awt.Dimension");
            
            Constructor<?> constructors[] = c.getConstructors();
            for(Constructor con : constructors)
            {
                System.out.println("Con "+ con );
            }
            
            Field[] fields = c.getFields();
            for(Field field : fields)
            {
                System.out.println("File name "+ field.getName() + " Type "+ field.getType());
            }
            
            Method[] methods = c.getMethods();
            for(Method m : methods)
            {
                System.out.println("Method name "+m.getName() + " Return type "+ m.getReturnType());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
