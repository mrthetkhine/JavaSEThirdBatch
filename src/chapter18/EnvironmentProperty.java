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
public class EnvironmentProperty {
    public static void main(String[] args) {
        System.out.println("User Dir "+ System.getProperty("user.dir"));
        System.out.println("OS "+ System.getProperty("os.name"));
        System.out.println("Version "+ System.getProperty("os.version"));
        System.out.println("Sepeartor Path "+ System.getProperty("path.separator"));
        System.out.println("Line Separator "+ System.getProperty("line.separator"));
        System.out.println("Sepeartor file "+ System.getProperty("file.separator"));
    }
}
