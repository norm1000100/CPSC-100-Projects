/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BraedenVelde_HW4;

import java.util.Scanner;
public class BraedenVelde_HW4_Q3 {
    public static void main(String[] args) {
        int input;
        Scanner kbd = new Scanner(System.in);
        System.out.println("Input a number to reverse (It has to be a positive integer)");
        input = kbd.nextInt();
        
        Reverse(input);
        
        System.out.println(Reverse(input));
        
    }
    public static int Reverse(int input) {
        int reverse;
        
        for (reverse = 0; input>0;){
            
            reverse = (input % 10 ) + (reverse * 10);
            input = input / 10;
        }
        
        return reverse;
        
        
    }
}
