/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter9;

/**
 *
 * @author thetkhine
 */
interface Setting
{
    String URL = "http://www.google.com";
}
public class SettingDemo {
    public static void main(String[] args) {
        //Setting.URL = "He";
        System.out.println("Setting.url "+ Setting.URL);
    }
    
}
