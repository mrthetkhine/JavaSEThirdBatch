/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter14;

import java.util.ArrayList;

/**
 *
 * @author thetkhine
 */
public class Erasure {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        ArrayList<Object> objList = new ArrayList<Object>();
        
        System.out.println("Get class "+ arr.getClass().equals(objList.getClass()));
    }
}
