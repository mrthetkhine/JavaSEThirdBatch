/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter20;

import java.util.Scanner;

/**
 *
 * @author thetkhine
 */
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String str ;
        System.out.println("Enter string");
        str = scanner.nextLine();
        
        System.out.println("String is "+ str);
        int x, y;
        
        System.out.println("Enter x");
        x = scanner.nextInt();
        
        System.out.println("Enter y");
        y = scanner.nextInt();
        
        int result = x+y;
        System.out.println("Resutl "+result);
        
        
    }
}
