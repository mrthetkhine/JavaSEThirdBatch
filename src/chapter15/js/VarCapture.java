/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter15.js;

/**
 *
 * @author thetkhine
 */
interface MyFunc{
    int func(int n);
}
public class VarCapture {
    public static void main(String[] args) {
        
        int num = 10;
        
        MyFunc lambda = (n)->{
            int v = num+n;//closure            
            return v;
        };
        
        System.out.println("Lambda "+ lambda.func(5));
    }
}
