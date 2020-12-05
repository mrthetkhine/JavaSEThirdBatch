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
public class ArrayCopy {
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50};
        int b[] = {1,2,3,4,5};
        
        System.arraycopy(a, 0, b, 2, 3);
        System.out.println("B "+b);
        for(int i : b)
        {
            System.out.println(i);
        }
    }
}
