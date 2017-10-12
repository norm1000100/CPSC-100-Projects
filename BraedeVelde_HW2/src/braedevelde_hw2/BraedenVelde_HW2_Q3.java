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
public class BraedenVelde_HW2_Q3 {
    public static void main(String[] args) {
      Scanner kbd = new Scanner(System.in);  
        System.out.println("Enter a valid Date(dd/mm/yyyy)");
        String Date = kbd.next();
         
         String Day = Date.substring(0,2);
         String Month = Date.substring(3,5);
         String Year = Date.substring(6,10);
         
         int Dayint = Integer.parseInt(Day);
         int Monthint  = Integer.parseInt(Month);
         int Yearint = Integer.parseInt(Year);
        
     System.out.print(Dayint);
         
    }
}
