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
public class BraedenVelde_HW2_Q2 {
 public static void main(String[] args) {
     Scanner kbd = new Scanner(System.in);
      double chocolate = 230;
    
   System.out.println("We will determine the number of chocolate bars required to maintain your weight!");
      
     System.out.println("Enter Gender (M/F)");
      String gender = kbd.next();
      
      if (gender.equals("M") || gender.equals("m"))
      {
          
     System.out.println("Enter Weight in pounds");
      double weight = kbd.nextDouble();
     System.out.println("Enter Height in inches");
      double height = kbd.nextDouble();
     System.out.println("Enter Age");
      int age = kbd.nextInt();
       
       
           System.out.println("The number of chocolate bars you will need to eat to maintain your weight is: " + 
                  ((66 + (6.3 * weight) + (12.9 * height) - (6.8 * age)) / 230));
       }
          else 
            
           if (gender.equals("F") || gender.equals("f"))
           {
                
      System.out.println("Enter Weight in pounds");
       double weight = kbd.nextDouble();
      System.out.println("Enter Height in inches");
       double height = kbd.nextDouble();
      System.out.println("Enter Age");
       int age = kbd.nextInt();
            
       System.out.printf("The number of chocolate bars you will need to eat to maintain your weight is: " +
               ((655 + (4.3 * weight) + (4.7 * height) - (4.7 * age)) / 230));
           }
       else
               System.out.print("Invalid Gender Entry!");
       
        
       
           
    
 }   
}
