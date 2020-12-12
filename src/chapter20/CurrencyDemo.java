/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter20;

import java.util.Currency;
import java.util.Locale;

/**
 *
 * @author thetkhine
 */
public class CurrencyDemo {
    public static void main(String[] args) {
        Currency c = Currency.getInstance(Locale.UK);
        
        System.out.println("C "+c.getSymbol() +" Code "+ c.getCurrencyCode() +" DisplayName "+c.getDisplayName());
        System.out.println("Default Fra "+c.getDefaultFractionDigits());
        
    }
}
