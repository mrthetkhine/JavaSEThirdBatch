/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter20;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author thetkhine
 */
public class GameDemo {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNo = (int)(random.nextDouble()*10+1);
        
        boolean correct = false;
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while(!correct)
        {
            int input;
            System.out.println("Enter guess");
            input = scanner.nextInt();
            
            count ++;
            if(input == randomNo)
            {
                correct = true;
                System.out.println("You guess it in count "+count);
            }
            else if(input> randomNo)
            {
                System.out.println("Too large");
            }
            else
            {
                System.out.println("Too small");
            }
            
        }
    }
}
