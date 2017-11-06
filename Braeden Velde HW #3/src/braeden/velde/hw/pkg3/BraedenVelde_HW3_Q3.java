/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package braeden.velde.hw.pkg3;

/**
 *
 * @author Cool__000
 */
import java.util.Scanner;
public class BraedenVelde_HW3_Q3 {
    
    public static void main(String[] args) {
        {
        int people,handshakes, TotalHandshakes;
        Scanner kbd = new Scanner(System.in);
        System.out.printf("%s%n%s%n%s%n%s%n%s%n","You have arrived at that party you've been waiting for all week!"
                ,"But a note on the door says any new arrivals must shake hands with everyone already inside!"
                ,"So, how many people are at the party?"
                ,"I will tell you how many hands will need to shaken"
                ,"So, tell me how many people you see.");
        
                people = kbd.nextInt();
                TotalHandshakes = 0;
                
                for (int i = people ; i > 0 ; ){//loop begins with i being the number of people at the party and ends when i has been decreased to zero or starts at or below zero.
                    
                   handshakes = (people - i) ;// subtracting i from the total # of people and looping until = 0
                   TotalHandshakes += handshakes;
                   --i;
                }
        System.out.println(TotalHandshakes);
        
    }
   }
    
    
}
