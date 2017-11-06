/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package braeden.velde.hw.pkg3;

/**
 *
 * @author Cool_
 */
import java.util.Scanner;
public class BraedenVeldeHWQ4 {
    public static void main(String[] args) {
        
        
        int first,second, mainnumber;
        Scanner kbd = new Scanner(System.in);
        
        
        System.out.printf("%s%n","Enter a number for monotonic sequence verification ");
        
        mainnumber = kbd.nextInt();
        second = mainnumber % 10;
        first = mainnumber /10;
        if (second >= first)
        {
        for (int i=1 , y=1; first>second ; i *=10)
        {
          first =  mainnumber / i;
          second = mainnumber / (10 * i);
          
           
          
          System.out.print(mainnumber);
        }
        }
        else
        {
            System.out.print("error");
        }
    }
}
