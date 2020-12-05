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
public class CharacterDemo {
    public static void main(String[] args) {
        char ch = '\u1010';
        System.out.println("Ch "+ch);
        System.out.println("isDefined "+ Character.isDefined(ch));
        System.out.println("isDigit "+Character.isDigit('8'));
        System.out.println("isIdIgnorable "+ Character.isIdentifierIgnorable('1'));
        System.out.println("Letter or Digit "+ Character.isLetterOrDigit('A'));
        System.out.println("toLowerCase "+ Character.toLowerCase('A'));
    }
}
