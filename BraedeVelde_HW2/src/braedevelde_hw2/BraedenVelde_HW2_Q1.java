/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package braedevelde_hw2;

/**
 *
 * @author velde
 */
import java.util.Scanner;
public class BraedenVelde_HW2_Q1 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        
   
   int encrypt;
    System.out.println("Input 4 digit integer to encrypt");
     
    encrypt = kbd.nextInt();
      
      
        
      int FirstNumber = (encrypt / 1000);
      int encrypt11 = ((FirstNumber + 7) % 10);
      
      
      int SecondNumber = (encrypt / 100);
      int encrypt21 = ((SecondNumber + 7) % 10);
      
      
      int ThirdNumber = (encrypt / 10);
      int encrypt31 = ((ThirdNumber + 7) % 10);
      
      
      int FourthNumber = (encrypt % 10);
      int encrypt41 = ((FourthNumber + 7) % 10);
      
      
   System.out.println("Your encrypted Number is: " + encrypt31 + encrypt41 + encrypt11 + encrypt21);
    System.out.print("Have a Great day!");
           
    }
}
