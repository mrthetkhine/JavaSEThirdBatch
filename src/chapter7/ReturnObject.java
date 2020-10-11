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
public class ReturnObject {
    
    static Human getHuman()
    {
        return new Human("Tk",300);
    }
    public static void main(String[] args) {
        Human obj = getHuman();
        System.out.println("Human "+obj);
    }
}
