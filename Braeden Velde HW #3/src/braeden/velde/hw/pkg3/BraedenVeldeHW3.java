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
    String  animal1 , animal2 , animal3 , animal4 , animal5 , animal6 , animal7;
    animal1 = "pot-bellied pig";
            animal2 = "dog";
              animal3 = "snake";
                animal4 = "cat";
                  animal5 = "hamster";
                    animal6 = "fish";
                      animal7 = "ant farm";//each animal can be defined here and e used in the code
    Scanner kbd = new Scanner(System.in);
    
    
    System.out.printf("%s%n%s%n%s%n%s%n","Would you like to know which pet you should get?",
            "Then tell me what kind of residence you live in!","Choose 1, 2, or 3 from:","(1)House, (2)Apartment, or (3)Dormitory");
    residence = kbd.nextInt();//assigning the residences to be used in the if statement
    if (residence == 1 || residence == 2 || residence == 3)// If improper integer is chosen, the code will print an error
    {
        System.out.printf("%s%n%s%n%s%n", "Now tell me, How many hours are you home during the day?"
        , "Choose 1, 2, 3, 4, or 5 from:" , "(1)18 or more, (2)10-17, (3)8-9, (4)6-7, (5)0-5");
      hours = kbd.nextInt();//assigning the hour seletion
            if ( hours == 1 || hours == 2 || hours == 3 || hours == 4 || hours == 5)//if the hour selection is not between 1-5 the code will output an error message
    {
        if (residence == 1 && hours == 1)//all if statements check the assigned values for residence and hours
    {
        System.out.println("You should get a " + animal1);
        
    }
        
    
                else {
        if (residence == 1 && hours == 2)
        {
        System.out.println("You should get a " + animal2);    
        
        }
        
        else
        {
            if (residence == 1 && (hours == 3 || hours == 4 || hours == 5))
            {
                System.out.println("You should get a " + animal3);
                
            }
            
                else 
                {
                    if (residence == 2 && (hours == 1 || hours == 2 ))
                        {
                        System.out.println("You should get a " + animal4);
                        }
                            else 
                        {
                        if (residence == 2 &&(hours == 3 || hours == 4 || hours == 5))
                        {
                                System.out.println("You should get a " + animal5 );
                                
                                }
                        
                        
                        else
                        {
                        if (residence == 3 && (hours == 4 || hours == 3 || hours == 2 || hours == 1))
                        {
                        System.out.println("You should get a " + animal6);
                        }
                        else
                        {
                            if (residence == 3 && hours == 5)
                            {
                                System.out.println("You should get some an " + animal7 );
                            }
                        
                            
                       
                     }
                   }
                 }
              }
           }
        }
    }
        
            else 
            {
                 System.out.println("Invalid number of hours chosen! Please choose a number between 1 and 5");//error code for incorrect hours choice
            }   
    }
    else
    {
        System.out.println("Invalid residence choice! Please choose a number between 1 and 3");//error code for incorrect residence choice
    }
    
    
}
}
