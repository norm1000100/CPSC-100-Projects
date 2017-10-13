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
         
         
         
         if (Dayint > 31)
         {
             System.out.println("Invalid Day Range");}
         else
             
         if (Monthint > 12)
         {
             System.out.println("Invalid Month Range");
         }
         else
             
        if (Yearint > 9999 || Yearint < 0)
        {
            System.out.println("Invalid Year Range");
        }
         else
            
         switch(Monthint){
             
             case 2:
             if (Dayint == 29)
             {
                     if ((Yearint % 400 ==0) || ((Yearint % 4 == 0) && (Yearint / 100 != 0 )));
             
                 else
             {
                     System.out.println("Not a leap year, Therefore 29 is an invalid day");
                 break;
                 }}
             else  
                         
             {
             if ((Dayint >= 1) && (Dayint <= 28));
                        
                  else
                 {
                   System.out.println("Invalid Day range for Feb."); 
                   break;
                 }
                break; 
             }
             
             
             
             case 1:
             case 3:
             case 5:
             case 7:
             case 8:
             case 10:
             case 12:
                   if (Dayint >= 1 && Dayint <= 31);
                    
                    else
                   {
                       System.out.println("Invalid Day range");
                   break;
                   }
             case 4:
             case 6:
             case 9:
             case 11:
                 if (Dayint >= 1 && Dayint <= 30);
                     else
                 {
                     System.out.println("Invalid Day range");
                 break;
                 }             
                               
                       
             default: System.out.println("Valid Date entry!");
                     }
         
           
    
    
    }
    
}
