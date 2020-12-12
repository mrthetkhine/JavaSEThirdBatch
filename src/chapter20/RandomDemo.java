/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter20;

import java.util.Random;

/**
 *
 * @author thetkhine
 */
public class RandomDemo {
    public static void main(String[] args) {
        String[] msg = {"Hello","Welcome","Nice to meet you"};
        
        Random r = new Random();
        
        for (int i = 0; i < 10; i++) {
            int randomIndex = (int)(r.nextDouble()*3);
            System.out.println("Random "+((int)(r.nextDouble()*3+2)));
            System.out.println("Random "+ msg[randomIndex]);
        }
        System.out.println("Next int "+ r.nextInt());
        
    }
}
