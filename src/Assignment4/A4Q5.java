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
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create scanner
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter your name");
        String firstName = input.nextLine();
        // ask what test out of
        System.out.println("What was the first test out of?");
        double outOf = input.nextDouble();
        // ask user what mark they got
        System.out.println("What mark did you get?");
        double whatMark = input.nextDouble();
        System.out.println("What was the second test out of?");
        double outOf1 = input.nextDouble();
        System.out.println("What mark did you get?");
        double whatMark1 = input.nextDouble();
        System.out.println("What was the third test out of?");
        double outOf2 = input.nextDouble();
        System.out.println("What mark did you get?");
        double whatMark2 = input.nextDouble();
        System.out.println("What was the fourth test out of?");
        double outOf3 = input.nextDouble();
        System.out.println("What mark did you get?");
        double whatMark3 = input.nextDouble();
        System.out.println("What was the fifth test out of?");
        double outOf4 = input.nextDouble();
        System.out.println("What mark did you get?");
        double whatMark4 = input.nextDouble();
        //Get percentages
        double total = whatMark/outOf*100;
        System.out.println("Your mark on the first test was "+total);
        
        double totalOne = whatMark1/outOf1*100;
        System.out.println("Your mark on the second test was "+totalOne);
        
        double totalTwo = whatMark2/outOf2*100;
        System.out.println("Your mark on the third test was "+totalTwo);
        
        double totalThree = whatMark3/outOf3*100;
        System.out.println("Your mark on the fourth test was "+totalThree);
        
        double totalFour = whatMark4/outOf3*100;
        System.out.println("Your mark on the fifth test was "+totalFour);
        
        
        
        
    }
}
