/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BraedenVelde_HW4;

import java.util.Random;
import java.util.Scanner;

public class BraedenVelde_HW4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        //boolean numflips = flip();
        int total = 0;
        int heads = 0;
        int tails = 0;
        int headsFinal = 0;
        int tailsFinal = 0;
        int choice = 0;

        do {

            System.out.println("Choose how many coin tosses you want from the menu below");

            System.out.printf("%s%n%s%n%s%n%s%n%s%n", "(1) 1 flip!", "(2) 5 flips!", "(3) 10 flips!", "(4) 25 flips!", "(5) Exit");
            choice = kbd.nextInt();
            switch (choice) {

                case 1: {
                    flip();
                    if (flip() == true) {
                        System.out.println("heads!");
                        ++heads;
                    } else {
                        System.out.println("tails!");
                        ++tails;
                    }
                    break;
                }

                case 2: {
                    flip();
                    while ((heads + tails) < 5) {
                        if (flip() == true) {
                            ++heads;
                        } else {
                            ++tails;
                        }
                    }
                    System.out.println("there were " + heads + " heads and " + tails + " tails");
                    break;
                }

                case 3: {
                    flip();
                    while ((heads + tails) < 10) {
                        if (flip() == true) {
                            ++heads;
                        } else {
                            ++tails;
                        }
                    }
                    System.out.println("there were " + heads + " heads and " + tails + " tails");
                    break;
                }

                case 4: {
                    flip();
                    while ((heads + tails) < 25) {
                        if (flip() == true) {
                            ++heads;
                        } else {
                            ++tails;
                        }
                    }
                    System.out.println("there were " + heads + " heads and " + tails + " tails");
                    break;
                }
                case 5: {
                    System.out.printf("%s%d%s%n%s%n%d%s%d%s", "You flipped the coin ", total, " times",
                            "and you got ", headsFinal, " heads and ", tailsFinal, " tails");
                    break;
                }

                default: {
                    System.out.println("Please choose a number from 1-5");

                    break;
                }
            }

            headsFinal = (heads + headsFinal);
            tailsFinal = (tails + tailsFinal);
            total = (headsFinal + tailsFinal);
            heads = 0;
            tails = 0;
        } while (choice != 5);
    }

    public static boolean flip() {
        Random rnd = new Random();

        boolean flip = rnd.nextBoolean();

        return flip;
    }

}
