/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter18;

/**
 *
 * @author thetkhine
 */
public class FloatDemo {
    public static void main(String[] args) {
        Float f = 2124.3f;
        System.out.println("Compare "+ Float.compare(0.14f, 0.14f));
        System.out.println("Float.compareTo "+ f.compareTo(2.4f));
        
        byte b = f.byteValue();
        System.out.println("Byte value "+b);
        
        String price = "3.2";
        float fPrice = Float.parseFloat(price);
        System.out.println("price "+fPrice);
        
        f = 0f/0f;
        System.out.println("F "+f);
        
        System.out.println("f "+ (f.floatValue()==f.floatValue()));
        System.out.println("Float > NaN "+ (f.floatValue()<0));
        System.out.println("Double.isNaN "+Double.isNaN(f.floatValue()));
        
        int a = 10;
        a = a / a;
        System.out.println("Not reachable");
        
        String quantity = "300";
        int iQty = Integer.parseInt(quantity);
        System.out.println("Quantity "+iQty);
        
    }
}
