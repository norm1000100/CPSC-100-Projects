/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BraedenVelde_HW4;

import java.util.Random;

public class BraedenVelde_HW4_Q1b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int total = 0;
        int heads = 0;
        int tails = 0;
        int headsFinal = 0;
        int tailsFinal = 0;

        do {//starts a loop to flip the coin
            flip();//runs the "flip" method to determine a heads or tails value
            if (flip() == true) {//if true, 

                ++heads;
            } else {

                ++tails;
            }

            headsFinal = (heads + headsFinal);
            tailsFinal = (tails + tailsFinal);
            total = (headsFinal + tailsFinal);
            heads = 0;
            tails = 0;
        } while (total < 5000);
        System.out.printf("%s%d%s%n%s%n%d%s%d%s%n", "You flipped the coin ", total, " times",
                "and you got ", headsFinal, " heads and ", tailsFinal, " tails");
    }

    public static boolean flip() {
        Random rnd = new Random();

        boolean flip = rnd.nextBoolean();

        return flip;
    }

}
