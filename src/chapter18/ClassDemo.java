/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter18;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thetkhine
 */
public class ClassDemo {
    
    double fieldOne;
    String fieldTwo;
    
    public static void main(String[] args) {
        try {
            Class.forName("chapter18.MyClass");
            
            Field[] fields = ClassDemo.class.getDeclaredFields();
            
            for (int i = 0; i < fields.length; i++) {
                Field field = fields[i];
                System.out.println("FieldName "+ field.getName() + " Type "+ field.getType());
            }
            Method[] methods = ClassDemo.class.getDeclaredMethods();
            
            for (int i = 0; i < methods.length; i++) {
                Method method = methods[i];
                System.out.println("Method "+ method.getName() + " Type "+ method.getGenericReturnType());
            }
            
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
