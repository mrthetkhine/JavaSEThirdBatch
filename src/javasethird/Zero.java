/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasethird;

/**
 *
 * @author thetkhine
 */
public class Zero
{
    public static void main(String[] args)
    {
        int zero = -0;
        float plusZero = +0.0f;
        float minusZero = -0.f;
        System.out.println("Zero "+ zero +" Plus Zero "+plusZero+ " Minuszero "+minusZero);
        System.out.println("+zero == -zero "+ (plusZero == minusZero));
        System.out.println("1/+zero == 1/-zero "+ (1/plusZero == 1/minusZero));
        System.out.println("0.3-0.2 "+ (0.3-0.2==0.1));
        System.out.println("(0.3-0.2) "+ (0.3-0.2));
    }
}