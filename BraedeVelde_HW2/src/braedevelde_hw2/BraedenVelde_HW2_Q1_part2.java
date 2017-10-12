/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package braedevelde_hw2;

import java.util.Scanner;

/**
 *
 * @author velde
 */
public class BraedenVelde_HW2_Q1_part2 {
        public static void main(String[] args) {
          Scanner kbd = new Scanner(System.in);
        
   
   int encrypt;
    System.out.println("Input 4 digit integer to decrypt");
     
    encrypt = kbd.nextInt();
     
      
        
      int FirstNumber = (encrypt / 1000);
      int encrypt11 = ((FirstNumber + 3) % 10);
      
      
      int SecondNumber = (encrypt / 100);
      int encrypt21 = ((SecondNumber + 3) % 10);
      
      
      int ThirdNumber = (encrypt / 10);
      int encrypt31 = ((ThirdNumber + 3) % 10);
      
      
      int FourthNumber = (encrypt % 10);
      int encrypt41 = ((FourthNumber + 3) % 10);
      
   System.out.println("Your decrypted Number is: " + encrypt31 + encrypt41 + encrypt11 + encrypt21);
    System.out.print("Have a Great day!");
           
    }
}


