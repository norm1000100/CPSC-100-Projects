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
public class BraedenVelde_HW4_Q2b {

    public static void main(String[] args) {
        int Primes = 2;
        int Final = 10000;
        int i = 0;
        int total = 0;
        do {
            do {
                IsPrime(Primes);
                if (IsPrime(Primes) == true) {
                    System.out.printf("%s%d%s", " ", Primes, " ");
                    ++Primes;
                    ++i;
                } else {
                    ++Primes;

                }

            } while ((i < 5) && (Primes < Final ));
            System.out.println();
            total = total + i;
            i = 0;
        } while (Primes < Final);

        System.out.printf("%n%s%n%s%d%s%n", "Are all Primes", "There are " , total
        ," Primes");
    }

    public static boolean IsPrime(int Prime) {

        int YesPrime = 0;
        int i = 1;
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
            } while ((Prime >= (i * i)));

            return YesPrime <= 1;
        } else {
            return false;
        }
    }

}

