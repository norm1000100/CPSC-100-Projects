/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package braeden.velde.hw.pkg3;

import java.util.Scanner;

/**
 *
 * @author Cool__000
 */
public class Braedenvelde_Q2 {
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
                      animal7 = "ant farm";
    Scanner kbd = new Scanner(System.in);
    
    
    System.out.printf("%s%n%s%n%s%n%s%n","Would you like to know which pet you should get?",
            "Then tell me what kind of residence you live in!","Choose 1, 2, or 3 from:","(1)House, (2)Apartment, or (3)Dormitory");
    residence = kbd.nextInt();
    switch (residence)
    {
        case 1:
        case 2:
        case 3: {  
            System.out.printf("%s%n%s%n%s%n", "Now tell me, How many hours are you home during the day?"
        , "Choose 1, 2, 3, 4, or 5 from:" , "(1)18 or more, (2)10-17, (3)8-9, (4)6-7, (5)0-5");
      hours = kbd.nextInt();
      switch (hours)
      {
          case 1:
          case 2:
          case 3:
          case 4:
          case 5:
          {           
                  
      
        switch (residence)
        {
            case 1: {
                switch (hours)
                {
                    case 1: {System.out.println("You should get a" + animal1);
                    break;}
                    
                    case 2: {System.out.println("You should get a" + animal2);
                    break;}
                    
                    case 3: 
                    case 4:
                    case 5: {System.out.println("You should get a" + animal3);
                    break;}
                }
            }
            case 2: {
                switch (hours)
                {
                    case 1:
                    case 2: {System.out.println("You should get a" + animal4);
                    break;}
                    
                    case 3: 
                    case 4:
                    case 5: {System.out.println("You should get a" + animal5);
                    break;}
                }
            }
            case 3: {
                switch (hours)
                {
                    case 1: 
                    case 2:
                    case 3: 
                    case 4:{System.out.println("You should get a" + animal6);
                    break;}
                    
                    case 5: {System.out.println("You should get a" + animal7);
                    break;}
                }
            }
        }
          }
          default: 
          {
              System.out.println("Inavlid hour selection. Please choose from 1-5");
              break;
          }
        }
      
      }
        default: {
            System.out.println("Invalid Residence selection. Please pick from 1-3");
            break;
        }
        
        }    
 }   
}
