/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter7;

/**
 *
 * @author thetkhine
 */
public class ProtectedDemo {
    public static void main(String[] args) {
        Data data = new Data();
        data.protectedData = 100;
        
        System.out.println("Protected Data "+ data.protectedData);
    }
   
}
