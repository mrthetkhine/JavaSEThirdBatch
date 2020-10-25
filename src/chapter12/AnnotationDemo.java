/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter12;
import java.lang.annotation.*;
import java.lang.reflect.*;
/**
 *
 * @author thetkhine
 */
@Retention(RetentionPolicy.RUNTIME)
@interface AnotherAnno{
    String str() default "Hello";
    int val();
}

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno{
    String str() default "Hello";
    int val();
}

@MyAnno( val=100,str="Class level annotation 21")
@AnotherAnno(str="Class level annotation",val=200)
public class AnnotationDemo {
    
    @MyAnno( val=100)
    public static void method()
    {
        System.out.println("My Method");
    }
    public static void main(String[] args) {
        AnnotationDemo obj = new AnnotationDemo();
        
        try
        {
            Class<?> c = obj.getClass();
            Method m = c.getMethod("method");
            MyAnno anno = m.getAnnotation(MyAnno.class);
            
            System.out.println("Anno Str "+anno.str() + " valu "+anno.val());
            
            Annotation all[] = c.getAnnotations();
            for(Annotation ann : all)
            {
                System.out.println("Ann "+ann);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
