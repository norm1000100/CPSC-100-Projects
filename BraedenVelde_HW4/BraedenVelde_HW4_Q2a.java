/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BraedenVelde_HW4;

/**
 *
 * @author velde
 */
import java.util.Scanner;

public class BraedenVelde_HW4_Q2a {

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int input;

        System.out.println("input a value to determine if it is prime:");
        input = kbd.nextInt();
        IsPrime(input);
        if (IsPrime(input) == true) {
            System.out.println("The number is prime");

        } else {
            System.out.println("The Number is not prime");
        }
    }

    public static boolean IsPrime(int Prime) {

        int YesPrime = 0;
        int i = 2;
        if (Prime > 1) {

            do {//starts the loop to test for Prime
                if ((Prime % i) == 0) {/* if Prime is divided by "i" and returns a 0,
                     "YesPrime" incriments and "i" incriments
                     */

                    ++YesPrime;
                    ++i;
                } else {//otherwise "i" increases

                    ++i;
                }
            } while (Prime >= i);

            return YesPrime <= 1;
        } else {
            return false;
        }
    }
}
