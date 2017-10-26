/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package braeden.velde.hw.pkg3;

/**
 *
 * @author velde
 */
import java.util.Scanner;
public class BraedenVeldeHW3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    int residence , hours;
    String  pig , dog , snake , cat , hamster , fish , ant;
    Scanner kbd = new Scanner(System.in);
    
    
    System.out.printf("%s%n%s%n%s%n%s%n","Would you like to know which pet you should get?",
            "Then tell me what kind of residence you live in!","Choose 1, 2, or 3 from:","(1)House, (2)Apartment, or (3)Dormitory");
    residence = kbd.nextInt();
    if (residence == 1 || residence == 2 || residence == 3)
    {
        System.out.printf("%s%n%s%n%s%n", "Now tell me, How many hours are you home during the day?"
        , "Choose 1, 2, 3, 4, or 5 from:" , "(1)18 or more, (2)10-17, (3)8-9, (4)6-7, (5)0-5");
      hours = kbd.nextInt();
            if ( hours == 1 || hours == 2 || hours == 3 || hours == 4 || hours == 5)
    {if (residence == 1 && hours == 1)
        
        
        }
            else 
            {
                 System.out.println("Invalid number of hours chosen! Please choose a number between 1 and 5 from the selection");
            }
        System.out.print(hours);
            }
    else{
        System.out.println("Invalid residence choice!Please choose a number between 1 and 3");
    }
    
    }
}
