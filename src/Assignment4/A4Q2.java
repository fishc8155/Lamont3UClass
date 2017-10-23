/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.util.Scanner;

/**
 *
 * @author fishc8155
 */
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {   
        // scanner for input
        Scanner input = new Scanner(System.in);
        // ask for first name
        System.out.println("Please enter your name");
         //type first name
        String firstName = input.nextLine();
        // ask for a measurement in inches
        System.out.println("Give me any measurement in inches");
        // give a measurement in inches
        
        //create double
        double inch = input.nextDouble();
        
        // calculate measurement
        double meters = 2.54 * inch;
        System.out.println(inch + "inches is the same as " + meters + "cm");
         
        
        
        
       
        
                
    }
}
