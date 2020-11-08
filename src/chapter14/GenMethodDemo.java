/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter14;

/**
 *
 * @author thetkhine
 */
public class GenMethodDemo {
    static <T extends Comparable<T>,V extends T> boolean isIn(T x, V[]y)
    {
        for (int i = 0; i < y.length; i++) {
            if(x.equals(y[i]))
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Integer iNums[] = {1,2,3,4,5};
        
        if(isIn(2,iNums))
        {
            System.out.println("2 is in iNums");
        }
        
        String strArr[] = {"One","Two"};
        if( isIn("One",strArr))
        {
            System.out.println("One is in strArr");
        }
    }
}
