/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

import java.util.Scanner;

/**
 *
 * @author fishc8155
 */
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 5 grades to find the average");
        
        double grade1 = input.nextDouble();
        double grade2 = input.nextDouble();
        double grade3 = input.nextDouble();
        double grade4 = input.nextDouble();
        double grade5 = input.nextDouble();
        
        // find average 
        double total = grade1 +  grade2 +  grade3 +  grade4 +  grade5;
         int average = (int)Math.ceil(total/5);
         
         System.out.println("The average of the 5 marks is "+average+"%");
        
  
        
        
        
        
    }
}
