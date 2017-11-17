/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BraedenVelde_HW4;

import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class BraedenVelde_HW4_Q4 {

    public static void main(String[] args) throws FileNotFoundException {

        System.out.println(EmployeePerf());
    }

   
    public static double EmployeePerf(int i, int j) throws FileNotFoundException {
        double[][] product = new double[6][5];

        File AllSales = new File("Sales_per_person.txt");
        Scanner All = new Scanner(AllSales);
        while (All.hasNext()) {
          int SalesPerson = All.nextInt()-1;
          int Item = All.nextInt()-1;
          double Total = All.nextDouble();
          product[SalesPerson][Item] += Total;
          product[SalesPerson][product[SalesPerson].length-1] += Total;
          product[product[Item].length-1][Item] += Total;

        }
        
             
return product[i][j];

    }
}
