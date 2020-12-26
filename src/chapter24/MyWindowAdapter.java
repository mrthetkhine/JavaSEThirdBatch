/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter24;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author thetkhine
 */
public class MyWindowAdapter extends WindowAdapter{
    public MyWindowAdapter()
    {
    }
    public void windowClosing(WindowEvent we)
    {
        System.exit(0);
    }
}
